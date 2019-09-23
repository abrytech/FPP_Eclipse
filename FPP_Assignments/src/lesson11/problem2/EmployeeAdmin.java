package lesson11.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class EmployeeAdmin {
	
	/**
		Returns a list of Employees whose social security number is on the input list socSecNums
		and whose salary is > 80000. The list must be ordered by social security number,
		from lowest to highest. To sort, you must use a Collections sorting method
		and you must define your own Comparator to be used to compare Employees by ssn. 
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
		
		Iterator<String> enumr; 
		Employee employ;
		String keys;
		List<Employee> emploList = new ArrayList<>();
		
		for(enumr = table.keySet().iterator(); enumr.hasNext();)
		{
			keys = enumr.next();
			employ = table.get(keys);
			
			for(int i = 0; i < socSecNums.size(); i++)
			{
				
			if(employ.getSsn().equals(socSecNums.get(i)) && (employ.getSalary() > 80000))
			{
				emploList.add(employ);
			}
			
			}
		}
		
		Collections.sort(emploList, new SSNComparator());
		
		return emploList;
		
	}
	
}
