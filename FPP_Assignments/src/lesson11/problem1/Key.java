package lesson11.problem1;

import java.util.Objects;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	
	@Override 
	public boolean equals(Object ob)
	{
		if(ob == null) return false;
		if(ob == this) return true;
		if(!(ob instanceof Key)) return false;
		Key temp = (Key) ob;
		if(firstName.equals(temp.getFirstName()) && lastName.equals(temp.getLastName())) 
			return true;
			else
				return false;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(firstName, lastName);
	}
	
}
