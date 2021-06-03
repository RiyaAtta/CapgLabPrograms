package com.capgemini.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.book.exceptions.ArrayListIsNullException;
import com.capgemini.book.exceptions.BookAlreadyFoundException;
import com.capgemini.book.exceptions.BookNotFoundException;
import com.capgemini.book.model.Book;

public class BookServiceImpl implements BookService{
	//bookList to store the books
	public static List<Book> bookList=new ArrayList<Book>();
	Scanner sc=new Scanner(System.in);
//CRUD operations
	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("Enter the book details: ");
		System.out.println("========================================");
		System.out.println("Enter the bookid: ");
		int bookid=sc.nextInt();
		System.out.println("Enter the book Name: ");
		sc.nextLine();
		String bName=sc.nextLine();
		System.out.println("Enter the price of the book: ");
		double price=sc.nextDouble();
		Book b=new Book(bookid,bName,price);
		validateBook(b);
		checkIfBookAlreadyExist(b);
		bookList.add(b);
		}
		
//to check if the bookList  has null values
	@Override
	public void read() {
		// TODO Auto-generated method stub
		for(Book i:bookList) {
			if(i!=null) {
			System.out.println(i);
			}
			else {
				throw new ArrayListIsNullException("ArrayList has null elements!");
			}
		}
		
	}

	/*
	 * checks whether the book id is present already or not else book is not found
	 * for the update
	 */
	@Override
	public void update() {
		// TODO Auto-generated method stub
		boolean flag=false;
		System.out.println("Enter the book id of the book to be updated!");
		int id=sc.nextInt();
		for(Book i:bookList) {
			if(i.getBid()==id) {
				System.out.println("Enter the bookName: ");
				sc.nextLine();
				String newBookName=sc.nextLine();
				System.out.println("Enter new price: ");
				double newPrice=sc.nextDouble();
				Book b1=new Book(id,newBookName,newPrice);
				validateBook(b1);
				checkIfBookAlreadyExist(b1);
				i.setbName(newBookName);
				i.setPrice(newPrice);
				flag=true;
			}
		}
		if(flag==false) {
			throw new BookNotFoundException("Book not found!");
		}
		
	}

	/*
	 * checks whether the book to be deleted exists or not else book is not found
	 */
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		boolean flag=false;
		System.out.println("Enter the book id of the book to be deleted!");
		int id=sc.nextInt();
		for(Book i:bookList) {
			if(i.getBid()==id) {
				i=null;
				flag=true;
			}
		}
		if(flag==false) {
			throw new BookNotFoundException("Book not found!");
		}
		
	}

	/*
	 * checks whether the book already exists or not if yes throws the exception
	 * BookAlreadyFoundException
	 */
	public void checkIfBookAlreadyExist(Book b) {
		for(Book i:bookList) {
			if(b.getbName().equalsIgnoreCase(i.getbName())&&b.getBid()==i.getBid()) {
				throw new BookAlreadyFoundException("Book already found!");
			}
		}
	}
	//validates the books 
	private void validateBook(Book b) {
		b.validateBookId();
		b.validateBookName();
		b.validateBookPrice();
	}
}