import java.util.Scanner;

public class Validation {
	static Scanner scnr = new Scanner(System.in);
	public static int inputValidation() {
		while (!scnr.hasNextInt()) {
			System.out.print("Please enter numbers only!");
			scnr.next();
			
		}
		int userInput = scnr.nextInt();
		return userInput;
	}

}
