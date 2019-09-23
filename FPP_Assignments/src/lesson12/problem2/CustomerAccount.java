package lesson12.problem2;

import java.util.Scanner;

class AccountCheckingException extends Exception {
	AccountCheckingException() {
		super();
	}

	AccountCheckingException(String msg) {
		super(msg);
	}

}

class CustomerAccount {
	String cus_Name;
	String acc_No;
	double balance;

	CustomerAccount(String cus_Name, String acc_No, double balance) {
		this.cus_Name = cus_Name;
		this.acc_No = acc_No;
		this.balance = balance;
	}

	public String getCustomerName() {
		return cus_Name;
	}
	
	public String getacc_No() {
		return cus_Name;
	}

	public void setCustomer_Name(String customerName) {
		this.cus_Name = customerName;
	}

	public double getBalance() {
		try
		{
		if (this.balance < 100.0)
			throw new AccountCheckingException();
		else
			return balance;
		}
		catch(AccountCheckingException ex)
		{
			System.out.println(new AccountCheckingException("Your balance is below 100, please maintain minimum balance"));
		}
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {

		balance = balance + amount;

	}

	public void withdraw(double amount) throws AccountCheckingException {
		double original = this.balance;
		try {
		if (this.balance < amount) {
			throw new AccountCheckingException();
		}
		else
		{
			System.out.println("Withdraw Successfull");
			this.balance -= amount;
		}
		}
		catch(AccountCheckingException ac)
		{
			System.out.println("Sorry!, you dont have sufficient deposit to withdrow: withdraw amount shoud be <= " + this.balance);
		}

		
	}
	
	public static void main(String[] args) throws AccountCheckingException {
		   Scanner sc1=new Scanner(System.in);
		   String n, a;
		   double d;
		   int choice = 0;
		   System.out.println("Enter your name:");
		   a=sc1.nextLine();
		   System.out.println("Enter your Accunt Number:");
		   n=sc1.nextLine();
		   System.out.println("Enter initial saving amount:");
		   d=sc1.nextDouble();
		   
		   CustomerAccount ca=new CustomerAccount(n, a, d);
		   System.out.println("----------------------------------------------------");
		   System.out.println("Enter 1 to withdraw: ");
		   System.out.println("Enter 2 to deposit: ");
		   System.out.println("Enter 3 to get Balance");
		   System.out.println("----------------------------------------------------");
		   do{
		   System.out.println("Enter Your Choice : ");
		   choice=sc1.nextInt();
		   
		   switch(choice){
			   case 1:
				   System.out.println("Enter the withdraw amount");
				   d=sc1.nextDouble();
				   ca.withdraw(d);
				   break;
			   case 2:
				   System.out.println("Enter the amount to deposit");
				   d=sc1.nextDouble();
				   if(d<0){
					   AccountCheckingException ace=new AccountCheckingException("Deposit amount cannot be negative");
					   throw ace;
				   }
				   else{
				   ca.deposit(d);
				   break;
				   }
				  
			   case 3: 
				    
				  System.out.println("Your Current Balance :" +ca.getBalance());
				  break;
			   case 4: System.out.println("Invalid Choice");
			           break;  
		   }
		 }while(choice > 0 && choice <=3);
	}

}

