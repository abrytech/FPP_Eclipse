package lesson3.problem5;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class MyDate {
	
	private int year;
	private int month;
	private int day;
	private int daysOfYear;
	private String wordmonth;
	private Month TMonth;
	
	MyDate(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	MyDate(String wordmonth, int year, int day)
	{
		this.year = year;
		this.wordmonth = wordmonth;
		this.day = day;
		TMonth = Month.valueOf(wordmonth.toUpperCase());
	}
	
	MyDate(int daysOfYear, int year)
	{
		this.year = year;
		this.daysOfYear = daysOfYear;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		 int userYear;
		 int userMonth;
		 int userDay;
		 int userDaysOfYear;
		 String userWordmonth, contin;
		 Scanner sc = new Scanner(System.in);
		
		do
		{
			displayMessage();
			
			int answer = sc.nextInt();			
			MyDate myDate;
			LocalDate date;
		
			switch(answer)
			{
			
			case 1: 
				System.out.println("Choice: " + answer);
				System.out.println("Enter Month:");
				userMonth = sc.nextInt();
				System.out.println("Enter Day:");
				userDay = sc.nextInt();
				System.out.println("Enter Year:");
				userYear = sc.nextInt();
							
				myDate = new MyDate(userYear, userMonth, userDay);
				date = LocalDate.of(myDate.getYear(), myDate.getMonth(), myDate.getDay());
				myDate.displayMessae(date);
				break;
				
			case 2:
				System.out.println("Choice: " + answer);
				System.out.println("Enter Month in text:");
				userWordmonth = sc.next();
				System.out.println("Enter Day:");
				userDay = sc.nextInt();
				System.out.println("Enter Year:");
				userYear = sc.nextInt();
							
				myDate = new MyDate(userWordmonth, userYear, userDay);
				date = LocalDate.of(myDate.getYear(), myDate.getTMonth(), myDate.getDay());
				myDate.displayMessae(date);
				
				break;
				
			case 3:
				System.out.println("Choice: " + answer);
				System.out.println("Enter Day of Year:");
				userDaysOfYear = sc.nextInt();
				System.out.println("Enter Year:");
				userYear = sc.nextInt();
							
				myDate = new MyDate(userDaysOfYear, userYear);
				date = LocalDate.ofYearDay(myDate.getYear(), myDate.getDaysOfYear());
				myDate.displayMessae(date);			
				break;
				
			case 4:
				exit();
				
			default:
				System.out.println("Wrong input");
			
			}
		
		
			System.out.println("Do you want to Continue :");
			contin = sc.next();
		}while(contin.equalsIgnoreCase("y"));
		
		sc.close();
		return;
	}
	
	

	private static void exit() {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getDaysOfYear() {
		return daysOfYear;
	}

	public String getWordmonth() {
		return wordmonth;
	}
	
	public Month getTMonth() {
		return TMonth;
	}

	private static void displayMessage() {
		// TODO Auto-generated method stub
		System.out.println("\nEnter 1 for format: MM/DD/YYYY");
		System.out.println("Enter 2 for format: Month DD, YYYY");
		System.out.println("Enter 3 for format: DDD YYYY");
		System.out.println("Enter 4 to exit");
		System.out.println("Choose your Choice :");
	}
	
	public void displayMessae(LocalDate date)
	{	
		System.out.println("MM/dd/yyyy: " + date.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
		System.out.println("MMMM dd,yyyy: " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
		System.out.println("DDD yyyy: " + date.getDayOfYear() + " " + date.getYear());
		System.out.println();
	}

}
