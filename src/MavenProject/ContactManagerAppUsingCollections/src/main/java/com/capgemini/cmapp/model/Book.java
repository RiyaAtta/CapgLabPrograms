package com.capgemini.cmapp.model;

import com.capgemini.cmapp.book.BookIDCannotBeNegative;
import com.capgemini.cmapp.book.BookNameCannotBeNull;
import com.capgemini.cmapp.book.PriceNotValidException;

/*	@author RIYA*/
public class Book {
	/*
	 * @param bid to store book id
	 * 
	 * @param bName to store book name
	 * 
	 * @param price to store the price of the book
	 */
	private int bid;
	private String bName;
	private double price;
	
	public Book() {
		super();
	}
	public Book(int bid, String bName, double price) {
		super();
		this.bid = bid;
		this.bName = bName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bName=" + bName + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bName == null) ? 0 : bName.hashCode());
		result = prime * result + bid;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bName == null) {
			if (other.bName != null)
				return false;
		} else if (!bName.equals(other.bName))
			return false;
		if (bid != other.bid)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
//	to validate book id that it is not negative
	public void validateBookId() {
		// TODO Auto-generated method stub
		if(bid<0) {
			throw new BookIDCannotBeNegative("book id cannot be negative!");		}
		
	}
	//to validate book Name that it cannot be null or empty
	public void validateBookName() {
		// TODO Auto-generated method stub
		if(bName.equals(" ")||bName.equals(null)) {
			throw new BookNameCannotBeNull("Book Name cannot be null");
		}
		
	}
	//to validate price that it should not be zero or less than zero
	public void validateBookPrice() {
		// TODO Auto-generated method stub
		if(price<=0) {
			throw new PriceNotValidException("Price cannot be null");
		}
		
	}
}