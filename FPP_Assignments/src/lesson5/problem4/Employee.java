package lesson5.problem4;

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private String SocialSecutityNumber;
	
	public Employee()
	{
		
	}
	
	public Employee(String firstName, String lastName, String ssn)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		SocialSecutityNumber = ssn;
	}
	
	public abstract double getPayment();
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString()
	{
		return "Full Name = " + firstName + " " + lastName
				+"\nSSN = can't display for securiyt purspose. \n";
	}

}
