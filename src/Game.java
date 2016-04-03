import java.util.ArrayList;
import java.util.List;

public class Game {
	
	private Person leftPlayer;
	private Person rightPlayer;
	private Board board;
	private boolean attacking;
	private boolean gameOver;
	private Person winner;
	
	public List<Action> generateAllActions(Person person){
		ArrayList<Action> actions = new ArrayList<Action>();
		Action[] allValues = Action.values();
		for(Action a : allValues){
			if(isValidAction(a,person)){
				actions.add(a);
			}
		}
		return actions;
	}
	

	
	public boolean isValidAction(Action action, Person person){
		switch (action) {
			
		case ATTACK:
			return person.getPreviousAction() == null;
			
		case BLOCK:
			return person.getPreviousAction() == null;
			
		case MOVE_LEFT:
			return board.canMoveLeft(person);
			
		case MOVE_RIGHT:
			return board.canMoveRight(person);
			
		case WAIT:
			return true;
			
		case ABOVE:
			return !person.isCurrentStance(Stance.ABOVE);
			
		case NEUTRAL:
			return !person.isCurrentStance(Stance.NEUTRAL);
			
		case UNDER:
			return !person.isCurrentStance(Stance.UNDER);
			
		}
		return false;
	}
	
	private Action determineFirstAction(Action a1, Action a2){
		if(a1 == Action.MOVE_LEFT || a1 == Action.MOVE_RIGHT){
			return a1;
		} else if (a2 == Action.MOVE_LEFT || a2 == Action.MOVE_RIGHT){
			return a2;
		}
		
		if(a1 == Action.BLOCK){
			return a1;
		} else if (a2 == Action.BLOCK){
			return a2;
		}
		return a1;
	}
	
	public void executeMoves(Move move1, Move move2){
		Person p1 = move1.getPerson();
		Person p2 = move2.getPerson();
		Action[] a1 = move1.getActions();
		Action[] a2 = move2.getActions();
		// Clear the action at the appropriate time
		p1.setClear(true);
		p2.setClear(true);
		// Check which action should go first, then execute the actions
		for (int i = 0; i < a1.length; i++) {
			if (!isValidAction(a1[i], p1)) {
				a1[i] = Action.WAIT;
			}
			if (!isValidAction(a2[i], p2)) {
				a2[i] = Action.WAIT;
			}
			if (determineFirstAction(a1[i], a2[i]) == a1[i]) {
				executeAction(a1[i],p1);
				executeAction(a2[i],p2);
			} else {
				executeAction(a2[i],p2);
				executeAction(a1[i],p1);
			}
			// Resolve attacks / blocks
			if(attacking){
				resolveAttack(a1[i],a2[i],p1,p2);
				if(gameOver){
					// TODO Handle end of game
				}
			}
			
		}
		// Clear the previous actions if appropriate
		if(p1.getClear()){
			p1.setPreviousAction(null);
		}
		if(p2.getClear()){
			p2.setPreviousAction(null);
		}
		

	}
	
	public void executeAction(Action action, Person person){
		switch (action) {
		
		case ATTACK:
			// Attack other player
			if(board.checkAdjacent()){
				attacking = true;
			}
			// TODO Play animation
			person.setPreviousAction(Action.ATTACK);
			person.setClear(false);
			
		case BLOCK:
			// TODO Play animation
			person.setPreviousAction(Action.BLOCK);
			person.setClear(false);
			// TODO If block was successful, clear action
			
		case MOVE_LEFT:
			board.movePersonLeft(person);
			// TODO Play animation
			
		case MOVE_RIGHT:
			board.movePersonRight(person);
			// TODO Play animation
			
		case WAIT:
			
			
		case ABOVE:
			person.changeStance(Stance.ABOVE);
			// TODO Play animation
			
		case NEUTRAL:
			person.changeStance(Stance.NEUTRAL);
			// TODO Play animation
			
		case UNDER:
			person.changeStance(Stance.UNDER);
			// TODO Play animation
			
		}
	}
	
	private void resolveAttack(Action a1, Action a2, Person p1, Person p2){
		if(a1 == Action.ATTACK && a2 == Action.ATTACK){
			if(p1.getStance() == p2.getStance()){
				if(p1 == leftPlayer){
					if(board.canMoveLeft(p1)){
						board.movePersonLeft(p1);
					}
					if(board.canMoveRight(p2)){
						board.movePersonRight(p2);
					}
				} else {
					if(board.canMoveLeft(p2)){
						board.movePersonLeft(p2);
					}
					if(board.canMoveRight(p1)){
						board.movePersonRight(p1);
					}
				}
			} else if(p1.getStance() == Stance.ABOVE){
				if(p2.getStance() == Stance.NEUTRAL){
					gameOver = true;
					winner = p1;
				} else {
					gameOver = true;
					winner = p2;
				}
			} else if(p1.getStance() == Stance.NEUTRAL){
				if(p2.getStance() == Stance.ABOVE){
					gameOver = true;
					winner = p2;
				} else {
					gameOver = true;
					winner = p1;
				}
			} else {
				if(p2.getStance() == Stance.NEUTRAL){
					gameOver = true;
					winner = p2;
				} else {
					gameOver = true;
					winner = p1;
				}
			}
		} else if (a1 == Action.ATTACK && a2 != Action.BLOCK){
			gameOver = true;
			winner = p1;
		} else if (a2 == Action.ATTACK && a1 != Action.BLOCK){
			gameOver = true;
			winner = p2;
		} else if (a1 == Action.ATTACK){
			if(p1.getStance() == p2.getStance()){
				gameOver = true;
				winner = p1;
			} else if(p1.getStance() == Stance.ABOVE){
				if(p2.getStance() == Stance.NEUTRAL){
					gameOver = true;
					winner = p2;
				} else {
					gameOver = true;
					winner = p1;
				}
			} else if(p1.getStance() == Stance.NEUTRAL){
				if(p2.getStance() == Stance.ABOVE){
					gameOver = true;
					winner = p1;
				} else {
					gameOver = true;
					winner = p2;
				}
			} else {
				if(p2.getStance() == Stance.NEUTRAL){
					gameOver = true;
					winner = p1;
				} else {
					gameOver = true;
					winner = p2;
				}
			}
		} else if (a2 == Action.ATTACK && p1.getStance() == p2.getStance()){
			if(p1.getStance() == p2.getStance()){
				gameOver = true;
				winner = p2;
			} else if(p1.getStance() == Stance.ABOVE){
				if(p2.getStance() == Stance.NEUTRAL){
					gameOver = true;
					winner = p2;
				} else {
					gameOver = true;
					winner = p1;
				}
			} else if(p1.getStance() == Stance.NEUTRAL){
				if(p2.getStance() == Stance.ABOVE){
					gameOver = true;
					winner = p1;
				} else {
					gameOver = true;
					winner = p2;
				}
			} else {
				if(p2.getStance() == Stance.NEUTRAL){
					gameOver = true;
					winner = p1;
				} else {
					gameOver = true;
					winner = p2;
				}
			}
		}
	}
	

}
