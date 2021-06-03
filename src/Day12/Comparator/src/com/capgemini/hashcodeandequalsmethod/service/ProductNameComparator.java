package com.capgemini.hashcodeandequalsmethod.service;

import java.util.Comparator;

import com.capgemini.hashcodeandequalsmethod.model.Product;

public class ProductNameComparator implements Comparator<Product> {

	@Override
	public int compare(Product product1, Product product2) {
		// TODO Auto-generated method stub
		return product1.getPname().compareTo(product2.getPname());
	}

}