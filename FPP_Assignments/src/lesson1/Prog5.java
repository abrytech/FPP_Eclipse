


public class Prog5 {
	public static void main(String[] args){

		//populate a 4x4 matrix with random ints in the range 1..99
		int[][] rand = new int[4][4];
		for(int i = 0; i < 4; ++i){
			for(int j = 0; j<4; ++j){
				rand[i][j] = getRandomInt(1,99);
			}
		}
		//create addition problems by using format method from java.lang.String
		String output = "";
		String nineNewlines = "%n%n%n%n%n%n%n%n%n";
		String equalsBar = "____";
		//row 1
		output = String.format("%16d %12d %12d %12d %n %n", 
				rand[0][0], rand[0][1], rand[0][2], rand[0][3]);
		
		output += String.format("%13s %2d %9s %2d %9s %2d %9s %2d %n","+", 
				rand[1][0], "+", rand[1][1],"+", rand[1][2],"+",rand[1][3]);
		
		output += String.format("%16s %12s %12s %12s"+nineNewlines,equalsBar, equalsBar,equalsBar,equalsBar);
		
		//row 2
		output += String.format("%16d %12d %12d %12d %n %n", 
				rand[2][0], rand[2][1], rand[2][2], rand[2][3]);
		
		output += String.format("%13s %2d %9s %2d %9s %2d %9s %2d %n","+", 
				rand[3][0], "+", rand[3][1],"+", rand[3][2],"+",rand[3][3]);
		output += String.format("%16s %12s %12s %12s",equalsBar, equalsBar,equalsBar,equalsBar);
		System.out.println(output);
	}
}
