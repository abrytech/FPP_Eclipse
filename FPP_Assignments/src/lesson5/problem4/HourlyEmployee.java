package lesson5.problem4;

public class HourlyEmployee extends Employee{
	
	private double wage;
	private double hours;
	
	public HourlyEmployee(String firstName, String lastName, String ssn, double wage, double hours) 
	{
		super(firstName, lastName, ssn);
		this.wage = wage;
		this.hours = hours;
	}
	
	public HourlyEmployee(double wage, double hours) 
	{
		super();		
		this.wage = wage;
		this.hours = hours;
	}

	@Override
	public double getPayment() {
		
		return hours * wage;
	}
	
	@Override
	public String toString()
	{
		return (super.toString() + "Wage = " + wage + "\nHours = " + hours + "\n");
	}
	
}
