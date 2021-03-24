

public class Prog2 {

	
	public static void main(String[] args) {
		float sum = 1.27f + 3.881f + 9.6f;
		int truncate = (int)sum;
		int round = (int)Math.round(sum);
		System.out.println("Trunacated: " + truncate);
		System.out.println("Rounded: " + round);
	}

}
