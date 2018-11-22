package entities;

public class Acount {
	private int number;
	private String holder;
	private double balance;
	
	public Acount() {
		
	}
	
	public Acount(int number, String holder, double InitialDeposit) {
		super();
		this.number = number;
		this.holder = holder;
		Deposit(InitialDeposit);
	}

	public Acount(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void Deposit(double value) 
	{
		balance += value;
	}
	
	public void Withdraw(double value) 
	{
		balance -= value + 5;
	}
	
	public String toString() 
	{
		return "Acount "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
