package lesson3.problem3;

import java.util.Scanner;
import lesson3.problem3.employeeinfo.Employee;

public class Main {
	Employee[] emps = null;
	
	Main(){
		String info = "";
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[1].createNewRetirement(300);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);	
		
				
		Scanner scan = new Scanner(System.in);
		System.out.print("See a report of all account balances? (y/n) ");
		String answer = scan.next();
		if(answer.equalsIgnoreCase("y")){
			info = getFormattedAccountInfo();
			System.out.println(info);
		}
		else {
			//do nothing..the application ends here
		}	
	}
	
	public static void main(String[] args) {
		new Main();
	}
		
	String getFormattedAccountInfo(){
		//loop through employees array and get formatted
		//account info for each employee, and assemble into a string
		String employeeData = "";
		
		for(Employee emp: emps)
		{
			employeeData += "ACCOUNT INFO FOR " + emp.getName() + ":\n\n" + emp.getFormattedAcctInfo() + "\n";
		}
		
		return employeeData;
	}
}
