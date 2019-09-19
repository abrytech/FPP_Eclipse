package lesson8.problem4;

import java.util.Objects;

public class Marketing {

	private String employeename;
	private String productname;
	private double salesamount;
	
	public Marketing(String employeename, String productname, double salesamount) {
		this.employeename = employeename;
		this.productname = productname;
		this.salesamount = salesamount;
	}
	
	public String getEmployeename() {
		return employeename;
	}

	public String getProductname() {
		return productname;
	}

	public double getSalesamount() {
		return salesamount;
	}

	@Override
	public String toString()
	{
		return new StringBuilder("\nEmploye Name = " + employeename + ""
				+ ", Product Name = " + productname + ""
						+ ", Sales Amount = " + salesamount).toString();
	}
	
	@Override
	public boolean equals(Object ob)
	{
		if(ob == null || this == null) return false;
		if(ob == this) return true;
		if(!(ob instanceof Marketing)) return false;
		Marketing market = (Marketing) ob;
		if(employeename.equals(market.employeename) && (productname.equals(market.productname)) && (salesamount == market.salesamount))
		return true;
		else
			return false;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(salesamount, productname, employeename);
	}
	

}
