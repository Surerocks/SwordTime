
public class Person {
	private int position;
	private enum Stance { ABOVE, NEUTRAL, UNDER };
	
	private Stance stance;
	
	public Person(int position, Stance stance){
		this.position = position;
		this.stance = stance;
	}
	
	public boolean isValidMove(Move m){
		// TODO Determine if move is valid
		
		return true;
	}
	
}
