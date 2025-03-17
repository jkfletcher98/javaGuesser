import java.util.Random;
import java.lang.Math;

public class Guesser {
	public static void main(String[] args){
		boolean keepGoing = true;
		while (keepGoing){
			System.out.println("0) Exit");
			System.out.println("1) User guesses");
			System.out.println("2) Computer guesses");
			System.out.println("Choose an option (0, 1, or 2)");

			string response = input.nextLine();

			if (response.equals("0")){
				System.out.println("Exit");
				keepGoing = false;

			} else if (response.equals("1")){
				userGuess();

			} else if (response.equals("2")){
				cpuGuess();
				
			} else {
				System.out.println("I'm not sure I understand.");
			} // end if

		} // end while

	} // end main

	public void userGuess(String[] args){
		int correct = rand.nextInt(100);
		correct += 1;
		int tries = 0

		System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

		boolean keepGoing = true;
		while (keepGoing){
			System.out.println("What is your guess?");
			string input  = input.nextLine();
			int guess = Integer.parseInt(input)

			if (guess > correct){
				System.out.println("Too high");
				tries += 1;

			} else if (guess < correct){
				System.out.println("Too low");
				tries += 1;

			} else if (guess == correct){
				System.out.println("That's correct!");
				keepGoing = false;

			} else if (tries >= 7){
				System.out.println("You ran out of tries. Better luck next time!);
				keepGoing = false;

			} else {
				Ssytem.out.println("I'm not sure I understand.");
			} // end if
		} // end while
	} // end userGuess


	public void cpuGuess(String[] args){
		int lower = 0;
		int upper = 100;
		int tries = 0;

		boolean keepGoing = true;
		while (keepGoing){
			int guess = Math.round((upper - lower) / 2);

			System.out.println("Is it " + guess + " ?");
			System.out.println("Too (h)igh, too (l)ow, or (c)orrect?");

			string result = input.nextLine();

			if (result == "h"){
				upper = guess;
				tries += 1;
			
			} else if (result == "l"){
				lower = guess;
				tries += 1;

			} else if (result == "c"){
				System.out.println("I win!");
				keepGoing = false;

			} else if (tries >= 7){
				System.out.println("You win!);
				keepGoing = false;

			} else {
				System.out.println("I don't understand. Type 'h', 'l', or 'c'.");
			} //end if

		}// end while

	}// end cpuGuess

}// end guesser
	


