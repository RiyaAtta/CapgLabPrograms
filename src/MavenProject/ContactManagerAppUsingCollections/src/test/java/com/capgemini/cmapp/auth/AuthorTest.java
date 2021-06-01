package com.capgemini.cmapp.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AuthorTest {

	static Author a;
	static Author a1;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		a = new Author("Riya Atta", "riyaatta26@gmail.com", 'f');
	}
	
	@AfterAll
	static void tearDownAll() throws Exception {
		a = null;
	}
	
	@BeforeEach
	void setup() throws Exception {
		a1 = new Author();
	}
	
	@AfterEach
	void tearDown() throws Exception {
		a1 = null;
	}

	@Test
	void testAuthor() {
		assertEquals(new Author(), a1);
	}
	
	@Test
	void testGetName() {
		assertEquals("Riya Atta", a.getName());
	}
	@Test
	void testGetEmail() {
		assertEquals("riyaatta26@gmail.com", a.getEmail());
	}
	@Test
	void testGetGender() {
		assertEquals('f', a.getGender());
	}
	
}