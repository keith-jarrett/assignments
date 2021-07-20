import java.util.Random;
import java.util.Scanner;

/*
 * This class prompts the user to try and guess a number between 1 and 100.
 * A random number generator selects an integer. If the user input
 * is within 10 units of the random number, then they are a winner.
 * The user gets 5 guesses.
 */

class GuessNumber {
	public static void main(String[] args) throws java.io.IOException {
		int difference;
		int i;
		Random rand = new Random();
		int rand_int = rand.nextInt(100);
		System.out.println(rand_int);
		System.out.println("Guess a number between 1 and 100.");
		// this for-loop iterates through 5 times to give 5 guesses 
		for (i = 1; i < 6; i++) {
			// 'guess' stores the user input
			Scanner guess = new Scanner(System.in);
			// 'difference' isused to check if the guess is within 10 of the correct answer
			difference = Math.abs(rand_int - guess.nextInt());

			if (difference == 0) {
				System.out.println("You guessed it! The number is " + rand_int);
				break;
			} else if (difference <= 10) {
				System.out.println("Very close. The number is " + rand_int);
				break;
			}
			if (0 < i & i < 5) {
				System.out.println("Guess again.");
			}
			if (i == 5) {
				System.out.println("Sorry, the correct answer was: " + rand_int);
				break;
			}
		}
	}
}
