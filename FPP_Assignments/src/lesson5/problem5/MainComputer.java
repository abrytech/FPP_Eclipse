package lesson5.problem5;

public class MainComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer1 = new Computer("Microsoft", "Inter(R) Core(TM) i7", 16, 1.80);
		Computer computer2 = new Computer("Microsoft", "Inter(R) Core(TM) i7", 16, 1.80);
		Computer computer3 = new Computer("Microsoft", "Inter(R) Core(TM) i5", 8, 1.80);
		//String newline = System.getProperty("line.separator");
		
		System.out.println("computer1\n" + computer1);
		System.out.println("The computer power is = " + computer1.computePower());
		System.out.println();
		
		System.out.println("computer2\n" + computer2);
		System.out.println("The computer power is = " + computer2.computePower());
		System.out.println();
		
		System.out.println("computer3\n" + computer3);
		System.out.println("The computer power is = " + computer3.computePower());
		System.out.println();
		
		System.out.println("computer1 equals computer2 = " + computer1.equals(computer2));
		System.out.println("computer1 equals computer3 = " + computer1.equals(computer3));
		System.out.println();
		
		System.out.println("Computer 1 hashcode = " + computer1.hashCode());
		System.out.println("Computer 2 hashcode = " + computer2.hashCode());
		System.out.println("Computer 3 hashcode = " + computer3.hashCode());
		
	}

}
