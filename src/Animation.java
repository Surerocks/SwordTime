import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Animation {
	public static ArrayList<Image> leftUnderNeutral	= new ArrayList<Image>();
	public static ArrayList<Image> leftUnderAbove 	= new ArrayList<Image>();
	public static ArrayList<Image> leftAboveNeutral 	= new ArrayList<Image>();
	public static ArrayList<Image> leftAboveUnder 	= new ArrayList<Image>();
	public static ArrayList<Image> leftNeutralUnder 	= new ArrayList<Image>();
	public static ArrayList<Image> leftNeutralAbove 	= new ArrayList<Image>();
	public static ArrayList<Image> leftAboveAttack 	= new ArrayList<Image>();
	public static ArrayList<Image> leftAboveBlock 	= new ArrayList<Image>();
	public static ArrayList<Image> leftNeutralAttack 	= new ArrayList<Image>();
	public static ArrayList<Image> leftNeutralBlock 	= new ArrayList<Image>();
	public static ArrayList<Image> leftUnderBlock 	= new ArrayList<Image>();
	public static ArrayList<Image> leftUnderAttack 	= new ArrayList<Image>();
	
	public static ArrayList<Image> rightUnderNeutral	= new ArrayList<Image>();
	public static ArrayList<Image> rightUnderAbove 	= new ArrayList<Image>();
	public static ArrayList<Image> rightAboveNeutral 	= new ArrayList<Image>();
	public static ArrayList<Image> rightAboveUnder 	= new ArrayList<Image>();
	public static ArrayList<Image> rightNeutralUnder 	= new ArrayList<Image>();
	public static ArrayList<Image> rightNeutralAbove 	= new ArrayList<Image>();
	public static ArrayList<Image> rightAboveAttack 	= new ArrayList<Image>();
	public static ArrayList<Image> rightAboveBlock 	= new ArrayList<Image>();
	public static ArrayList<Image> rightNeutralAttack = new ArrayList<Image>();
	public static ArrayList<Image> rightNeutralBlock 	= new ArrayList<Image>();
	public static ArrayList<Image> rightUnderBlock 	= new ArrayList<Image>();
	public static ArrayList<Image> rightUnderAttack 	= new ArrayList<Image>();
	
	public Animation ()
	{
		try {
			// Animations for under to neutral stance left and right
			System.out.println("Hi");
			URL url = this.getClass().getResource("resources/neutral00.png");
			System.out.println(url);
		    leftUnderNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-neutral-change0.png").toURI())));
		    leftUnderNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-neutral-change1.png").toURI())));
		    leftUnderNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-neutral-change2.png").toURI())));
		    leftUnderNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-neutral-change3.png").toURI())));
		    leftUnderNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-neutral-change4.png").toURI())));
		    leftUnderNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-neutral-change5.png").toURI())));
		    leftUnderNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-neutral-change6.png").toURI())));
		    
		    leftNeutralUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-neutral-change6.png").toURI())));
		    leftNeutralUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-neutral-change5.png").toURI())));
		    leftNeutralUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-neutral-change4.png").toURI())));
		    leftNeutralUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-neutral-change3.png").toURI())));
		    leftNeutralUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-neutral-change2.png").toURI())));
		    leftNeutralUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-neutral-change1.png").toURI())));
		    leftNeutralUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-neutral-change0.png").toURI())));
		    
		    rightUnderNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-neutral-change-right0.png").toURI())));
		    rightUnderNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-neutral-change-right1.png").toURI())));
		    rightUnderNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-neutral-change-right2.png").toURI())));
		    rightUnderNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-neutral-change-right3.png").toURI())));
		    rightUnderNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-neutral-change-right4.png").toURI())));
		    rightUnderNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-neutral-change-right5.png").toURI())));
		    rightUnderNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-neutral-change-right6.png").toURI())));
		    
		    rightNeutralUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-neutral-change-right6.png").toURI())));
		    rightNeutralUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-neutral-change-right5.png").toURI())));
		    rightNeutralUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-neutral-change-right4.png").toURI())));
		    rightNeutralUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-neutral-change-right3.png").toURI())));
		    rightNeutralUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-neutral-change-right2.png").toURI())));
		    rightNeutralUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-neutral-change-right1.png").toURI())));
		    rightNeutralUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-neutral-change-right0.png").toURI())));
		    
		    // Animations for neutral to above left and right
		    leftNeutralAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-above-change0.png").toURI())));
		    leftNeutralAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-above-change1.png").toURI())));
		    leftNeutralAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-above-change2.png").toURI())));
		    leftNeutralAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-above-change3.png").toURI())));
		    leftNeutralAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-above-change4.png").toURI())));
		    leftNeutralAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-above-change5.png").toURI())));
		    leftNeutralAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-above-change6.png").toURI())));
		    leftNeutralAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-above-change7.png").toURI())));
		    leftNeutralAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-above-change8.png").toURI())));
		    
		    leftAboveNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-above-change8.png").toURI())));
		    leftAboveNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-above-change7.png").toURI())));
		    leftAboveNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-above-change6.png").toURI())));
		    leftAboveNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-above-change5.png").toURI())));
		    leftAboveNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-above-change4.png").toURI())));
		    leftAboveNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-above-change3.png").toURI())));
		    leftAboveNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-above-change2.png").toURI())));
		    leftAboveNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-above-change1.png").toURI())));
		    leftAboveNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-above-change0.png").toURI())));
		    
		    rightNeutralAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-above-change-right0.png").toURI())));
		    rightNeutralAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-above-change-right1.png").toURI())));
		    rightNeutralAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-above-change-right2.png").toURI())));
		    rightNeutralAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-above-change-right3.png").toURI())));
		    rightNeutralAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-above-change-right4.png").toURI())));
		    rightNeutralAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-above-change-right5.png").toURI())));
		    rightNeutralAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-above-change-right6.png").toURI())));
		    rightNeutralAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-above-change-right7.png").toURI())));
		    rightNeutralAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-above-change-right8.png").toURI())));
		    
		    rightAboveNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-above-change-right8.png").toURI())));
		    rightAboveNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-above-change-right7.png").toURI())));
		    rightAboveNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-above-change-right6.png").toURI())));
		    rightAboveNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-above-change-right5.png").toURI())));
		    rightAboveNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-above-change-right4.png").toURI())));
		    rightAboveNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-above-change-right3.png").toURI())));
		    rightAboveNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-above-change-right2.png").toURI())));
		    rightAboveNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-above-change-right1.png").toURI())));
		    rightAboveNeutral.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-above-change-right0.png").toURI())));
		    
		    //Animations for Above to Under left and right
		    leftAboveUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-under-change00.png").toURI())));
		    leftAboveUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-under-change01.png").toURI())));
		    leftAboveUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-under-change02.png").toURI())));
		    leftAboveUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-under-change03.png").toURI())));
		    leftAboveUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-under-change04.png").toURI())));
		    leftAboveUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-under-change05.png").toURI())));
		    leftAboveUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-under-change06.png").toURI())));
		    leftAboveUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-under-change07.png").toURI())));
		    leftAboveUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-under-change08.png").toURI())));
		    leftAboveUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-under-change09.png").toURI())));
		    leftAboveUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-under-change10.png").toURI())));
		    
		    leftUnderAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-under-change10.png").toURI())));
		    leftUnderAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-under-change09.png").toURI())));
		    leftUnderAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-under-change08.png").toURI())));
		    leftUnderAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-under-change07.png").toURI())));
		    leftUnderAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-under-change06.png").toURI())));
		    leftUnderAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-under-change05.png").toURI())));
		    leftUnderAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-under-change04.png").toURI())));
		    leftUnderAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-under-change03.png").toURI())));
		    leftUnderAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-under-change02.png").toURI())));
		    leftUnderAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-under-change01.png").toURI())));
		    leftUnderAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-under-change00.png").toURI())));
		    
		    rightAboveUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-under-change-right00.png").toURI())));
		    rightAboveUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-under-change-right01.png").toURI())));
		    rightAboveUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-under-change-right02.png").toURI())));
		    rightAboveUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-under-change-right03.png").toURI())));
		    rightAboveUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-under-change-right04.png").toURI())));
		    rightAboveUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-under-change-right05.png").toURI())));
		    rightAboveUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-under-change-right06.png").toURI())));
		    rightAboveUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-under-change-right07.png").toURI())));
		    rightAboveUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-under-change-right08.png").toURI())));
		    rightAboveUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-under-change-right09.png").toURI())));
		    rightAboveUnder.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-under-change-right10.png").toURI())));
		    
		    rightUnderAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-under-change-right10.png").toURI())));
		    rightUnderAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-under-change-right09.png").toURI())));
		    rightUnderAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-under-change-right08.png").toURI())));
		    rightUnderAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-under-change-right07.png").toURI())));
		    rightUnderAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-under-change-right06.png").toURI())));
		    rightUnderAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-under-change-right05.png").toURI())));
		    rightUnderAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-under-change-right04.png").toURI())));
		    rightUnderAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-under-change-right03.png").toURI())));
		    rightUnderAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-under-change-right02.png").toURI())));
		    rightUnderAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-under-change-right01.png").toURI())));
		    rightUnderAbove.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-under-change-right00.png").toURI())));
		    
		    // Above Attack and Block Left and Right
		    
		    leftAboveAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-strike0.png").toURI())));
		    leftAboveAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-strike1.png").toURI())));
		    leftAboveAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-strike2.png").toURI())));
		    leftAboveAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-strike3.png").toURI())));
		    
		    rightAboveAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-strike-right0.png").toURI())));
		    rightAboveAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-strike-right1.png").toURI())));
		    rightAboveAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-strike-right2.png").toURI())));
		    rightAboveAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-strike-right3.png").toURI())));
		    
		    leftAboveBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-block00.png").toURI())));
		    leftAboveBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-block01.png").toURI())));
		    leftAboveBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-block02.png").toURI())));
		    leftAboveBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-block03.png").toURI())));
		    leftAboveBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-block04.png").toURI())));
		    leftAboveBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-block05.png").toURI())));
		    leftAboveBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-block06.png").toURI())));
		    leftAboveBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-block07.png").toURI())));
		    leftAboveBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-block08.png").toURI())));
		    leftAboveBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-block09.png").toURI())));
		    leftAboveBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-block10.png").toURI())));
		    leftAboveBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/above-block11.png").toURI())));
		    
		    rightAboveBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-block-right00.png").toURI())));
		    rightAboveBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-block-right01.png").toURI())));
		    rightAboveBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-block-right02.png").toURI())));
		    rightAboveBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-block-right03.png").toURI())));
		    rightAboveBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-block-right04.png").toURI())));
		    rightAboveBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-block-right05.png").toURI())));
		    rightAboveBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-block-right06.png").toURI())));
		    rightAboveBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-block-right07.png").toURI())));
		    rightAboveBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-block-right08.png").toURI())));
		    rightAboveBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-block-right09.png").toURI())));
		    rightAboveBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-block-right10.png").toURI())));
		    rightAboveBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/above-block-right11.png").toURI())));
		    
		    // Animate Neutral Attack Block Left Right
		    leftNeutralAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-attack0.png").toURI())));
		    leftNeutralAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-attack1.png").toURI())));
		    leftNeutralAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-attack2.png").toURI())));
		    leftNeutralAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-attack3.png").toURI())));
		    leftNeutralAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-attack4.png").toURI())));
		    leftNeutralAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-attack5.png").toURI())));
		    leftNeutralAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-attack6.png").toURI())));
		    leftNeutralAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-attack7.png").toURI())));
		    leftNeutralAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-attack8.png").toURI())));
		    
		    rightNeutralAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-attack-right0.png").toURI())));
		    rightNeutralAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-attack-right1.png").toURI())));
		    rightNeutralAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-attack-right2.png").toURI())));
		    rightNeutralAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-attack-right3.png").toURI())));
		    rightNeutralAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-attack-right4.png").toURI())));
		    rightNeutralAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-attack-right5.png").toURI())));
		    rightNeutralAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-attack-right6.png").toURI())));
		    rightNeutralAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-attack-right7.png").toURI())));
		    rightNeutralAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-attack-right8.png").toURI())));
		    
		    leftNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-block00.png").toURI())));
		    leftNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-block01.png").toURI())));
		    leftNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-block02.png").toURI())));
		    leftNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-block03.png").toURI())));
		    leftNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-block04.png").toURI())));
		    leftNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-block05.png").toURI())));
		    leftNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-block06.png").toURI())));
		    leftNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-block07.png").toURI())));
		    leftNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-block08.png").toURI())));
		    leftNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-block09.png").toURI())));
		    leftNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-block10.png").toURI())));
		    leftNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-block11.png").toURI())));
		    leftNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/neutral-block12.png").toURI())));
		    
		    rightNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-block-right00.png").toURI())));
		    rightNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-block-right01.png").toURI())));
		    rightNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-block-right02.png").toURI())));
		    rightNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-block-right03.png").toURI())));
		    rightNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-block-right04.png").toURI())));
		    rightNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-block-right05.png").toURI())));
		    rightNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-block-right06.png").toURI())));
		    rightNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-block-right07.png").toURI())));
		    rightNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-block-right08.png").toURI())));
		    rightNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-block-right09.png").toURI())));
		    rightNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-block-right10.png").toURI())));
		    rightNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-block-right11.png").toURI())));
		    rightNeutralBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/neutral-block-right12.png").toURI())));
		    
		    // Animate Under Attack Block Right Left
		    
		    leftUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-attack00.png").toURI())));
		    leftUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-attack01.png").toURI())));
		    leftUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-attack02.png").toURI())));
		    leftUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-attack03.png").toURI())));
		    leftUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-attack04.png").toURI())));
		    leftUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-attack05.png").toURI())));
		    leftUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-attack06.png").toURI())));
		    leftUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-attack07.png").toURI())));
		    leftUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-attack08.png").toURI())));
		    leftUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-attack09.png").toURI())));
		    leftUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-attack10.png").toURI())));
		    leftUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-attack11.png").toURI())));
		    leftUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-attack12.png").toURI())));
		    
		    rightUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-attack-right00.png").toURI())));
		    rightUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-attack-right01.png").toURI())));
		    rightUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-attack-right02.png").toURI())));
		    rightUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-attack-right03.png").toURI())));
		    rightUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-attack-right04.png").toURI())));
		    rightUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-attack-right05.png").toURI())));
		    rightUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-attack-right06.png").toURI())));
		    rightUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-attack-right07.png").toURI())));
		    rightUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-attack-right08.png").toURI())));
		    rightUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-attack-right09.png").toURI())));
		    rightUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-attack-right10.png").toURI())));
		    rightUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-attack-right11.png").toURI())));
		    rightUnderAttack.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-attack-right12.png").toURI())));
		    
		    leftUnderBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-block00.png").toURI())));
		    leftUnderBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-block01.png").toURI())));
		    leftUnderBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-block02.png").toURI())));
		    leftUnderBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-block03.png").toURI())));
		    leftUnderBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-block04.png").toURI())));
		    leftUnderBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-block05.png").toURI())));
		    leftUnderBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-block06.png").toURI())));
		    leftUnderBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-block07.png").toURI())));
		    leftUnderBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-block08.png").toURI())));
		    leftUnderBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-block09.png").toURI())));
		    leftUnderBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-block10.png").toURI())));
		    leftUnderBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/left/under-block11.png").toURI())));

		    rightUnderBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-block-right00.png").toURI())));
		    rightUnderBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-block-right01.png").toURI())));
		    rightUnderBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-block-right02.png").toURI())));
		    rightUnderBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-block-right03.png").toURI())));
		    rightUnderBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-block-right04.png").toURI())));
		    rightUnderBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-block-right05.png").toURI())));
		    rightUnderBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-block-right06.png").toURI())));
		    rightUnderBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-block-right07.png").toURI())));
		    rightUnderBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-block-right08.png").toURI())));
		    rightUnderBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-block-right09.png").toURI())));
		    rightUnderBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-block-right10.png").toURI())));
		    rightUnderBlock.add(ImageIO.read(new File(this.getClass().getResource("/resources/right/under-block-right11.png").toURI())));

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
	