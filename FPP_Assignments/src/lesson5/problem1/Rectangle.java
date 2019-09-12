package lesson5.problem1;

public class Rectangle extends Shape{
	
	protected double width;
	protected double height;
	
	public Rectangle(String color, double width, double height)
	{
		super(color);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calculateArea()
	{
		return width * height;
	}
	
	@Override
	public double calculatePerimeter()
	{
		return 2 * (width + height);
	}

}
