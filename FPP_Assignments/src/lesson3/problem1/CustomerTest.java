package lesson3.problem1;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer[] customer = new Customer[3];
		Address[] address = new Address[6];
		Address city ;
		
		customer[0] = new Customer("Meron", "Mohammed", "1234");
		customer[1] = new Customer("Meron", "Tesfaye", "1456");
		customer[2] = new Customer("Seron", "Tadesse", "1789");
		
		address[0] = new Address("1000 4th", "Fairfeild", "Iowa", "55125");
		address[1] = address[0];
		address[2] = new Address("1000 4th", "Chicago", "Illinois", "55125");
		address[3] = new Address("hamberger", "colombus", "Ohio", "55125");
		address[4] = new Address("bela", "Fairfeld", "Minnesota", "55125");
		address[5] = new Address("Lakewood", "Seattle", "Washington", "55125");
		
		customer[0].setBillingAddress(address[0]);
		customer[0].setShippingAddress(address[1]);
		customer[1].setBillingAddress(address[2]);
		customer[1].setShippingAddress(address[3]);
		customer[2].setBillingAddress(address[4]);
		customer[2].setShippingAddress(address[5]);
		
		for(Customer person: customer)
		{
			city = person.getBillingAddress();
			
			if(city.getCity().equalsIgnoreCase("chicago"))
				System.out.println(person.toString());
			
		}
		

	}

}
