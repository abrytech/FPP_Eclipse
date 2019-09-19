package lesson8.problem4;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Marketing> {

	@Override
	public int compare(Marketing o1, Marketing o2) {
		// TODO Auto-generated method stub
		return o1.getEmployeename().compareTo(o2.getEmployeename());
	}

}
