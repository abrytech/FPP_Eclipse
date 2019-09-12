package lesson5.problem1;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape[] shapes = {new Rectangle("Green", 2, 3), new Square("yello", 4), new Circle("Red", 5), new Rectangle("Pink", 5, 4), new Square("Black", 7) };
		printTotal(shapes);
		
	}
	
	public static void printTotal(Shape[] shape)
	{
		double totalArea = 0;
		double totalPerimeter = 0;
		for(Shape no : shape) 
		{
			totalArea += no.calculateArea();
			totalPerimeter += no.calculatePerimeter();
		}
		
		System.out.println("The total Area of all 5 shapes is " + totalArea);
		System.out.println("The total Perimeter of all 5 shapes is " + totalPerimeter);
	}

}
