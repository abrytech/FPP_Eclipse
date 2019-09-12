package lesson5.problem1;

public class Circle extends Shape{
	
	private double radius;
	private String color;
	
	public Circle(String color, double radius)
	{
		super(color);
		this.radius = radius;
	}
	
	@Override
	public double calculateArea()
	{
		return Math.PI * Math.sqrt(radius);
	}
	
	@Override
	public double calculatePerimeter()
	{
		return Math.PI * radius * 2;
	}
}
