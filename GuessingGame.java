package guessingGame;

import java.util.Random;

/**
 * 
 * Game of guessing a secret number
 * 
 * @author Jiranan
 *
 */

public class GuessingGame {
	private int upperBound;
	private int secret;
	private String hint;
	private int count;

	/**
	 * Initialize a new game
	 * 
	 * @param upperBound
	 *            is the max value for the secret number (>)
	 */

	public GuessingGame(int upperBound) {
		this.upperBound = upperBound;
		this.secret = getRandomNumber(upperBound);
		this.hint = "";
		this.count = 0;

	}

	/**
	 * Create a random number between 1 and limit.
	 * 
	 * @param limit
	 *            is the upper limit for random number
	 * @return a random number between 1 and limit (inclusive)
	 */

	private int getRandomNumber(int limit) {
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		return rand.nextInt(limit) + 1;

	}

	/**
	 * To check a number user guessed if it's right or wrong
	 * 
	 * @param guessNumber
	 *            is a number that user guess
	 * @return boolean for guessing
	 */

	public boolean guess(int guessNumber) {
		this.count++;
		if (guessNumber == this.secret) {
			this.hint = "Correct. The secret is " + this.secret + "You used "
					+ this.count + " guesses";
			return true;
		} else if (guessNumber > this.secret) {
			this.hint = "Sorry, your guess is too large";
		} else if (guessNumber < this.secret) {
			this.hint = "Sorry, your guess is too small";
		}
		return false;
	}

	/**
	 * Return a hint based on the most recent guess.
	 * 
	 * @return hint based on most recent guess
	 */

	public String getHint() {
		return hint;

		/**
		 * Return a number of how many time user have guessed.
		 * 
		 * @return number of how many time user have guessed
		 */
	}

	public int getCount() {
		return count;
	}

}
