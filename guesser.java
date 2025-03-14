import java.util.Random;

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
				// run userGuess

			} else if (response.equals("2")){
				//run cpuGuess
				
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

	


