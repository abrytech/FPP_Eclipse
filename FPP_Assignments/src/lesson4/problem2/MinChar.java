package lesson4.problem2;

public class MinChar {
	static char min = 'z' ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String character = "akel";
		
		System.out.println("The mininum character of " + character + " is " + minChar(character.toLowerCase()));
	}
	
	public static char minChar(String word){
		if(word.length() == 0)
			return min;
		if(min > word.charAt(0))
			min = word.charAt(0);
		
		return minChar(word.substring(1));
	}

}
