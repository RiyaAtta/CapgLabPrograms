package CaseStudy5;

import java.util.ArrayList;

public class SavingsAccount extends Account {
	ArrayList<SavingsAccount> sList = new ArrayList<>();
	static int i = 0;
	
//	Constructors
	SavingsAccount() { super(); }
	
	public void createSavingsAccount(Customer sc) {
		sList.add((SavingsAccount) sc);
		System.out.println("New savings account created for: " + sList.get(i).getCustomerName());
		i += 1;
	}
	public void deleteSavingsAccount(int accNum) {
		boolean flag = true;
		for (int i = 0; i < sList.size(); i++) {
			if (sList.get(i).getAccountNumber() == accNum) {
				sList.get(i).setClose(false);
				System.out.println("Savings account closed for: " + sList.get(i).getCustomerName());
			}
			else {
				flag = false;
			}
		}
		if (flag == false)
			System.out.println("Savings Account not found!");
	}
	public void displaySavingsAccount(int accNum) {
		boolean check = true;
		for (int i = 0; i < sList.size(); i++) {
			if (sList.get(i).getAccountNumber() == accNum && sList.get(i).getClose() == true)
				System.out.println("Name: " + sList.get(i).getCustomerName() + "\nEmail: " + sList.get(i).getEmail() + "\nAddress: " + sList.get(i).getAddress());
			else
				check = false;
		}
		if (check == false)
			System.out.println("User not found!");
	}
}