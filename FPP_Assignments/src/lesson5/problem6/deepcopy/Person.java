package lesson5.problem6.deepcopy;

import java.util.Objects;

class Person implements Cloneable{

	private String name;
	private Computer computer;
	
	public Person(String name, Computer computer)
	{
		this.name = name;
		this.computer = computer;
	}
	
	@Override
	public String toString()
	{
		return String.format("Name = %s \nComputer\n%S", name, computer);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		Person person = (Person) super.clone();
		person.computer = (Computer)this.computer.clone();
		return person;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub

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

 class Computer implements Cloneable{
	
	private String manufacturer;
	private String processor;
	int ramSize;
	double processorSpeed;
	
	public Computer(String manufacturer, String processor, int ramSize, double processorSpeed)
	{
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.processorSpeed = processorSpeed;
	}

	public int getRamSize() {
		return ramSize;
	}

	public double getProcessorSpeed() {
		return processorSpeed;
	}
		
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public double computePower() {
		return ramSize * processorSpeed;
	}
	
	@Override
	public String toString()
	{
		return String.format("Manufacturer = %s \nprocessor = %s \nramSize = %sGB \nprocessor Speed = %sGHz", manufacturer, processor, ramSize, processorSpeed);
	}
	
	@Override
	public boolean equals(Object object)
	{
		if(object == null) return false;
		if(object == this) return true;
		if(!(object instanceof Computer)) return false;
				
		Computer computer = (Computer) object;
		
		if(this.manufacturer.equals(computer.manufacturer) && (this.processor.equals(computer.processor)) && (this.ramSize == (computer.ramSize)) && (this.processorSpeed == (computer.processorSpeed)))
			return true;
		else return false;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(manufacturer, processor, ramSize, processorSpeed);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return (Computer) super.clone();
	}
}


