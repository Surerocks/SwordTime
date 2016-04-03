
public class ActionAnimationEvent {
	private Person person;
	private Action action;
	
	public ActionAnimationEvent(Person person, Action action){
		this.person = person;
		this.action = action;
	}
	
	public Person getPerson(){
		return person;
	}
	
	public Action getAction(){
		return action;
	}
}
