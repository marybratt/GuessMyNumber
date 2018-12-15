import java.util.Scanner;
import java.util.Random;

public class guessMyNumber {

	public static void main(String[] args) {
		// get a random integer to guess
		Random rand = new Random();
		int randomNumber = rand.nextInt(100) + 1;
		//int randomInt = getRandomNumber(100);
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a number between 1 and 100");
		int guess = input.nextInt();
		//Loop will call the checkIfEqual method and print out a 
		// message depending on if the numbers are equal or not
		for(int i = 1; i<10;i++) {
			//call checkIfEqual method
			boolean isEqual = checkIfEqual(randomNumber, guess);
			//if not equal you will loop again, if equal will break out of loop
			if(isEqual) {
			//	System.out.println(randomInt);
				break;
			} else {
				guess = input.nextInt();
			}
			
		}
		// once you have broken out of loop determine if the numbers were equal
		// if not equal you would then let the user know that they have tried to many times
		if (randomNumber != guess) {
			System.out.println("To many tries!");
		}
		
	}	
		/**
		 * Returns a random integer 
		 * @param highestNumber will determine the highest number to use
		 * @return random number in the range of 1 to sides	
		 */
//	public static int getRandomNumber(int highestNumber) {
//		//random number between 0 and (almost 1)
//		double randomNumber = Math.random();
//	
//		//change range to 0 to almost the number of sides being sent in
//		randomNumber = randomNumber * highestNumber;
//				
//		// shift range up one
//		randomNumber += 1;
//				
//		//cast to integer (ignore decimal part)
//		// ex. 6.998 become 6
//		int randomInt = (int) randomNumber;
//				
//		// return statement
//		return randomInt;
//	}	
	
	/**
	 * Compares the random integer  that was created with the number entered by the user 
	 * 
	 * @parm randomInt - number created by computer
	 * @parm guess - number entered by user
	 * @return isEqual -The string that will be output on return
	 */

	public static boolean checkIfEqual(int randomInt, int guess) {
		boolean isEqual = false;
		System.out.println(randomInt);
		if(randomInt == guess) {
			isEqual = true;
			System.out.println("Congratulations, you have guessed the correct number!");
		} else if (randomInt < guess) {
			isEqual = false;
			System.out.println("Your number is too high! Guess again.");
		} else if (randomInt > guess) {
			isEqual = false;
			System.out.println("Your number is too low! Guess again.");
		} else {
			isEqual = false;
			System.out.println("Not a valid number!");
		}
		return isEqual;
	}
}




//# GuessMyNumber
