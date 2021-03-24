

public class Prog1 {

	
	public static void main(String[] args) {
		int x = RandomNumbers.getRandomInt(1,9);
		int y = RandomNumbers.getRandomInt(3,14);
		double piTox = Math.pow(Math.PI,x);
		double yToPi = Math.pow(y,Math.PI);
		System.out.println("pi^x = "+ piTox);
		System.out.println("y^pi = "+ yToPi);

	}

}
