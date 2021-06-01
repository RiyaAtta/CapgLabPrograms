package com.capgemini.cmapp;

import java.util.Scanner;

import com.capgemini.cmapp.service.BookServiceImpl;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BookServiceImpl ob=new BookServiceImpl();
		char ch='y';
		do {
			System.out.println("Book App: ");
			System.out.println("=============================");
			System.out.println("Enter 1 to create");
			System.out.println("Enter 2 to read");
			System.out.println("Enter 3 to update");
			System.out.println("Enter 4 to delete");
			System.out.println("Enter your choice: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				ob.create();
				break;
			case 2:
				ob.read();
				break;
			case 3:
				ob.update();
				break;
			case 4:
				ob.delete();
				break;
				default:
					System.out.println("Wrong choice!");
			}
			System.out.println("Do you want to continue? y/n");
			ch=sc.next().trim().charAt(0);
		}while(ch=='y');
		sc.close();
	}

}
