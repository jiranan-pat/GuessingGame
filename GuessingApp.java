package guessingGame;

/**
 * Main method of the game 
 * @author Jiranan Patrathamakul
 *
 */

public class GuessingApp {
	/**
	 * Create objects and start the game
	 */
	public static void main(String[] args) {
		GuessingGame game = new GuessingGame(20);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}

}
