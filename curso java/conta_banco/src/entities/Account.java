package entities;

public class Account {
	private int accNumber;
	public String name;
	private double balance;
	
	
	public Account(int accNumber, String name) {
		super();
		this.accNumber = accNumber;
		this.name = name;
	}
	public Account(int accNumber, String name, double initialDeposit) {
		super();
		this.accNumber = accNumber;
		this.name = name;
		deposit(initialDeposit);
	}
	
	public int getAccNumber() {
		return accNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double value) {
		balance += value;
	}
	public void withdraw(double value) {
		balance -= (value + 5);
	}
	
	@Override
	public String toString() {
		return "Account "
				+ getAccNumber()
				+", Holder: "
				+ getName()
				+ ", Alex Green, Balance: "
				+ getBalance();
	}
}
