package com.capgemini.book.exceptions;

public class BookIDCannotBeNegative extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookIDCannotBeNegative(String message) {
		super(message);
	}
}