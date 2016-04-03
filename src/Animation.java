import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Animation {
	private ArrayList<Image> leftUnderNeutral	= new ArrayList<Image>();
	private ArrayList<Image> leftUnderAbove 	= new ArrayList<Image>();
	private ArrayList<Image> leftAboveNeutral 	= new ArrayList<Image>();
	private ArrayList<Image> leftAboveUnder 	= new ArrayList<Image>();
	private ArrayList<Image> leftNeutralUnder 	= new ArrayList<Image>();
	private ArrayList<Image> leftNeutralAbove 	= new ArrayList<Image>();
	private ArrayList<Image> leftAboveAttack 	= new ArrayList<Image>();
	private ArrayList<Image> leftAboveBlock 	= new ArrayList<Image>();
	private ArrayList<Image> leftNeutralAttack 	= new ArrayList<Image>();
	private ArrayList<Image> leftNeutralBlock 	= new ArrayList<Image>();
	private ArrayList<Image> leftUnderBlock 	= new ArrayList<Image>();
	private ArrayList<Image> leftUnderAttack 	= new ArrayList<Image>();
	
	private ArrayList<Image> rightUnderNeutral	= new ArrayList<Image>();
	private ArrayList<Image> rightUnderAbove 	= new ArrayList<Image>();
	private ArrayList<Image> rightAboveNeutral 	= new ArrayList<Image>();
	private ArrayList<Image> rightAboveUnder 	= new ArrayList<Image>();
	private ArrayList<Image> rightNeutralUnder 	= new ArrayList<Image>();
	private ArrayList<Image> rightNeutralAbove 	= new ArrayList<Image>();
	private ArrayList<Image> rightAboveAttack 	= new ArrayList<Image>();
	private ArrayList<Image> rightAboveBlock 	= new ArrayList<Image>();
	private ArrayList<Image> rightNeutralAttack = new ArrayList<Image>();
	private ArrayList<Image> rightNeutralBlock 	= new ArrayList<Image>();
	private ArrayList<Image> rightUnderBlock 	= new ArrayList<Image>();
	private ArrayList<Image> rightUnderAttack 	= new ArrayList<Image>();
	
	public Animation ()
	{
		BufferedImage img = null;
		try {
			// Animations for under to neutral stance left and right
		    leftUnderNeutral.add(ImageIO.read(new File("/resources/left/under-neutral-change0.png")));
		    leftUnderNeutral.add(ImageIO.read(new File("/resources/left/under-neutral-change1.png")));
		    leftUnderNeutral.add(ImageIO.read(new File("/resources/left/under-neutral-change2.png")));
		    leftUnderNeutral.add(ImageIO.read(new File("/resources/left/under-neutral-change3.png")));
		    leftUnderNeutral.add(ImageIO.read(new File("/resources/left/under-neutral-change4.png")));
		    leftUnderNeutral.add(ImageIO.read(new File("/resources/left/under-neutral-change5.png")));
		    leftUnderNeutral.add(ImageIO.read(new File("/resources/left/under-neutral-change6.png")));
		    
		    leftNeutralUnder.add(ImageIO.read(new File("/resources/left/under-neutral-change6.png")));
		    leftNeutralUnder.add(ImageIO.read(new File("/resources/left/under-neutral-change5.png")));
		    leftNeutralUnder.add(ImageIO.read(new File("/resources/left/under-neutral-change4.png")));
		    leftNeutralUnder.add(ImageIO.read(new File("/resources/left/under-neutral-change3.png")));
		    leftNeutralUnder.add(ImageIO.read(new File("/resources/left/under-neutral-change2.png")));
		    leftNeutralUnder.add(ImageIO.read(new File("/resources/left/under-neutral-change1.png")));
		    leftNeutralUnder.add(ImageIO.read(new File("/resources/left/under-neutral-change0.png")));
		    
		    rightUnderNeutral.add(ImageIO.read(new File("/resources/right/under-neutral-change-right0.png")));
		    rightUnderNeutral.add(ImageIO.read(new File("/resources/right/under-neutral-change-right1.png")));
		    rightUnderNeutral.add(ImageIO.read(new File("/resources/right/under-neutral-change-right2.png")));
		    rightUnderNeutral.add(ImageIO.read(new File("/resources/right/under-neutral-change-right3.png")));
		    rightUnderNeutral.add(ImageIO.read(new File("/resources/right/under-neutral-change-right4.png")));
		    rightUnderNeutral.add(ImageIO.read(new File("/resources/right/under-neutral-change-right5.png")));
		    rightUnderNeutral.add(ImageIO.read(new File("/resources/right/under-neutral-change-right6.png")));
		    
		    rightNeutralUnder.add(ImageIO.read(new File("/resources/right/under-neutral-change-right6.png")));
		    rightNeutralUnder.add(ImageIO.read(new File("/resources/right/under-neutral-change-right5.png")));
		    rightNeutralUnder.add(ImageIO.read(new File("/resources/right/under-neutral-change-right4.png")));
		    rightNeutralUnder.add(ImageIO.read(new File("/resources/right/under-neutral-change-right3.png")));
		    rightNeutralUnder.add(ImageIO.read(new File("/resources/right/under-neutral-change-right2.png")));
		    rightNeutralUnder.add(ImageIO.read(new File("/resources/right/under-neutral-change-right1.png")));
		    rightNeutralUnder.add(ImageIO.read(new File("/resources/right/under-neutral-change-right0.png")));
		    
		    // Animations for neutral to above left and right
		    leftNeutralAbove.add(ImageIO.read(new File("/resources/left/neutral-above-change0.png")));
		    leftNeutralAbove.add(ImageIO.read(new File("/resources/left/neutral-above-change1.png")));
		    leftNeutralAbove.add(ImageIO.read(new File("/resources/left/neutral-above-change2.png")));
		    leftNeutralAbove.add(ImageIO.read(new File("/resources/left/neutral-above-change3.png")));
		    leftNeutralAbove.add(ImageIO.read(new File("/resources/left/neutral-above-change4.png")));
		    leftNeutralAbove.add(ImageIO.read(new File("/resources/left/neutral-above-change5.png")));
		    leftNeutralAbove.add(ImageIO.read(new File("/resources/left/neutral-above-change6.png")));
		    leftNeutralAbove.add(ImageIO.read(new File("/resources/left/neutral-above-change7.png")));
		    leftNeutralAbove.add(ImageIO.read(new File("/resources/left/neutral-above-change8.png")));
		    
		    leftAboveNeutral.add(ImageIO.read(new File("/resources/left/neutral-above-change8.png")));
		    leftAboveNeutral.add(ImageIO.read(new File("/resources/left/neutral-above-change7.png")));
		    leftAboveNeutral.add(ImageIO.read(new File("/resources/left/neutral-above-change6.png")));
		    leftAboveNeutral.add(ImageIO.read(new File("/resources/left/neutral-above-change5.png")));
		    leftAboveNeutral.add(ImageIO.read(new File("/resources/left/neutral-above-change4.png")));
		    leftAboveNeutral.add(ImageIO.read(new File("/resources/left/neutral-above-change3.png")));
		    leftAboveNeutral.add(ImageIO.read(new File("/resources/left/neutral-above-change2.png")));
		    leftAboveNeutral.add(ImageIO.read(new File("/resources/left/neutral-above-change1.png")));
		    leftAboveNeutral.add(ImageIO.read(new File("/resources/left/neutral-above-change0.png")));
		    
		    rightNeutralAbove.add(ImageIO.read(new File("/resources/right/neutral-above-change-right0.png")));
		    rightNeutralAbove.add(ImageIO.read(new File("/resources/right/neutral-above-change-right1.png")));
		    rightNeutralAbove.add(ImageIO.read(new File("/resources/right/neutral-above-change-right2.png")));
		    rightNeutralAbove.add(ImageIO.read(new File("/resources/right/neutral-above-change-right3.png")));
		    rightNeutralAbove.add(ImageIO.read(new File("/resources/right/neutral-above-change-right4.png")));
		    rightNeutralAbove.add(ImageIO.read(new File("/resources/right/neutral-above-change-right5.png")));
		    rightNeutralAbove.add(ImageIO.read(new File("/resources/right/neutral-above-change-right6.png")));
		    rightNeutralAbove.add(ImageIO.read(new File("/resources/right/neutral-above-change-right7.png")));
		    rightNeutralAbove.add(ImageIO.read(new File("/resources/right/neutral-above-change-right8.png")));
		    
		    rightAboveNeutral.add(ImageIO.read(new File("/resources/right/neutral-above-change-right8.png")));
		    rightAboveNeutral.add(ImageIO.read(new File("/resources/right/neutral-above-change-right7.png")));
		    rightAboveNeutral.add(ImageIO.read(new File("/resources/right/neutral-above-change-right6.png")));
		    rightAboveNeutral.add(ImageIO.read(new File("/resources/right/neutral-above-change-right5.png")));
		    rightAboveNeutral.add(ImageIO.read(new File("/resources/right/neutral-above-change-right4.png")));
		    rightAboveNeutral.add(ImageIO.read(new File("/resources/right/neutral-above-change-right3.png")));
		    rightAboveNeutral.add(ImageIO.read(new File("/resources/right/neutral-above-change-right2.png")));
		    rightAboveNeutral.add(ImageIO.read(new File("/resources/right/neutral-above-change-right1.png")));
		    rightAboveNeutral.add(ImageIO.read(new File("/resources/right/neutral-above-change-right0.png")));
		    
		    //Animations for Above to Under left and right
		    leftAboveUnder.add(ImageIO.read(new File("/resources/left/above-under-change00.png")));
		    leftAboveUnder.add(ImageIO.read(new File("/resources/left/above-under-change01.png")));
		    leftAboveUnder.add(ImageIO.read(new File("/resources/left/above-under-change02.png")));
		    leftAboveUnder.add(ImageIO.read(new File("/resources/left/above-under-change03.png")));
		    leftAboveUnder.add(ImageIO.read(new File("/resources/left/above-under-change04.png")));
		    leftAboveUnder.add(ImageIO.read(new File("/resources/left/above-under-change05.png")));
		    leftAboveUnder.add(ImageIO.read(new File("/resources/left/above-under-change06.png")));
		    leftAboveUnder.add(ImageIO.read(new File("/resources/left/above-under-change07.png")));
		    leftAboveUnder.add(ImageIO.read(new File("/resources/left/above-under-change08.png")));
		    leftAboveUnder.add(ImageIO.read(new File("/resources/left/above-under-change09.png")));
		    leftAboveUnder.add(ImageIO.read(new File("/resources/left/above-under-change10.png")));
		    
		    leftUnderAbove.add(ImageIO.read(new File("/resources/left/above-under-change10.png")));
		    leftUnderAbove.add(ImageIO.read(new File("/resources/left/above-under-change09.png")));
		    leftUnderAbove.add(ImageIO.read(new File("/resources/left/above-under-change08.png")));
		    leftUnderAbove.add(ImageIO.read(new File("/resources/left/above-under-change07.png")));
		    leftUnderAbove.add(ImageIO.read(new File("/resources/left/above-under-change06.png")));
		    leftUnderAbove.add(ImageIO.read(new File("/resources/left/above-under-change05.png")));
		    leftUnderAbove.add(ImageIO.read(new File("/resources/left/above-under-change04.png")));
		    leftUnderAbove.add(ImageIO.read(new File("/resources/left/above-under-change03.png")));
		    leftUnderAbove.add(ImageIO.read(new File("/resources/left/above-under-change02.png")));
		    leftUnderAbove.add(ImageIO.read(new File("/resources/left/above-under-change01.png")));
		    leftUnderAbove.add(ImageIO.read(new File("/resources/left/above-under-change00.png")));
		    
		    rightAboveUnder.add(ImageIO.read(new File("/resources/right/above-under-change00.png")));
		    rightAboveUnder.add(ImageIO.read(new File("/resources/right/above-under-change01.png")));
		    rightAboveUnder.add(ImageIO.read(new File("/resources/right/above-under-change02.png")));
		    rightAboveUnder.add(ImageIO.read(new File("/resources/right/above-under-change03.png")));
		    rightAboveUnder.add(ImageIO.read(new File("/resources/right/above-under-change04.png")));
		    rightAboveUnder.add(ImageIO.read(new File("/resources/right/above-under-change05.png")));
		    rightAboveUnder.add(ImageIO.read(new File("/resources/right/above-under-change06.png")));
		    rightAboveUnder.add(ImageIO.read(new File("/resources/right/above-under-change07.png")));
		    rightAboveUnder.add(ImageIO.read(new File("/resources/right/above-under-change08.png")));
		    rightAboveUnder.add(ImageIO.read(new File("/resources/right/above-under-change09.png")));
		    rightAboveUnder.add(ImageIO.read(new File("/resources/right/above-under-change10.png")));
		    
		    rightUnderAbove.add(ImageIO.read(new File("/resources/right/above-under-change10.png")));
		    rightUnderAbove.add(ImageIO.read(new File("/resources/right/above-under-change09.png")));
		    rightUnderAbove.add(ImageIO.read(new File("/resources/right/above-under-change08.png")));
		    rightUnderAbove.add(ImageIO.read(new File("/resources/right/above-under-change07.png")));
		    rightUnderAbove.add(ImageIO.read(new File("/resources/right/above-under-change06.png")));
		    rightUnderAbove.add(ImageIO.read(new File("/resources/right/above-under-change05.png")));
		    rightUnderAbove.add(ImageIO.read(new File("/resources/right/above-under-change04.png")));
		    rightUnderAbove.add(ImageIO.read(new File("/resources/right/above-under-change03.png")));
		    rightUnderAbove.add(ImageIO.read(new File("/resources/right/above-under-change02.png")));
		    rightUnderAbove.add(ImageIO.read(new File("/resources/right/above-under-change01.png")));
		    rightUnderAbove.add(ImageIO.read(new File("/resources/right/above-under-change00.png")));
		    
		    // Above Attack and Block Left and Right
		    
		    leftAboveAttack.add(ImageIO.read(new File("/resources/left/above-strike0.png")));
		    leftAboveAttack.add(ImageIO.read(new File("/resources/left/above-strike1.png")));
		    leftAboveAttack.add(ImageIO.read(new File("/resources/left/above-strike2.png")));
		    leftAboveAttack.add(ImageIO.read(new File("/resources/left/above-strike3.png")));
		    
		    rightAboveAttack.add(ImageIO.read(new File("/resources/right/above-strike-right0.png")));
		    rightAboveAttack.add(ImageIO.read(new File("/resources/right/above-strike-right1.png")));
		    rightAboveAttack.add(ImageIO.read(new File("/resources/right/above-strike-right2.png")));
		    rightAboveAttack.add(ImageIO.read(new File("/resources/right/above-strike-right3.png")));
		    
		    leftAboveBlock.add(ImageIO.read(new File("/resources/left/above-block00.png")));
		    leftAboveBlock.add(ImageIO.read(new File("/resources/left/above-block01.png")));
		    leftAboveBlock.add(ImageIO.read(new File("/resources/left/above-block02.png")));
		    leftAboveBlock.add(ImageIO.read(new File("/resources/left/above-block03.png")));
		    leftAboveBlock.add(ImageIO.read(new File("/resources/left/above-block04.png")));
		    leftAboveBlock.add(ImageIO.read(new File("/resources/left/above-block05.png")));
		    leftAboveBlock.add(ImageIO.read(new File("/resources/left/above-block06.png")));
		    leftAboveBlock.add(ImageIO.read(new File("/resources/left/above-block07.png")));
		    leftAboveBlock.add(ImageIO.read(new File("/resources/left/above-block08.png")));
		    leftAboveBlock.add(ImageIO.read(new File("/resources/left/above-block09.png")));
		    leftAboveBlock.add(ImageIO.read(new File("/resources/left/above-block10.png")));
		    leftAboveBlock.add(ImageIO.read(new File("/resources/left/above-block11.png")));
		    
		    rightAboveBlock.add(ImageIO.read(new File("/resources/right/above-block-right00.png")));
		    rightAboveBlock.add(ImageIO.read(new File("/resources/right/above-block-right01.png")));
		    rightAboveBlock.add(ImageIO.read(new File("/resources/right/above-block-right02.png")));
		    rightAboveBlock.add(ImageIO.read(new File("/resources/right/above-block-right03.png")));
		    rightAboveBlock.add(ImageIO.read(new File("/resources/right/above-block-right04.png")));
		    rightAboveBlock.add(ImageIO.read(new File("/resources/right/above-block-right05.png")));
		    rightAboveBlock.add(ImageIO.read(new File("/resources/right/above-block-right06.png")));
		    rightAboveBlock.add(ImageIO.read(new File("/resources/right/above-block-right07.png")));
		    rightAboveBlock.add(ImageIO.read(new File("/resources/right/above-block-right08.png")));
		    rightAboveBlock.add(ImageIO.read(new File("/resources/right/above-block-right09.png")));
		    rightAboveBlock.add(ImageIO.read(new File("/resources/right/above-block-right10.png")));
		    rightAboveBlock.add(ImageIO.read(new File("/resources/right/above-block-right11.png")));
		    
		    // Animate Neutral Attack Block Left Right
		    leftNeutralAttack.add(ImageIO.read(new File("/resources/left/neutral-attack0.png")));
		    leftNeutralAttack.add(ImageIO.read(new File("/resources/left/neutral-attack1.png")));
		    leftNeutralAttack.add(ImageIO.read(new File("/resources/left/neutral-attack2.png")));
		    leftNeutralAttack.add(ImageIO.read(new File("/resources/left/neutral-attack3.png")));
		    leftNeutralAttack.add(ImageIO.read(new File("/resources/left/neutral-attack4.png")));
		    leftNeutralAttack.add(ImageIO.read(new File("/resources/left/neutral-attack5.png")));
		    leftNeutralAttack.add(ImageIO.read(new File("/resources/left/neutral-attack6.png")));
		    leftNeutralAttack.add(ImageIO.read(new File("/resources/left/neutral-attack7.png")));
		    leftNeutralAttack.add(ImageIO.read(new File("/resources/left/neutral-attack8.png")));
		    
		    rightNeutralAttack.add(ImageIO.read(new File("/resources/right/neutral-attack-right0.png")));
		    rightNeutralAttack.add(ImageIO.read(new File("/resources/right/neutral-attack-right1.png")));
		    rightNeutralAttack.add(ImageIO.read(new File("/resources/right/neutral-attack-right2.png")));
		    rightNeutralAttack.add(ImageIO.read(new File("/resources/right/neutral-attack-right3.png")));
		    rightNeutralAttack.add(ImageIO.read(new File("/resources/right/neutral-attack-right4.png")));
		    rightNeutralAttack.add(ImageIO.read(new File("/resources/right/neutral-attack-right5.png")));
		    rightNeutralAttack.add(ImageIO.read(new File("/resources/right/neutral-attack-right6.png")));
		    rightNeutralAttack.add(ImageIO.read(new File("/resources/right/neutral-attack-right7.png")));
		    rightNeutralAttack.add(ImageIO.read(new File("/resources/right/neutral-attack-right8.png")));
		    
		    leftNeutralBlock.add(ImageIO.read(new File("/resources/left/neutral-block00.png")));
		    leftNeutralBlock.add(ImageIO.read(new File("/resources/left/neutral-block01.png")));
		    leftNeutralBlock.add(ImageIO.read(new File("/resources/left/neutral-block02.png")));
		    leftNeutralBlock.add(ImageIO.read(new File("/resources/left/neutral-block03.png")));
		    leftNeutralBlock.add(ImageIO.read(new File("/resources/left/neutral-block04.png")));
		    leftNeutralBlock.add(ImageIO.read(new File("/resources/left/neutral-block05.png")));
		    leftNeutralBlock.add(ImageIO.read(new File("/resources/left/neutral-block06.png")));
		    leftNeutralBlock.add(ImageIO.read(new File("/resources/left/neutral-block07.png")));
		    leftNeutralBlock.add(ImageIO.read(new File("/resources/left/neutral-block08.png")));
		    leftNeutralBlock.add(ImageIO.read(new File("/resources/left/neutral-block09.png")));
		    leftNeutralBlock.add(ImageIO.read(new File("/resources/left/neutral-block10.png")));
		    leftNeutralBlock.add(ImageIO.read(new File("/resources/left/neutral-block11.png")));
		    leftNeutralBlock.add(ImageIO.read(new File("/resources/left/neutral-block12.png")));
		    
		    rightNeutralBlock.add(ImageIO.read(new File("/resources/right/neutral-block-right00.png")));
		    rightNeutralBlock.add(ImageIO.read(new File("/resources/right/neutral-block-right01.png")));
		    rightNeutralBlock.add(ImageIO.read(new File("/resources/right/neutral-block-right02.png")));
		    rightNeutralBlock.add(ImageIO.read(new File("/resources/right/neutral-block-right03.png")));
		    rightNeutralBlock.add(ImageIO.read(new File("/resources/right/neutral-block-right04.png")));
		    rightNeutralBlock.add(ImageIO.read(new File("/resources/right/neutral-block-right05.png")));
		    rightNeutralBlock.add(ImageIO.read(new File("/resources/right/neutral-block-right06.png")));
		    rightNeutralBlock.add(ImageIO.read(new File("/resources/right/neutral-block-right07.png")));
		    rightNeutralBlock.add(ImageIO.read(new File("/resources/right/neutral-block-right08.png")));
		    rightNeutralBlock.add(ImageIO.read(new File("/resources/right/neutral-block-right09.png")));
		    rightNeutralBlock.add(ImageIO.read(new File("/resources/right/neutral-block-right10.png")));
		    rightNeutralBlock.add(ImageIO.read(new File("/resources/right/neutral-block-right11.png")));
		    rightNeutralBlock.add(ImageIO.read(new File("/resources/right/neutral-block-right12.png")));
		    
		    // Animate Under Attack Block Right Left
		    
		    leftUnderAttack.add(ImageIO.read(new File("/resources/left/under-attack00.png")));
		    leftUnderAttack.add(ImageIO.read(new File("/resources/left/under-attack01.png")));
		    leftUnderAttack.add(ImageIO.read(new File("/resources/left/under-attack02.png")));
		    leftUnderAttack.add(ImageIO.read(new File("/resources/left/under-attack03.png")));
		    leftUnderAttack.add(ImageIO.read(new File("/resources/left/under-attack04.png")));
		    leftUnderAttack.add(ImageIO.read(new File("/resources/left/under-attack05.png")));
		    leftUnderAttack.add(ImageIO.read(new File("/resources/left/under-attack06.png")));
		    leftUnderAttack.add(ImageIO.read(new File("/resources/left/under-attack07.png")));
		    leftUnderAttack.add(ImageIO.read(new File("/resources/left/under-attack08.png")));
		    leftUnderAttack.add(ImageIO.read(new File("/resources/left/under-attack09.png")));
		    leftUnderAttack.add(ImageIO.read(new File("/resources/left/under-attack10.png")));
		    leftUnderAttack.add(ImageIO.read(new File("/resources/left/under-attack11.png")));
		    leftUnderAttack.add(ImageIO.read(new File("/resources/left/under-attack12.png")));
		    
		    rightUnderAttack.add(ImageIO.read(new File("/resources/right/under-attack-right00.png")));
		    rightUnderAttack.add(ImageIO.read(new File("/resources/right/under-attack-right01.png")));
		    rightUnderAttack.add(ImageIO.read(new File("/resources/right/under-attack-right02.png")));
		    rightUnderAttack.add(ImageIO.read(new File("/resources/right/under-attack-right03.png")));
		    rightUnderAttack.add(ImageIO.read(new File("/resources/right/under-attack-right04.png")));
		    rightUnderAttack.add(ImageIO.read(new File("/resources/right/under-attack-right05.png")));
		    rightUnderAttack.add(ImageIO.read(new File("/resources/right/under-attack-right06.png")));
		    rightUnderAttack.add(ImageIO.read(new File("/resources/right/under-attack-right07.png")));
		    rightUnderAttack.add(ImageIO.read(new File("/resources/right/under-attack-right08.png")));
		    rightUnderAttack.add(ImageIO.read(new File("/resources/right/under-attack-right09.png")));
		    rightUnderAttack.add(ImageIO.read(new File("/resources/right/under-attack-right10.png")));
		    rightUnderAttack.add(ImageIO.read(new File("/resources/right/under-attack-right11.png")));
		    rightUnderAttack.add(ImageIO.read(new File("/resources/right/under-attack-right12.png")));
		    
		    leftUnderBlock.add(ImageIO.read(new File("/resources/left/under-block00.png")));
		    leftUnderBlock.add(ImageIO.read(new File("/resources/left/under-block01.png")));
		    leftUnderBlock.add(ImageIO.read(new File("/resources/left/under-block02.png")));
		    leftUnderBlock.add(ImageIO.read(new File("/resources/left/under-block03.png")));
		    leftUnderBlock.add(ImageIO.read(new File("/resources/left/under-block04.png")));
		    leftUnderBlock.add(ImageIO.read(new File("/resources/left/under-block05.png")));
		    leftUnderBlock.add(ImageIO.read(new File("/resources/left/under-block06.png")));
		    leftUnderBlock.add(ImageIO.read(new File("/resources/left/under-block07.png")));
		    leftUnderBlock.add(ImageIO.read(new File("/resources/left/under-block08.png")));
		    leftUnderBlock.add(ImageIO.read(new File("/resources/left/under-block09.png")));
		    leftUnderBlock.add(ImageIO.read(new File("/resources/left/under-block10.png")));
		    leftUnderBlock.add(ImageIO.read(new File("/resources/left/under-block11.png")));

		    rightUnderBlock.add(ImageIO.read(new File("/resources/right/under-block-right00.png")));
		    rightUnderBlock.add(ImageIO.read(new File("/resources/right/under-block-right01.png")));
		    rightUnderBlock.add(ImageIO.read(new File("/resources/right/under-block-right02.png")));
		    rightUnderBlock.add(ImageIO.read(new File("/resources/right/under-block-right03.png")));
		    rightUnderBlock.add(ImageIO.read(new File("/resources/right/under-block-right04.png")));
		    rightUnderBlock.add(ImageIO.read(new File("/resources/right/under-block-right05.png")));
		    rightUnderBlock.add(ImageIO.read(new File("/resources/right/under-block-right06.png")));
		    rightUnderBlock.add(ImageIO.read(new File("/resources/right/under-block-right07.png")));
		    rightUnderBlock.add(ImageIO.read(new File("/resources/right/under-block-right08.png")));
		    rightUnderBlock.add(ImageIO.read(new File("/resources/right/under-block-right09.png")));
		    rightUnderBlock.add(ImageIO.read(new File("/resources/right/under-block-right10.png")));
		    rightUnderBlock.add(ImageIO.read(new File("/resources/right/under-block-right11.png")));

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}	
}
	