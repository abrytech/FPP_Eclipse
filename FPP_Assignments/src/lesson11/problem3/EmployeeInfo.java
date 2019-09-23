package lesson11.problem3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import lesson11.problem3.util.Util;

public class EmployeeInfo {
	
	/**
	 * Removes from a copy of the input list all duplicate Employees,
	 * and then returns this list.
	 * 
	 * An Employee instance is considered to be a duplicate of another Employee
	 * instance if the two instances have the same name and salary.
	 */
	public static List<Employee> removeDuplicates(List<Employee> employees) {
		//IMPLEMENT
		
		List<Employee> noDup = new ArrayList<Employee>();
		noDup.add(employees.get(0));
		Iterator<Employee> emp = employees.iterator();
		Employee temp;
		
		for(; emp.hasNext();)
		{
			temp = emp.next();
			if(!noDup.contains(temp))
			{
				noDup.add(temp);
			}
		}
		 
		return noDup;
	}
	
	
	//DO NOT MODIFY
	/**
	 * Use the main method to test your solution
	 */
	public static void main(String[] args) {	
		List<Employee> myDupsRemoved = removeDuplicates(TestData.originalList);
		boolean dupsCorrectlyRemoved = Util.listsAreEqual(TestData.dupsRemoved, myDupsRemoved);
		System.out.println("Is answer correct? " + dupsCorrectlyRemoved);
	}
	
	

	 
}
