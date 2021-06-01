package com.capgemini.cmapp.book;

public class BookNameCannotBeNull extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookNameCannotBeNull(String message) {
		super(message);
	}
}