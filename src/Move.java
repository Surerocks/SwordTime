
public class Move {

	private Action[] actions;
	private Person person;
	
	public Move(Action action1, Action action2, Person person){
		actions = new Action[2];
		actions[0] = action1;
		actions[1] = action2;
		this.person = person;
	}
	
}
