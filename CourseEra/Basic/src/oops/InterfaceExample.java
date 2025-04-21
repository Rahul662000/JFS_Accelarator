package oops;

interface IABCAccount{
	void openAccount();
	void closeAccount();
}

interface IBankAccount{
	void deposit();
	void withdrawn();
	void balance();
}

class Saving implements IBankAccount , IABCAccount{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit in Saving Account");
	}

	@Override
	public void withdrawn() {
		// TODO Auto-generated method stub
		System.out.println("WithDrawn From Saving Account");
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("Balance in Saving Account");
	}

	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		System.out.println("Open Account");
	}

	@Override
	public void closeAccount() {
		// TODO Auto-generated method stub
		System.out.println("Close Account");
	}
	
}

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saving saving = new Saving();
		saving.deposit();
		saving.withdrawn();
		saving.balance();
		saving.openAccount();
		saving.closeAccount();
	}

}
