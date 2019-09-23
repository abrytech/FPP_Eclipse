package lesson11.problem3;

/** NOTE: You must override equals in this class */
public class Employee {
	private String name;
	private int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override 
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}	
	
	@Override
	public boolean equals(Object ob)
	{
		if(ob == this) return true;
		if(ob == null) return false;
		if(!(ob instanceof Employee)) return false;
		Employee temp = (Employee) ob;
		
		if(name.equals(temp.getName()) && salary == temp.getSalary())
			return true;
		else 
			return false;
	}
}
