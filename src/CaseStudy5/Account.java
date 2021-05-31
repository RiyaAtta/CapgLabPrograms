package CaseStudy5;

public class Account extends Customer {
	private int AccountNumber;
	private double balance;
	private boolean close;
	
//	Constructors
	Account() { super(); }
	public Account(int accNum, double bal, String pass, boolean close) {
		super();
		this.AccountNumber = accNum;
		this.balance = bal;
		this.close = close;
	}
	
//	Getters
	public int getAccountNumber() { return AccountNumber; }
	public double getBalance() { return balance; }
	public boolean getClose() { return close; }
	
//	Setters
	public void setAccountNumber(int accountNumber) { AccountNumber = accountNumber; }
	public void setBalance(double balance) { this.balance = balance; }
	public void setClose(boolean close) { this.close = close; }
}