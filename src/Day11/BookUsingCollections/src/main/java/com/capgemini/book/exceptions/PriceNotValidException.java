package com.capgemini.book.exceptions;


public class PriceNotValidException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PriceNotValidException(String message) {
		super(message);
	}
}