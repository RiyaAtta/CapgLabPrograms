package CaseStudy5;

import java.util.ArrayList;

public class CurrentAccount extends Account {
	ArrayList<CurrentAccount> cList = new ArrayList<>();
	static int i = 0;
	
//	Constructors
	CurrentAccount() { super(); }
	
	public void createCurrentAccount(Customer cc) {
		cList.add((CurrentAccount)cc);
		System.out.println("New current account created for: " + cList.get(i).getCustomerName());
		i += 1;
	}
	public void deleteCurrentAccount(int accNum) {
		boolean flag = true;
		for (int i = 0; i < cList.size(); i++) {
			if (cList.get(i).getAccountNumber() == accNum ) {
				cList.get(i).setClose(false);
				System.out.println("Current account closed for: " + cList.get(i).getCustomerName());
			}
			else {
				flag = false;
			}
		}
		if (flag == false)
			System.out.println("Current Account not found!");
	}
	public void displayCurrentAccount(int accNum) {
		boolean check = true;
		for (int i = 0; i < cList.size(); i++) {
			if (cList.get(i).getAccountNumber() == accNum && cList.get(i).getClose() == true)
				System.out.println("Name: " + cList.get(i).getCustomerName() + "\nEmail: " + cList.get(i).getEmail() + "\nDOB: " + cList.get(i).getAddress());
			else
				check = false;
		}
		if (check == false)
			System.out.println("User not found!");
	}
}