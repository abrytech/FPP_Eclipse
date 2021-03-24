

import java.util.Scanner;

public class Prog4 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type in a string: ");
		String input = sc.nextLine();
		int len = input.length();
		for(int i = len-1; i >= 0; --i){
			System.out.print(input.charAt(i));
		}
		

	}

}
