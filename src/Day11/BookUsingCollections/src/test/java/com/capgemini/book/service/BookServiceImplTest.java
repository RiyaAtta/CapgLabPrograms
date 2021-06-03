package com.capgemini.book.service;

import static com.capgemini.book.service.BookServiceImpl.bookList;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;


import com.capgemini.book.exceptions.ArrayListIsNullException;
import com.capgemini.book.exceptions.BookAlreadyFoundException;
import com.capgemini.book.exceptions.BookNotFoundException;
import com.capgemini.book.model.Book;

class BookServiceImplTest {
	private static BookServiceImpl bookService;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("should print before all the test cases");
		System.out.println("Instantitating the Book Service");
		bookService=new BookServiceImpl();
	}
	@BeforeEach void setUp() throws Exception {
		System.out.println("should print before each test case");
		System.out.println("Instantitating the Book Service");
		bookService=new BookServiceImpl();
	}
	//Testing Exceptions
	//checking BookNotFoundException
	@Test
	@DisplayName("should throw BookNotFoundException")
	void testBookNotFoundException() {
		Assertions.assertThrows(BookNotFoundException.class,()->{
			Book b1=new Book(11,"Harry Potter",900);
			bookList.add(b1);
			bookService.delete();
			;});
	}
	//checking ArrayListIsNullException
	@Test
	@DisplayName("should throw ArrayListIsNullException")
	void testArrayListIsNullException() {
		Assertions.assertThrows(ArrayListIsNullException.class,()->{
			bookList.add(null);
			bookService.read();
			;});
	}
	//checking BookAlreadyFoundException
	@Test

	@DisplayName("should throw BookAlreadyFoundException") void
	BookAlreadyFoundExceptionException() {
		Assertions.assertThrows(BookAlreadyFoundException.class,()->{
			Book b1=new Book(11,"Harry Potter",900);
			bookService.checkIfBookAlreadyExist(b1);
			;}); }

	@Nested
	class RepeatedTests{
		@DisplayName("should create book")
		@RepeatedTest(value=5,name="Repeating book creation test {currentRepetition} of {totalRepetition}")
		public void shouldCreateBookRepeatedly() {
			Book book=new Book(1,"Harry Potter",8000);
			bookList.add(book);
			assertFalse(bookList.isEmpty());

		}
	}
	@SuppressWarnings("unused")
	private static List<Double> bookPriceList(){
		return Arrays.asList(500.00,800.00,900.00);
	}
	@DisplayName("Testing prices should match with required format using Method Source")
	

	public void shouldTestPNoUsingPhoneNo(Double price) {
		Book b=new Book(11, "Harry Potter", 800);
		bookList.add(b);
		assertFalse(bookList.isEmpty());
	}
	@Test
	@DisplayName("disable test")
	@Disabled
	public void disabledTest() {
		throw new RuntimeException("this test is a disabled test");
	}

	@AfterEach
	public void tearDown() {
		System.out.println("should execute after each test case"); 
	}
	@AfterAll
	public static void tearDownAll() {
		System.out.println("should execute after all the test case");
	}

}