package com.capgemini.book.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import com.capgemini.book.exceptions.BookIDCannotBeNegative;
import com.capgemini.book.exceptions.BookNameCannotBeNull;
import com.capgemini.book.exceptions.PriceNotValidException;

class BookTest {
	static Book book1;
	Book book2;
	//executes before all the test cases
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		book1=new Book(11,"Harry Potter",1500);
	}
	//executes after all the test cases 
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		book1=null;
	}
//executes before each test case
	@BeforeEach
	void setUp() throws Exception {
		book2=new Book();
	}
//executes after each test case
	@AfterEach
	void tearDown() throws Exception {
		book2=null;
	}
	//Testing Exceptions
	@Test
	@DisplayName("should not create when price is negative")
	public void shouldThrowRunTimeExceptionWhenPriceNotValidException() {
		Assertions.assertThrows(PriceNotValidException.class,()->{
			book2= new Book(1,"hp",-400);
			book2.validateBookPrice();
			;});
	}
	@Test
	@DisplayName("should not create when bookid is negative")
	public void shouldThrowRunTimeExceptionWhenBookIdisNegative() {
		Assertions.assertThrows(BookIDCannotBeNegative.class,()->{
			book2= new Book(-1,"hp",400);
			book2.validateBookId();
			;});
	}
	@Test
	@DisplayName("should not create when bookname is null")
	public void shouldThrowRunTimeExceptionWhenBooknameisNull() {
		Assertions.assertThrows(BookNameCannotBeNull.class,()->{
			book2= new Book(1," ",400);
			book2.validateBookName();
			;});
	}
	@Test
	void testBook() {
		assertEquals(new Book(),book2);
	}

	@Test
	void testGetBid() {
		assertEquals(11,book1.getBid());
	}

	@Test
	void testGetbName() {
		assertEquals("Harry Potter",book1.getbName());
	}

	@Test
	void testGetPrice() {
		assertEquals(1500,book1.getPrice());
	}


}