package foodorderapp.com.capgemini.app;

import java.util.Scanner;

import foodorderapp.com.capgemini.app.service.Customer;
import foodorderapp.com.capgemini.app.service.Menu;
import foodorderapp.com.capgemini.app.service.Order;
import foodorderapp.com.capgemini.app.service.Vendor;


/**
 * 
 * @author RIYA ATTA
 *
 */

public class AppMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Vendor v=new Vendor();
		v.dbConnection();
		Menu m=new Menu();
		m.dbConnection();
		Customer c=new Customer();
		c.dbConnection();
		Order o=new Order();
		o.dbConnection();
		char cont='y';
		while(cont=='y') {
		System.out.println("Enter the choice: ");
		System.out.println("Enter 1 to create the tables for the first time");
		System.out.println("2 to register/enter details of customer");
		System.out.println("3 to customer login and then place an order");
		System.out.println("4 to display all the order details");
		//case 6 used for reference,not as an option to display
		System.out.println("5 to display all the customers");
		System.out.println("6:to exit");
		int transaction=sc.nextInt();
		switch(transaction) {
		case 1:
			//CREATING THE VENDOR TABLE and inserting values
			v.createVendor();
			v.insertVendor();
			//CREATING THE MENU TABLE and inserting values
			m.createMenuTable();
			m.insertMenu();
			//CREATING THE CUSTOMER TABLE
			c.createCustomer();
			//CREATING THE ORDER TABLE
			o.createOrderTable();
			break;
		case 2:
			c.registerCustomer();
			break;
		case 3:
			c.loginCustomer();
			break;
		case 4:
			o.display();
			break;
		case 5:
			c.displayCustomer();
			break;
		case 6:
			System.out.println("Thank you");
			System.exit(0);
		default:
			break;
		}//switch close
		System.out.println("do you want to continue?");
		cont=sc.next().trim().charAt(0);
		}//while
	}//main
}