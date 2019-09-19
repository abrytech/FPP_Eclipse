package lesson8.problem4;

import java.util.Comparator;

public class SalesamountComparator implements Comparator<Marketing>{

	@Override
	public int compare(Marketing o1, Marketing o2) {
		// TODO Auto-generated method stub
		
		if(Double.compare(o1.getSalesamount(), o2.getSalesamount())!= 0)
		    return Double.compare(o1.getSalesamount(), o2.getSalesamount());		    		
		else if(o1.getProductname().compareTo(o2.getProductname()) != 0)
			return o1.getEmployeename().compareTo(o2.getEmployeename());
		else
			return o1.getEmployeename().compareTo(o2.getEmployeename());
		}
	}

