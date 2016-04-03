
public class Person {
	
	
	private Stance stance;
	private Action previousAction;
	private boolean clear;
	
	public Person(Stance stance){
		this.stance = stance;
		this.previousAction = null;
	}
	
	public Stance getStance(){
		return stance;
	}
	
	public boolean getClear(){
		return clear;
	}
	
	public void setClear(boolean clear){
		this.clear = clear;
	}
	
	public Action getPreviousAction(){
		return previousAction;
	}
	
	public void setPreviousAction(Action action){
		this.previousAction = action;
	}
	
	public void changeStance(Stance newStance){
		stance = newStance;
	}
	
	public boolean isCurrentStance(Stance stance){
		return this.stance == stance;
	}
	
}
