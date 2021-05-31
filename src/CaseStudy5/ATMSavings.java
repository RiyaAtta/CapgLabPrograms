package CaseStudy5;

import java.util.Scanner;

public class ATMSavings extends SavingsAccount {
	private double withdraw;
	private double deposit;
	private SavingsAccount s = new SavingsAccount();
	Scanner sc = new Scanner(System.in);
	
//	Constructor
	ATMSavings() { super(); }

//	Getters
	public double getWithdraw() { return withdraw; }
	public double getDeposit() { return deposit; }
	public SavingsAccount getS() { return s; }
	
//	Setters
	public void setWithdraw(double withdraw) { this.withdraw = withdraw; }
	public void setDeposit(double deposit) { this.deposit = deposit; }
	public void setS(SavingsAccount s) { this.s = s; }
	
//	Methods
	public void depositAmount(int accNum) {
		for (int i = 0; i < s.sList.size(); i++) {
			if (s.sList.get(i).getAccountNumber() == accNum && s.sList.get(i).getClose() == false) {
				s.sList.get(i).setBalance(s.sList.get(i).getBalance() + getDeposit());
				System.out.println("Amount deposited in Savings account!");
			}
			else {
				System.out.println("User entered wrong information");
			}
		}
	}
	public void withdrawAmount(int accNum, String pass) {
		for (int i = 0; i < s.sList.size(); i++) {
			if (s.sList.get(i).getAccountNumber() == accNum && s.sList.get(i).getClose() == false) {
				s.sList.get(i).setBalance(s.sList.get(i).getBalance() - getWithdraw());
				System.out.println("Amount withdrawn from Savings Account");
			}
			else {
				System.out.println("User entered wrong information");
			}
		}
	}
	public void checkAmount(int accNum, String pass) {
		for (int i = 0; i < s.sList.size(); i++) {
			if (s.sList.get(i).getAccountNumber() == accNum && s.sList.get(i).getClose() == false) {
				System.out.println("Name: " + s.getCustomerName());
				System.out.println("Account number: " + s.getAccountNumber());
				System.out.println("Balance: " + s.getBalance());
			}
		}
	}
}
