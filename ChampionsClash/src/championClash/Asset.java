package championClash;

import java.awt.image.BufferedImage;

import championClash.ImageLoader;
import characters.SpriteSheet;

public class Asset {
	private static final int width = 190, height = 175;
	public static BufferedImage warriorStand, warriorMove, warriorAttack;
	public static BufferedImage wizardStand, wizardMove, wizardAttack;
	public static BufferedImage archerStand, archerMove, archerAttack;
	
	public static void initialize() {
		warriorStand = ImageLoader.loadImage("/images/warriorStand.png");
		warriorMove = ImageLoader.loadImage("/images/warriorMove.png");
		warriorAttack = ImageLoader.loadImage("/images/warriorAttack.png");
		wizardStand = ImageLoader.loadImage("/images/wizardStand.png");
		wizardMove = ImageLoader.loadImage("/images/wizardMove.png");
		wizardAttack = ImageLoader.loadImage("/images/wizardAttack.png");
		archerStand = ImageLoader.loadImage("/images/archerStand.png");
		archerMove = ImageLoader.loadImage("/images/archerMove.png");
		archerAttack = ImageLoader.loadImage("/images/archerAttack.png");
		
		
	}

}
