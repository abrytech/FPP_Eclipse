package lesson3.problem4;

import java.util.Scanner;

public class MainShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter C for Circle\n" + "Enter R for Rectangle\n" + "Enter T for Triangle\n");
		String choice = sc.nextLine();

		switch (choice) {

		case "T":

			System.out.println("Enter the base of the Triangle");
			double base = sc.nextDouble();

			System.out.println("Enter the height of the Triangle");
			double height = sc.nextDouble();

			Triangle TArea = new Triangle(base, height);

			System.out.println("The area of Triangle is : " + TArea.computeArea());
			break;

		case "C":

			System.out.println("Enter the Radius of the Circle");
			double radius = sc.nextDouble();

			Circle CArea = new Circle(radius);

			System.out.println("The Area of the Circle is :" + CArea.computeArea());
			break;

		case "R":

			System.out.println("Enter the Length of the Rectangle");
			double length = sc.nextDouble();

			System.out.println("Enter the Width of the Rectangle");
			double width = sc.nextDouble();

			Rectangle RArea = new Rectangle(width, length);

			System.out.println("The area of the rectangle is :" + RArea.computeArea());
			break;

		default:

			System.out.println("Wrong Choice");

		}

		sc.close();
	}

}