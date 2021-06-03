package com.capgemini.AuthorUsingCollections;

import java.util.Scanner;

import com.capgemini.author.Author;



public class AuthorMain {
	static Author a;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		System.out.println("Enter the email: ");
		String email = sc.nextLine();
		System.out.println("Enter Gender (m/f/u): ");
		char gender = sc.next().trim().charAt(0);
		sc.close();
		a = new Author(name, email, gender);
		a.validateAuthor(a);
		a.print();
	}
	
}