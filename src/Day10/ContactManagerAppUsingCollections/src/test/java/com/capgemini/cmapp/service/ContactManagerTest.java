package com.capgemini.cmapp.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ContactManagerTest {
	/**
	 * object of the Contact Manager class
	 */
	private ContactManager contManager;
	
	@BeforeAll
	public static void setupAll()
	{
		System.out.println("should print before all tests");
	}
	
	@BeforeEach
	public void setup()
	{
		System.out.println("should print before each test");
		System.out.println("instantiating the ContactManager");
		contManager=new ContactManager();
	}
	
	/**
	 * Testing Contact Creation
	 */
	@Test
	@DisplayName("Should create a contact")
	
	public void shouldCreateContact() {
		contManager.addContact("Rama", "Krishna", "01234567891");
		assertFalse(contManager.getAllContacts().isEmpty());
		assertEquals(1, contManager.getAllContacts().size());
	}

	
	//Testing Exceptions
	@Test
	@DisplayName("should not create contact when first name is full")
	public void shouldThrowRunTimeExceptionWhenFirstNameIsNull()
	{
		Assertions.assertThrows(RuntimeException.class,() ->{
				contManager.addContact(null, "Krishna", "0987654321");});
	}
	
	@Test
	@DisplayName("should not create contact when last name is full")
	public void shouldThrowRunTimeExceptionWhenLastNameIsNull()
	{
		Assertions.assertThrows(RuntimeException.class,() ->{
				contManager.addContact("Rama", null, "0987654321");});
	}
	
	@Test
	@DisplayName("should not create contact when Phone no is full")
	public void shouldThrowRunTimeExceptionWhenPhNoIsNull()
	{
		Assertions.assertThrows(RuntimeException.class,() ->{
				contManager.addContact("Rama", "Krishna", null);});
	}
	
	@Test
	@DisplayName("should test phone number start with 0")
	public void shouldTestPhoneNumberFormat()
	{
		Assertions.assertThrows(RuntimeException.class,() ->{
				contManager.addContact("Rama", "Krishna", "8789768776556e43");});
	}
	@Nested
	class RepeatedTests
	{
		@Test
		//@DisplayName("should create contact")
		@RepeatedTest(value=5,name="Repeating contact creation test{currentRepetition} of{totalRepeation}")
		public void shouldCreateContactRepeatedly()
		{
			contManager.addContact("Rama","Krishna","09876543211");
			assertFalse(contManager.getAllContacts().isEmpty());
			assertEquals(1,contManager.getAllContacts().size());
		}
	}
	
	@Nested
	class ParameterizedTests
	{
		@DisplayName("Phone number should match with requiredformat")
		@ParameterizedTest
		@ValueSource(strings= {"09876543211","09876543211","09876543211"})
		public void shouldTestPhoneNumberFormatUsingValueSource(String phoneNumber)
		{
			contManager.addContact("Rama","Krishna",phoneNumber);
			assertFalse(contManager.getAllContacts().isEmpty());
			assertEquals(1,contManager.getAllContacts().size());
		}
	}
	
	private static List<String>phoneNumberList()
	{
		return Arrays.asList("09876543235","09876543211","09876543211");
	}
	
	@DisplayName("Testing Phone Number in required format using Method Source")
	@ParameterizedTest
	@MethodSource("phoneNumberList")
	public void testPhoneNumbersUsingMethodSource(String phoneNumber)
	{
		contManager.addContact("Rama","Krishna",phoneNumber);
		assertFalse(contManager.getAllContacts().isEmpty());
		assertEquals(1,contManager.getAllContacts().size());
	}
	
	@Test
	@DisplayName("Disabled Test")
	@Disabled
	public void disabledTest() {
		throw new RuntimeException("This test is a disabled test");
	}
	
	@AfterEach
	public void tearDown()
	{
		System.out.println("should execute after each test");
	}
	@AfterAll
	public static void tearDownAll()
	{
		System.out.println("should execute after all tests are done");
	}
	
}
