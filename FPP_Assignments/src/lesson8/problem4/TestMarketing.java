package lesson8.problem4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarketing {
	
	
	public static void main(String[] args)
	{
		List<Marketing> market = new ArrayList<>();
		Marketing market1 = new Marketing("e1", "p1", 1);
		Marketing market2 = new Marketing("e2", "p2", 2);
		Marketing market3 = new Marketing("e3", "p3", 3);
		market.add(market1);
		market.add(market2);
		market.add(market3);
		market.add(new Marketing("Yitay", "House", 3500));
		market.add(new Marketing("Mery", "Cars", 17000));
		market.add(new Marketing("Mami", "Hotel", 300));
		market.add(new Marketing("Anu", "Laptop", 700));
		market.add(new Marketing("Kal", "Iphone", 1500));
		market.add(new Marketing("Seli", "Playbook", 7000));
		
		System.out.println("Inserted datas are \n" + market);
		market.remove(market2);
		System.out.println("After removing market 2 \n" + market);
		System.out.println("Size = " + market.size());
		
		Collections.sort(market, new SalesamountComparator());
		System.out.println("Sorted using price \n" + market);
		List<Marketing> sorted = listMoreThan1000(market);
		System.out.println("Sorted by name and listMoreThan1000\n" + sorted);
		 
		
	}

	 public static List<Marketing> listMoreThan1000(List<Marketing> list){
		   // Implement a body
		 List<Marketing> moreThan1000 = new ArrayList<>();
		 for(Marketing temp : list)
		 {
			 if(temp.getSalesamount() > 1000)
				 moreThan1000.add(temp);
		 }
		 Collections.sort(moreThan1000, new EmployeeNameComparator());
		 return moreThan1000;
		}

	
}
