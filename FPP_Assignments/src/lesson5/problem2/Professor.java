package lesson5.problem2;

import java.time.LocalDate;

public class Professor extends DeptEmployee{

	private int numberOfPublications;
	
	public Professor(String name, double salary, LocalDate date, int publication) {
		super(name, salary, date);

		numberOfPublications = publication;		
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	
	
}
