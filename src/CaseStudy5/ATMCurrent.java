package CaseStudy5;

import java.util.Scanner;

public class ATMCurrent extends CurrentAccount {
	private double withdraw;
	private double deposit;
	private CurrentAccount c = new CurrentAccount();
	Scanner sc = new Scanner(System.in);
	
//	Constructor
	ATMCurrent() { super(); }

//	Getters
	public double getWithdraw() { return withdraw; }
	public double getDeposit() { return deposit; }
	public CurrentAccount getC() { return c; }
	
//	Setters
	public void setWithdraw(double withdraw) { this.withdraw = withdraw; }
	public void setDeposit(double deposit) { this.deposit = deposit; }
	public void setC(CurrentAccount c) { this.c = c; }
	
//	Methods
	public void depositAmount(int accNum) {
		for (int i = 0; i < c.cList.size(); i++) {
			if (c.cList.get(i).getAccountNumber() == accNum && c.cList.get(i).getClose() == false) {
				c.cList.get(i).setBalance(c.cList.get(i).getBalance() + getDeposit());
				System.out.println("Amount deposited in Savings account!");
			}
			else {
				System.out.println("User entered wrong information");
			}
		}
	}
	public void withdrawAmount(int accNum, String pass) {
		for (int i = 0; i < c.cList.size(); i++) {
			if (c.cList.get(i).getAccountNumber() == accNum && c.cList.get(i).getClose() == false) {
				c.cList.get(i).setBalance(c.cList.get(i).getBalance() - getWithdraw());
				System.out.println("Amount withdrawn from Savings Account");
			}
			else {
				System.out.println("User entered wrong information");
			}
		}
	}
	public void checkAmount(int accNum, String pass) {
		for (int i = 0; i < c.cList.size(); i++) {
			if (c.cList.get(i).getAccountNumber() == accNum && c.cList.get(i).getClose() == false) {
				System.out.println("Name: " + c.getCustomerName());
				System.out.println("Account number: " + c.getAccountNumber());
				System.out.println("Balance: " + c.getBalance());
			}
		}
	}
}