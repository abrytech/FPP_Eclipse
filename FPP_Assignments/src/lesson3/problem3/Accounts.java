package lesson3.problem3;

import lesson3.problem3.employeeinfo.Employee;

public class Accounts {
	
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AcountType acctType;
	private Employee employee;

	public Accounts(Employee emp, String acctType, double balance) {
		employee = emp;
		this.acctType = AcountType.valueOf(acctType);
		this.balance = balance;
	}

	Accounts(Employee emp, String acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	@Override 
	public String toString() {
		return "Account type: " + acctType.toString().toLowerCase() + "\nCurrent bal: " + balance + "\n";
	}

	public void makeDeposit(double deposit) {
		// implement
		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// implement
		boolean withdraw = false;
		
		if(balance > amount)
		{
			balance -= amount;
			withdraw = true;
		}
		else
			withdraw = false;
		
		return withdraw;
	}
	
	public double getBalance() {
		return balance;
	}

	public AcountType getAcctType() {
		return acctType;
	}
}

