package CaseStudy5;

import java.util.Scanner;

public class Main {
//	Savings
	public static void takeNameS() {
		SavingsAccount s = new SavingsAccount();
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		if (name != null) {
			s.setCustomerName(name);
		} else {
			System.out.println("Enter a valid name: ");
			takeNameS();
		}
		sc.close();
	}
	public static void takeAddressS() {
		SavingsAccount s = new SavingsAccount();
		Scanner sc = new Scanner(System.in);
		String add = sc.nextLine();
		if (add != null)
			s.setAddress(add);
		else {
			System.out.println("Enter address: ");
			takeAddressS();
		}
		sc.close();
	}
	public static void takeEmailS() {
		SavingsAccount s = new SavingsAccount();
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		if (email != null)
			s.setEmail(email);
		else {
			System.out.println("Enter email: ");
			takeEmailS();
		}
		sc.close();
	}
	
	public static void userInputS() {
		Scanner sc = new Scanner(System.in);
		SavingsAccount s = new SavingsAccount();
		s.setClose(false);
		System.out.println("Customer Details: ");
		
		System.out.println("Name: ");
		takeNameS();
		System.out.println("Address: ");
		takeAddressS();
		System.out.println("Email: ");
		takeEmailS();
		sc.close();
		
	}
	public static void displayUserS() {
		Scanner sc = new Scanner(System.in);
		SavingsAccount s = new SavingsAccount();
		System.out.println("Enter account number: ");
		int accNum = sc.nextInt();
		System.out.println("Account details: ");
		s.displaySavingsAccount(accNum);
		sc.close();
	}
	public static void closeAccountS() {
		Scanner sc = new Scanner(System.in);
		SavingsAccount s = new SavingsAccount();
		System.out.println("Enter account number: ");
		int accNum = sc.nextInt();
		s.deleteSavingsAccount(accNum);
		System.out.println("Account deleted!");
		sc.close();
	}
	
//	Current
	public static void takeNameC() {
		CurrentAccount c = new CurrentAccount();
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		if (name != null) {
			c.setCustomerName(name);
		} else {
			System.out.println("Enter a valid name: ");
			takeNameC();
		}
		sc.close();
	}
	public static void takeAddressC() {
		CurrentAccount c = new CurrentAccount();
		Scanner sc = new Scanner(System.in);
		String add = sc.nextLine();
		if (add != null)
			c.setAddress(add);
		else {
			System.out.println("Enter address: ");
			takeAddressC();
		}
		sc.close();
	}
	public static void takeEmailC() {
		CurrentAccount c = new CurrentAccount();
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		if (email != null)
			c.setEmail(email);
		else {
			System.out.println("Enter email: ");
			takeEmailC();
		}
		sc.close();
	}
	
	public static void userInputC() {
		Scanner sc = new Scanner(System.in);
		CurrentAccount c = new CurrentAccount();
		c.setClose(false);
		System.out.println("Customer Details: ");
		
		System.out.println("Name: ");
		takeNameS();
		System.out.println("Address: ");
		takeAddressS();
		System.out.println("Email: ");
		takeEmailC();
		sc.close();
		
	}
	public static void displayUserC() {
		Scanner sc = new Scanner(System.in);
		CurrentAccount c = new CurrentAccount();
		System.out.println("Enter account number: ");
		int accNum = sc.nextInt();
		System.out.println("Account details: ");
		c.displayCurrentAccount(accNum);
		sc.close();
	}
	public static void closeAccountC() {
		Scanner sc = new Scanner(System.in);
		CurrentAccount c = new CurrentAccount();
		System.out.println("Enter account number: ");
		int accNum = sc.nextInt();
		c.deleteCurrentAccount(accNum);
		System.out.println("Account deleted!");
		sc.close();
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ATMSavings aS = new ATMSavings();
//		ATMDeposit aD = new ATMDeposit();
		int ch1 = 0;
		int ch2 = 0;
		int ch3 = 0;
		do {
			System.out.println("Press:\n1. Savings Account\n2. Current Account\n3. Exit");
			ch1 = sc.nextInt();
			switch(ch1) {
			case 1:
				do {
					System.out.println("\nPress:\n1. Create Account\n2. View Account\n3. Close Account\n4. ATM\n5. Exit");
					ch2 = sc.nextInt();
					switch (ch2) {
					case 1:
						userInputS();
						break;
					case 2:
						displayUserS();
						break;
					case 3:
						closeAccountS();
						break;
					case 4:
						do {
							System.out.println("\nPress: 1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
							ch3 = sc.nextInt();
							switch (ch3) {
							case 1:
								System.out.println("Enter account number: ");
								int accNum = sc.nextInt();
								System.out.println("Enter deposit amount: ");
								double amt  = sc.nextDouble();
//								aS.;
							}
						} while(ch3 != 4);
						break;
					}
				} while(ch2 != 5);
				break;
			case 2:
				do {
					System.out.println("\nPress:\n1. Create Account\n2. View Account\n3. Close Account\n4. ATM");
					ch2 = sc.nextInt();
					switch (ch2) {
					case 1:
						userInputC();
						break;
					case 2:
						displayUserC();
						break;
					case 3:
						closeAccountC();
						break;
					case 4:
						do {
							System.out.println("\nPress: 1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
							ch3 = sc.nextInt();
						} while (ch3 != 4);
					}
				} while(ch2 != 5);
				break;
			}
		} while(ch1 != 3);
		sc.close();
	}
}