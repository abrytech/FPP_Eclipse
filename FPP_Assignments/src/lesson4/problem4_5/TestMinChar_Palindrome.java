package lesson4.problem4_5;

import static org.junit.Assert.*;

import org.junit.Test;

import lesson4.problem2.MinChar;

public class TestMinChar_Palindrome {

	@Test
	public void test() {
		// fail("Not yet implemented");
		
		Palindrome ob = new Palindrome();
		boolean output = ob.isPalindrome("noon");
		boolean expected = true;		
		assertEquals(output, expected);
	}
	
	@Test
	public void test2() {
		// fail("Not yet implemented");
		
		char output = MinChar.minChar("java");
		char expected = 'a';		
		assertEquals(output, expected);
	}

}
