package lesson3.problem2;

public class MainEmployeeAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String name, String aNickName, double aSalary, int aYear,int aMonth, int aDay
		Employee employee = new Employee("Meron", "Mery", 12000, 2020, 4, 4);
		
		//checking account  Employee emp, String acctType, double balance
		Account checkingAcc = new Account(employee, "CHECKING", 300);
		
		//saving account
		Account savingingAcc = new Account(employee, "SAVINGS", 300);
		
		//retirement account
		Account retirementAcc = new Account(employee, "RETIREMENT", 300);
		
		checkingAcc.makeDeposit(5000);
		savingingAcc.makeDeposit(10);
		retirementAcc.makeDeposit(500);
		
		checkingAcc.makeWithdrawal(300);
		savingingAcc.makeWithdrawal(310);
		retirementAcc.makeWithdrawal(500);
		
		System.out.println(checkingAcc.toString());
		System.out.println(savingingAcc.toString());
		System.out.println(retirementAcc.toString());
		

	}

}
