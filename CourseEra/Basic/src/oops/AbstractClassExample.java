package oops;

abstract class ABCBank{
	abstract void openAccount();
	abstract void closeAccount();
}


abstract class BankAccount extends ABCBank{
	
	abstract void deposit();
	abstract void withdraw();
	abstract void balance();
}

class SavingAccount extends BankAccount{

	@Override
	void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Depost in Saving Account");
	}

	@Override
	void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdrwn from Saving Account");
	}

	@Override
	void balance() {
		// TODO Auto-generated method stub
		System.out.println("Balance in Saving Account");
	}

	@Override
	void openAccount() {
		// TODO Auto-generated method stub
		System.out.println("Open Account");
	}

	@Override
	void closeAccount() {
		// TODO Auto-generated method stub
		System.out.println("Close Account");
	}
	
}

class CurrentAccount extends BankAccount{
	
	@Override
	void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Depost in Current Account");
	}

	@Override
	void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdrwn from Current Account");
	}

	@Override
	void balance() {
		// TODO Auto-generated method stub
		System.out.println("Balance in Current Account");
	}

	@Override
	void openAccount() {
		// TODO Auto-generated method stub
		System.out.println("Open Account");
	}

	@Override
	void closeAccount() {
		// TODO Auto-generated method stub
		System.out.println("Close Account");
	}
	
}

public class AbstractClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingAccount saveacc = new SavingAccount();
		saveacc.deposit();
		saveacc.balance();
		saveacc.withdraw();
		saveacc.openAccount();
		saveacc.closeAccount();
		
		CurrentAccount curracc = new CurrentAccount();
		curracc.deposit();
		curracc.balance();
		curracc.withdraw();
		curracc.openAccount();
		curracc.closeAccount();
		
	}

}
