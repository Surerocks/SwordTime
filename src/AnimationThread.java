import java.awt.Image;
import java.util.ArrayList;

import javax.swing.JPanel;

public class AnimationThread {
	
	private Action action;
	private Person person;
	private boolean left;
	private MainUI ui;
	
	public AnimationThread(MainUI ui, Action action, Person person, boolean left){
		this.action = action;
		this.ui = ui;
		this.person = person;
		this.left = left;
	}
	
	public void run(){
		ArrayList<Image> animation = new ArrayList<Image>();
		
		switch (action) {
		
		case ATTACK:
			switch (person.getStance()){
			case ABOVE:
				animation = (left) ? Animation.leftAboveAttack : Animation.rightAboveAttack;
				break;
			case NEUTRAL:
				animation = (left) ? Animation.leftNeutralAttack : Animation.rightNeutralAttack;
				break;
			case UNDER:
				animation = (left) ? Animation.leftUnderAttack : Animation.rightUnderAttack;
				break;
			
			}
			break;
			
		case BLOCK:
			switch (person.getStance()){
			case ABOVE:
				animation = (left) ? Animation.leftAboveBlock : Animation.rightAboveBlock;
				break;
			case NEUTRAL:
				animation = (left) ? Animation.leftNeutralBlock : Animation.rightNeutralBlock;
				break;
			case UNDER:
				animation = (left) ? Animation.leftUnderBlock : Animation.rightUnderBlock;
				break;
			
			}
			break;
			
		case ABOVE:
			switch (person.getStance()){
			case ABOVE:
				return;
			case NEUTRAL:
				animation = (left) ? Animation.leftAboveNeutral : Animation.rightAboveNeutral;
				break;
			case UNDER:
				animation = (left) ? Animation.leftAboveUnder : Animation.rightAboveUnder;
				break;
			
			}
			break;
			
		case NEUTRAL:
			switch (person.getStance()){
			case ABOVE:
				animation = (left) ? Animation.leftNeutralAbove : Animation.rightNeutralAbove;
				break;
			case NEUTRAL:
				return;
			case UNDER:
				animation = (left) ? Animation.leftNeutralUnder : Animation.rightNeutralUnder;
				break;
			
			}
			break;
			
		case UNDER:
			switch (person.getStance()){
			case ABOVE:
				animation = (left) ? Animation.leftUnderAbove : Animation.rightUnderAbove;
				break;
			case NEUTRAL:
				animation = (left) ? Animation.leftUnderNeutral : Animation.rightUnderNeutral;
				break;
			case UNDER:
				return;
			
			}
			break;
			
		case WAIT:
			animation.add(person.getImage());
			break;
		}
		
		person.setImage(animation.get(animation.size()-1));
		ui.updateUI();
		
//		// Run through the images
//		for(Image i : animation){
//			person.setImage(i);
//			ui.updateUI();
////			try {
////				Thread.sleep(100);
////			} catch (InterruptedException e) {
////				e.printStackTrace();
////			}
//		}
		
		
			
	}
}
