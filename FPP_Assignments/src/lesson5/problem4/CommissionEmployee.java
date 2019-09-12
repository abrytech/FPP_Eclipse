package lesson5.problem4;

public class CommissionEmployee extends Employee {
	
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String name, String lastName, String SSN, double grossSales, double commissionRate)
	{
		super(name, lastName, SSN);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	public CommissionEmployee(String name, String lastName, String SSN)
	{
		super(name, lastName, SSN);
	}
	
	public CommissionEmployee(double grossSales, double commissionRate)
	{
		super();
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	@Override
	public double getPayment() {
			
		return (grossSales * (commissionRate/100));
	}
	
	@Override
	public String toString()
	{
		return (super.toString() + "Gross Sales = " + grossSales + "\nCommission Rate = " + commissionRate + "\n");
	}

}
