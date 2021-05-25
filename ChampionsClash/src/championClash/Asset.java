package championClash;

import java.awt.image.BufferedImage;

import championClash.ImageLoader;


/**
 * Asset class, loads all images used in the game. 
 * @author Abhishek Garud, Ethan Bar - 5/24/21
 *
 */
public class Asset {
	private static final int width = 190, height = 175;
	public static BufferedImage warriorStand, warriorMoveRight, warriorMoveLeft, warriorAttackRight, warriorAttackLeft;
	public static BufferedImage wizardStand, wizardMoveRight, wizardMoveLeft, wizardAttack;
	public static BufferedImage archerStand, archerMoveRight, archerMoveLeft, archerAttack;
	public static BufferedImage startButton1, startButton2;
	public static BufferedImage bush, tree, sky;
	public static BufferedImage menuText, arrowButton, p1Text, p2Text;
	public static BufferedImage gameOver;
	
	/**
	 * Initializes static BufferedImages using loadImage() from ImageLoader.
	 */
	public static void initialize() {
		warriorStand = ImageLoader.loadImage("/images/warriorStand.png");
		warriorMoveLeft = ImageLoader.loadImage("/images/warriorMoveLeft.png");
		warriorMoveRight = ImageLoader.loadImage("/images/warriorMoveRight.png");
		warriorAttackRight = ImageLoader.loadImage("/images/warriorAttackRight.png");
		warriorAttackLeft = ImageLoader.loadImage("/images/warriorAttackLeft.png");
		wizardStand = ImageLoader.loadImage("/images/wizardStand.png");
		wizardMoveRight = ImageLoader.loadImage("/images/wizardMoveRight.png");
		wizardMoveLeft = ImageLoader.loadImage("/images/wizardMoveLeft.png");
		wizardAttack = ImageLoader.loadImage("/images/wizardAttack.png");
		archerStand = ImageLoader.loadImage("/images/archerStand.png");
		archerMoveRight = ImageLoader.loadImage("/images/archerMoveRight.png");
		archerMoveLeft = ImageLoader.loadImage("/images/archerMoveLeft.png");
		archerAttack = ImageLoader.loadImage("/images/archerAttack.png");
		startButton1 = ImageLoader.loadImage("/images/startButton1.png");
		startButton2 = ImageLoader.loadImage("/images/startButton2.png");
		bush = ImageLoader.loadImage("/images/bush.png");
		tree = ImageLoader.loadImage("/images/tree.png");
		sky = ImageLoader.loadImage("/images/sky.png");
		menuText = ImageLoader.loadImage("/images/menuText.png");
		arrowButton = ImageLoader.loadImage("/images/arrow.png");
		p1Text = ImageLoader.loadImage("/images/player1.png");
		p2Text = ImageLoader.loadImage("/images/player2.png");
		gameOver = ImageLoader.loadImage("/images/gameOver.png");
		
		
	}
	
}
