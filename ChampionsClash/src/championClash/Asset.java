package championClash;

import java.awt.image.BufferedImage;

public class Asset {
	private static final int width = 190, height = 175;
	public static BufferedImage warriorStand, warriorWalk, warriorRun, warriorAttack;
	public static BufferedImage wizardStand, wizardWalk, wizardRun, wizardAttack;
	public static BufferedImage archerStand, archerWalk, archerRun, archerAttack;
	
	public static void initialize() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/images/sprite-sheet.jpg"));
		
		warriorStand = sheet.crop(50, 30, width, height);
		warriorWalk = sheet.crop(50+width, 30, width, height);
		warriorRun = sheet.crop(50+2*width, 30, width, height);
		warriorAttack = sheet.crop(50+3*width, 30, width, height); 
		wizardStand = sheet.crop(50, 30+height,width, height);
		wizardWalk = sheet.crop(50+width,  30+height,width, height) ;
		wizardRun = sheet.crop(50+2*width, 30+height, width, height);
		wizardAttack = sheet.crop(50+3*width, 30+height,width, height);
		archerStand =sheet.crop(50, 30+height*2,width, height);
		archerWalk = sheet.crop(50+width, 30+height*2, width, height);
		archerRun = sheet.crop(50+2*width, 30+height*2, width, height);
		archerAttack = sheet.crop(50+3*width, 30+height*2,width, height);
	}

}
