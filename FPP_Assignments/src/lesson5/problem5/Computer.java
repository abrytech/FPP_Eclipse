package lesson5.problem5;

import java.util.Objects;

public class Computer {
	
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
	
	// java 7 way of overing hashcode method
	@Override
	public int hashCode()
	{
		int hashcode = 24;
		
		hashcode += manufacturer.hashCode();
		hashcode += processor.hashCode();
		hashcode += ramSize;
		
		long temp = Double.doubleToLongBits(processorSpeed);
		int intholder = (int)(temp * (temp>>>32));
		
		hashcode += intholder;
		
		return hashcode;
	} 
	
	/* java 8 way of overing hashcode method
	@Override
	public int hashCode()
	{
		return Objects.hash(manufacturer, processor, ramSize, processorSpeed);
	}*/
	
	
}
