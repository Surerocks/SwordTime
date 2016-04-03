import java.awt.Image;

public class Person {
	
	
	private Stance stance;
	private Action previousAction;
	private boolean clear;
	private Image image;
	
	public Person(Stance stance, Image im){
		this.stance = stance;
		this.previousAction = null;
		this.image = im;
	}
	
	public Stance getStance(){
		return stance;
	}
	
	public boolean getClear(){
		return clear;
	}
	
	public Image getImage(){
		return image;
	}
	
	public void setImage(Image image){
		this.image = image;
		System.out.println("Image: " + image);
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
	
	public String toString(){
		return "Person";
	}
	
}
