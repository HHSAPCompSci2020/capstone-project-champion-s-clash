package championClash;

import input.KeyManager;
import input.MouseManager;

/**
 * Handler class. Getter methods for different traits of Game.
 * @author Ethan Bar, Abhishek Garud - 5/23/21
 *
 */
public class Handler {
		
		private Game game;
		
		public Handler(Game game){
			this.game = game;
		}
		
		/**
		 * Getter for KeyManager
		 * @return KeyManager of current game
		 */
		public KeyManager getKeyManager(){
			return game.getKeyManager();
		}
		
		/**
		 * Getter for MouseManager
		 * @return MouseManager of current game.
		 */
		public MouseManager getMouseManager(){
			return game.getMouseManager();
		}
		
		/**
		 * Getter method for game width.
		 * @return width of game.
		 */
		public int getWidth(){
			return game.getWidth();
		}
		
		/**
		 * Getter method for game height.
		 * @return height of game.
		 */
		public int getHeight(){
			return game.getHeight();
		}

		/**
		 * Getter method for game.
		 * @return game
		 */
		public Game getGame() {
			return game;
		}

		/**
		 * Sets game to Game Object passed in.
		 * @param game Game to be set.
		 */
		public void setGame(Game game) {
			this.game = game;
		}
	
}
