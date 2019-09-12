package lesson5.problem6.shallocopy;

import lesson5.problem5.Computer;

public class Person implements Cloneable {
	
	String name;
	Computer computer;
	
	public Person(String name, Computer computer)
	{
		this.name = name;
		this.computer = computer;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		Person person = (Person) super.clone();
		return person;
	}
	
	@Override
	public String toString()
	{
		return String.format("Name = %s \nComputer\n%S", name, computer);
	}
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Computer computer = new Computer("Microsoft", "Inter(R) Core(TM) i7", 16, 1.80);
		Person mery = new Person("Meron", computer);
		
		System.out.println("Before Cloning");
		System.out.println(mery);
		
		Person sary = (Person) mery.clone();
		System.out.println();
		System.out.println("After Cloning");
		System.out.println(sary);
		
		mery.computer.setRamSize(8);
		System.out.println();
		System.out.println("After Modifing the Ram Size.");
		System.out.println(sary);
		
	}

}
