package lesson4.problem1;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "ace";
		String string2 = "bdf";
		
		System.out.println(merge(string1, string2));

	}

	public static String merge(String s, String t)
	{
		String mergedWord = mergeWord(s, t);
		
		return mergedWord;
	}

	private static String mergeWord(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length() == 0 && s2.length() > 0) 
			return s2;
		if(s1.length() > 0 && s2.length() == 0) 
			return s1;
		
		if(s1.charAt(0) >= s2.charAt(0))
			return s2.substring(0,1) + mergeWord(s1,s2.substring(1));
		else  if(s1.charAt(0) <= s2.charAt(0))
			return s1.substring(0,1) + mergeWord(s1.substring(1),s2);

		return null;
	}
}
