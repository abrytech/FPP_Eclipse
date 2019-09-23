package lesson11.problem2;

import java.util.Comparator;

public class SSNComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		if(o1.getSsn().compareTo(o2.getSsn()) != 0)
			return o1.getSsn().compareTo(o2.getSsn());
		else if(o1.getName().compareTo(o2.getName()) != 0)
			return o1.getName().compareTo(o2.getName());
		else
			return Integer.compare(o1.getSalary(), o2.getSalary());
		
	}

}
