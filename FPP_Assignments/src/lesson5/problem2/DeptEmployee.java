package lesson5.problem2;

import java.time.LocalDate;

public class DeptEmployee {
	
	private String name;
	private double salary;
	private LocalDate hireDate;
	
	public DeptEmployee(String name, double salary, LocalDate date)
	{
		this.name = name;
		this.salary = salary;
		hireDate = date;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public double computeSalary()
	{
		return salary;
	}

}
