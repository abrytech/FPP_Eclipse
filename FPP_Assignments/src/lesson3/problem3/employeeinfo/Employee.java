package lesson3.problem3.employeeinfo;

import java.time.LocalDate;
import lesson3.problem3.AcountType;
import lesson3.problem3.Accounts;

import java.util.GregorianCalendar;

public class Employee {

	private Accounts savingsAcct;
	private Accounts checkingAcct;
	private Accounts retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	private boolean withdrawed = false;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		// update, using LocalDate

		GregorianCalendar cal = new GregorianCalendar(yearOfHire, monthOfHire - 1, dayOfHire);
		hireDate = LocalDate.of(cal.get(yearOfHire), 1 + cal.get(monthOfHire), cal.get(dayOfHire));

	}

	public void createNewChecking(double startAmount) {
		// implement
		checkingAcct = new Accounts(this, "CHECKING", startAmount);
	}

	public void createNewSavings(double startAmount) {
		// implement
		savingsAcct = new Accounts(this, "SAVINGS", startAmount);
	}

	public void createNewRetirement(double startAmount) {
		// implement
		retirementAcct = new Accounts(this, "RETIREMENT", startAmount);
	}

	public void deposit(String acctType, double amt) {
		// implement
		if (AcountType.valueOf(acctType).equals(AcountType.CHECKING)) {
			checkingAcct.makeDeposit(amt);
		} else if (AcountType.valueOf(acctType).equals(AcountType.SAVINGS)) {
			savingsAcct.makeDeposit(amt);
		} else if (AcountType.valueOf(acctType).equals(AcountType.RETIREMENT)) {
			retirementAcct.makeDeposit(amt);
		} else
			System.out.println("Incorrect Account");

	}

	public boolean withdraw(String acctType, double amt) {
		// implement
		if (AcountType.valueOf(acctType).equals(AcountType.CHECKING)) {
			checkingAcct.makeWithdrawal(amt);
		} else if (AcountType.valueOf(acctType).equals(AcountType.SAVINGS)) {
			savingsAcct.makeWithdrawal(amt);
		} else if (AcountType.valueOf(acctType).equals(AcountType.RETIREMENT)) {
			retirementAcct.makeWithdrawal(amt);
		} else
			System.out.println("Incorrect Account");

		return withdrawed;
	}

	public String getName() {
		return name;
	}
	
	public LocalDate getHireDate() {
		return hireDate;
	}

	public String getFormattedAcctInfo() throws NullPointerException{
		// implement

		String formatedInfo = "";

		if (!checkingAcct.equals(null)) {
			formatedInfo += checkingAcct.toString();
		}
		
		if (!savingsAcct.equals(null)) {
			formatedInfo += savingsAcct.toString();
		}
		
		if (!retirementAcct.equals(null)) {
			formatedInfo += retirementAcct.toString();
		}
		
		return formatedInfo;
	}

	public Accounts getSavingsAcct() {
		return savingsAcct;
	}

	public Accounts getCheckingAcct() {
		return checkingAcct;
	}

	public Accounts getRetirementAcct() {
		return retirementAcct;
	}

}
