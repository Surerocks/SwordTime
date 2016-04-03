
public class Board {
	
	private Person leftPerson;
	private Person rightPerson;
	private Person[] board;

	
	public boolean checkAdjacent(){
		return (getLeftPosition() + 1 == getRightPosition());
	}

	public int getLeftPosition(){
		for(int i = 0; i < board.length; i++){
			if(board[i] == leftPerson){
				return i;
			}
		}
		return -1;
	}
	
	public int getRightPosition(){
		for(int i = 0; i < board.length; i++){
			if(board[i] == rightPerson){
				return i;
			}
		}
		return -1;
	}
	
	public int getPosition(Person person){
		for(int i = 0; i < board.length; i++){
			if(board[i] == person){
				return i;
			}
		}
		return -1;
	}
	
	public boolean canMoveRight(Person person){
		if(board.length -1 == getPosition(person)){
			return false;
		}
		if(board[getPosition(person)+1]!=null){
			return false;
		}
		return true;
	}
	public boolean canMoveLeft(Person person){
		if(0 == getPosition(person)){
			return false;
		}
		if(board[getPosition(person)-1]!=null){
			return false;
		}
		return true;
	}
	
	/**
	 * Must check valid move first
	 * @param person
	 */
	public void movePersonLeft(Person person){
		board[getPosition(person) -1] = person;
		board[getPosition(person)] = null;
	}
	/**
	 * Must check valid move first
	 * @param person
	 */
	public void movePersonRight(Person person){
		board[getPosition(person) +1] = person;
		board[getPosition(person)] = null;
	}
	
}
