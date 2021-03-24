
public class Prob7 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < args.length; ++i) {
		System.out.println("Length of index " + i + " " + args[i] + " = "
		+ args[i].length());
		if (args[i].startsWith("A")) {
		count++;
		}
		}
		System.out.println("\nTotal starts with in spell A is = "+ count);

	}

}
