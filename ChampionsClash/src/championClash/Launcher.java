package championClash;

/**
 * Main method class. It's only purpose is to run the game.
 * @author Abhishek Garud - 5/24/21
 *
 */
public class Launcher {

	public static void main(String[] args) {
		Game game = new Game("Champion's Clash!", 1170, 720);
		game.start();
	}

}
