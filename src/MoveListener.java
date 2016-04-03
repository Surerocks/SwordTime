import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MoveListener implements KeyListener{
	
	private Game game;
	
	private Action[] leftActions;
	private Action[] rightActions;
	
	public MoveListener(Game game){
		this.game = game;
		resetActions();
	}
	
	private void resetActions(){
		leftActions = new Action[2];
		rightActions = new Action[2];
		for(int i=0;i<2;i++){
			leftActions[i] = null;
			rightActions[i] = null;
		}
	}

	public void keyPressed(KeyEvent arg0) {
		
	}

	public void keyReleased(KeyEvent arg0) {
		
	}

	public void keyTyped(KeyEvent arg0) {
		char c = arg0.getKeyChar();
		c = Character.toLowerCase(c);
		System.out.println("Char pressed: " + c);
		if(!getActionFromChar(c)){
			// TODO notify user of invalid action
		} else {
			System.out.println("Got action: " + leftActions[0] + leftActions[1] + rightActions[0] + rightActions[1]);
			if(leftActions[0] != null && leftActions[1] != null &&
					rightActions[0] != null && rightActions[1] != null){
				Move m1 = new Move(leftActions[0],leftActions[1],game.getLeftPlayer());
				Move m2 = new Move(rightActions[0],rightActions[1],game.getRightPlayer());
				game.executeMoves(m1, m2);
				resetActions();
			}
		}
		
	}
	
	private boolean getActionFromChar(char c){
		switch(c){
		case 'q':
			if(game.isValidAction(Action.ATTACK, game.getLeftPlayer())){
				if(leftActions[0] == null){
					leftActions[0] = Action.ATTACK;
					return true;
				} else if (leftActions[0] != Action.ATTACK && leftActions[0] != Action.BLOCK) {
					leftActions[1] = Action.ATTACK;
					return true;
				}
			}
			return false;
			
		case 'w':
			if(game.isValidAction(Action.ABOVE, game.getLeftPlayer())){
				if(leftActions[0] == null){
					leftActions[0] = Action.ABOVE;
				} else {
					leftActions[1] = Action.ABOVE;
				}
				return true;
			}
			return false;
			
		case 'e':
			if(game.isValidAction(Action.BLOCK, game.getLeftPlayer())){
				if(leftActions[0] == null){
					leftActions[0] = Action.BLOCK;
					return true;
				} else if (leftActions[0] != Action.ATTACK && leftActions[0] != Action.BLOCK) {
					leftActions[1] = Action.BLOCK;
					return true;
				}
			}
			return false;
			
		case 'a':
			if(game.isValidAction(Action.MOVE_LEFT, game.getLeftPlayer())){
				if(leftActions[0] == null){
					leftActions[0] = Action.MOVE_LEFT;
				} else {
					leftActions[1] = Action.MOVE_LEFT;
				}
				return true;
			}
			return false;
			
		case 's':
			if(game.isValidAction(Action.NEUTRAL, game.getLeftPlayer())){
				if(leftActions[0] == null){
					leftActions[0] = Action.NEUTRAL;
				} else {
					leftActions[1] = Action.NEUTRAL;
				}
				return true;
			}
			return false;
			
		case 'd':
			if(game.isValidAction(Action.MOVE_RIGHT, game.getLeftPlayer())){
				if(leftActions[0] == null){
					leftActions[0] = Action.MOVE_RIGHT;
				} else {
					leftActions[1] = Action.MOVE_RIGHT;
				}
				return true;
			}
			return false;
			
		case 'z':
			if(game.isValidAction(Action.WAIT, game.getLeftPlayer())){
				if(leftActions[0] == null){
					leftActions[0] = Action.WAIT;
				} else {
					leftActions[1] = Action.WAIT;
				}
				return true;
			}
			return false;
			
		case 'x':
			if(game.isValidAction(Action.UNDER, game.getLeftPlayer())){
				if(leftActions[0] == null){
					leftActions[0] = Action.UNDER;
				} else {
					leftActions[1] = Action.UNDER;
				}
				return true;
			}
			return false;
			
			
		// Right player
		case 'u':
			if(game.isValidAction(Action.ATTACK, game.getRightPlayer())){
				if(rightActions[0] == null){
					rightActions[0] = Action.ATTACK;
					return true;
				} else if (rightActions[0] != Action.ATTACK && rightActions[0] != Action.BLOCK) {
					rightActions[1] = Action.ATTACK;
					return true;
				}
			}
			return false;
			
		case 'i':
			if(game.isValidAction(Action.ABOVE, game.getRightPlayer())){
				if(rightActions[0] == null){
					rightActions[0] = Action.ABOVE;
				} else {
					rightActions[1] = Action.ABOVE;
				}
				return true;
			}
			return false;
			
		case 'o':
			if(game.isValidAction(Action.BLOCK, game.getRightPlayer())){
				if(rightActions[0] == null){
					rightActions[0] = Action.BLOCK;
					return true;
				} else if (rightActions[0] != Action.ATTACK && rightActions[0] != Action.BLOCK) {
					rightActions[1] = Action.BLOCK;
					return true;
				}
			}
			return false;
			
		case 'j':
			if(game.isValidAction(Action.MOVE_LEFT, game.getRightPlayer())){
				if(rightActions[0] == null){
					rightActions[0] = Action.MOVE_LEFT;
				} else {
					rightActions[1] = Action.MOVE_LEFT;
				}
				return true;
			}
			return false;
			
		case 'k':
			if(game.isValidAction(Action.NEUTRAL, game.getRightPlayer())){
				if(rightActions[0] == null){
					rightActions[0] = Action.NEUTRAL;
				} else {
					rightActions[1] = Action.NEUTRAL;
				}
				return true;
			}
			return false;
			
		case 'l':
			if(game.isValidAction(Action.MOVE_RIGHT, game.getRightPlayer())){
				if(rightActions[0] == null){
					rightActions[0] = Action.MOVE_RIGHT;
				} else {
					rightActions[1] = Action.MOVE_RIGHT;
				}
				return true;
			}
			return false;
			
		case 'n':
			if(game.isValidAction(Action.WAIT, game.getRightPlayer())){
				if(rightActions[0] == null){
					rightActions[0] = Action.WAIT;
				} else {
					rightActions[1] = Action.WAIT;
				}
				return true;
			}
			return false;
			
		case 'm':
			if(game.isValidAction(Action.UNDER, game.getRightPlayer())){
				if(rightActions[0] == null){
					rightActions[0] = Action.UNDER;
				} else {
					rightActions[1] = Action.UNDER;
				}
				return true;
			}
			return false;
			
		}
		return false;
	}

}
