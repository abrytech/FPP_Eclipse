package lesson5.problem2;

import java.time.LocalDate;
import java.util.Scanner;

public class DepMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String answer;
		double totalSalary = 0;

		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = new Professor("Meron", 150000, LocalDate.of(2020, 4, 7), 80);
		department[1] = new Secretary("Kalkidan", 50000, LocalDate.of(2012, 5, 17), 60);
		department[2] = new Professor("Nobel", 15000, LocalDate.of(2013, 2, 6), 10);
		department[3] = new Secretary("Mule", 10000, LocalDate.of(2021, 11, 23), 1);
		department[4] = new Professor("Kirubel", 15000, LocalDate.of(2023, 9, 5), 60);
		
		System.out.println("Do you want  to see the sum of all Professor and Secretary salary in the\r\n" + 
				"department(y/n)");
		answer = scan.nextLine();
		if(answer.equalsIgnoreCase("y"))
		{
			for(DeptEmployee emo: department)
			{
				totalSalary += emo.computeSalary();
			}
			System.out.println("Their totla salary is " + totalSalary);
		}
		
	}

}
