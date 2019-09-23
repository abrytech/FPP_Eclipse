package lesson12.problem1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Input_0_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double input = 0;
		while (true) {
			System.out.println();
			System.out.print("Enter your number ->  ");
			try {
				Scanner in = new Scanner(System.in);
				input = in.nextDouble();
				if (input < 0 || input > 100)
					throw new UnsupportedOperationException("Your input must be 0 to 100");
				else {
					System.out.println("Correct Input -> " + input);
					break;
				}
			} catch (InputMismatchException | UnsupportedOperationException e) {
				System.out.println("\nPlease enter correct Input");
				System.err.print(e);
			}
		}
		
	}

}
