import java.util.*;
import java.util.Random

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
