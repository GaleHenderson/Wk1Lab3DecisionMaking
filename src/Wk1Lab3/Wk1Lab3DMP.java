package Wk1Lab3;

import java.util.Scanner;

public class Wk1Lab3DMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		// This initializes and declares variables for user input
		int userInput1;
		String userCont = "y";
		String userName;

		System.out.println("Hello! Please tell me your name: ");
		userName = scan.nextLine();

		//do {
		while (userCont.equalsIgnoreCase("y")) {

			// This will prompt user for input and guide them if not an integer 1-100
			System.out.println(userName + ", " + "please enter a whole number between 1 and 100.");

			// This checks if input is a number
			while (!scan.hasNextInt()) {
				System.out.println("Please enter a numeric value");
				scan.nextLine();

			}
			userInput1 = scan.nextInt();

			while (userInput1 < 1 || userInput1 > 100) {
				System.out.println("Whoops!" + userName + ", " + "please enter a whole number between 1 and 100.");
				userInput1 = scan.nextInt();
			}
			if ((userInput1 >= 1) || (userInput1 <= 100)) {
				System.out.println("Thank you, " + userName);
			}

			// This detects whether user input is even or odd and prints an output based on
			// that
			int userQuotient = 0;
			userQuotient = userInput1 % 2;

			if (userQuotient != 0)
				;
			{
				System.out.println(userName + ", " + userInput1 + " is odd.");
			}
			if ((userQuotient == 0) && (userInput1 >= 2 || userInput1 <= 25)) {
				System.out.println("Your input is even and less than 25, " + userName + ".");
			}
			if ((userQuotient == 0) && (userInput1 >= 26 || userInput1 <= 60)) {
				System.out.println("Even.");
			}
			if ((userQuotient == 0) && (userInput1 > 60)) {
				System.out.println(userInput1 + "Even.");
			}
			if ((userQuotient != 0) && (userInput1 > 60)) {
				System.out.println("Your input is odd and over 60, " + userName + ".");

		
			}
			// Asking use would he/she like to enter another number
			System.out.println(
					"Would you like to continue checking whether numbers are even or odd? Enter Y for yes, or N for no.");
			userCont = scan.next();
		} //while (userCont.equalsIgnoreCase("y"));
		
		System.out.println("Goodbye!");
		scan.close();
	}
}
