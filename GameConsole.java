package guessingGame;

import java.util.Scanner;

/**
 * Console of the games
 * @author Jiranan Patrathamkul
 *
 */

public class GameConsole {
	private String title;
	private String prompt;
	
	/**
	 * Create title and prompt for the game  
	 */
	
	public GameConsole(){
		this.title = "Guessing Game";
		this.prompt = "Your guess?";
	}
	
	/**
	 * The play method plays a game using input from a user
	 * @param game is a new object of GuessingGame class
	 * @return the secret number which is "numin"
	 */
	
	public int play (GuessingGame game){
		Scanner input = new Scanner(System.in);
		System.out.print(this.title);
		int numin = 0;
		boolean incorrect = false;
		
		
		while (!incorrect){
			System.out.print(game.getHint()+"\n" +this.prompt + " ");
			numin = Integer.parseInt(input.nextLine());
			incorrect = game.guess(numin);
		}
		System.out.print(game.getHint());
		return numin;
		
		
		
	}
	

}
