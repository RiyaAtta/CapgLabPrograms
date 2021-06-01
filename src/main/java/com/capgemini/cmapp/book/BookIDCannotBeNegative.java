package com.capgemini.cmapp.book;

public class BookIDCannotBeNegative extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookIDCannotBeNegative(String message) {
		super(message);
	}
}