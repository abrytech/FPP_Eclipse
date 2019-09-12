package lesson5.problem4;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double totalSalary = 0;

		Employee[] employee = {
				new HourlyEmployee("Hana", "Belay","1234567123", 1000, 32),
				new BasePlusCommissionEmployee("Selam", "Abi","1267123453", 4500, 50, 4000),
				new SalariedEmployee("Yitay", "Habte","1567122343", 700),
				new CommissionEmployee("Jhon", "Killer","1271345623", 1000, 32),
				new HourlyEmployee("chris", "Dan","1232345671", 2000, 30),
		};
		
		for(Employee emp: employee)
		{
			totalSalary += emp.getPayment();
			System.out.println(emp);
		}
		
		System.out.println("Their total salary is " + totalSalary);
		
	}

}
