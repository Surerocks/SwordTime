
public class GameOverEvent {
	private Person winner;
	
	public GameOverEvent(Person winner){
		this.winner = winner;
	}
	
	public Person getWinner(){
		return winner;
	}
}
