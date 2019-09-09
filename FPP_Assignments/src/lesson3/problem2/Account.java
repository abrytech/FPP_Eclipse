package lesson3.problem2;

public class Account {
	
	/*public final static String CHECKING = "checking";
	public final static String SAVINGS = "savings";
	public final static String RETIREMENT = "retirement";*/
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AcountType acctType;
	private Employee employee;

	Account(Employee employee, String acctType, double balance) {
		this.employee = employee;
		this.acctType = AcountType.valueOf(acctType);
		this.balance = balance;
	}

	Account(Employee emp, String acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	@Override 
	public String toString() {
		return "type = " + acctType.toString() + ", balance = $" + balance;
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

