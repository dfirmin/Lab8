import java.util.Scanner;
public class Validation {
	public static void inputValidation(Scanner scnr) {
		while (!scnr.hasNextDouble()) {
			System.out.print("Please enter numbers only!");
			scnr.next();
		}
	}

}
