package com.capgemini.book.exceptions;

public class BookAlreadyFoundException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookAlreadyFoundException(String message) {
		super(message);
	}
}
