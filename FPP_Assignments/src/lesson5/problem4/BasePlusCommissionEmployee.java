package lesson5.problem4;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String name, String lastName, String SSN, double grossSales, double commissionRate, double baseSalary)
	{
		super(name, lastName, SSN, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}
	
	public BasePlusCommissionEmployee(double grossSales, double commissionRate, double baseSalary)
	{
		super(grossSales, commissionRate);

		this.baseSalary = baseSalary;
	}
	
	@Override
	public double getPayment()
	{
		return (baseSalary + (super.getPayment()));
	}	
	
	@Override
	public String toString()
	{
		return (super.toString() + "Base Salary = " + baseSalary + "\n");
	}
}
