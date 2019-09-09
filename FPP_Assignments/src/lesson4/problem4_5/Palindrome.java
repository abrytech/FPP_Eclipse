package lesson4.problem4_5;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Palindrome ob = new Palindrome();
		System.out.println(ob.isPalindrome("madam"));
		System.out.println(ob.isPalindrome("meron"));

	}

	public boolean isPalindrome(String word) {

		if (word.length() <= 1)
			return true;
		if (word.charAt(0) != word.charAt(word.length() - 1))
			return false;
		return isPalindrome(word.substring(1, word.length() - 1));
	}

}
