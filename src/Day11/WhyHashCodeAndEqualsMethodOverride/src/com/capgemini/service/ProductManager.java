package com.capgemini.service;

import java.util.ArrayList;
import java.util.Collections;

import com.capgemini.model.Product;

public class ProductManager {

	ArrayList<Product> productList = new ArrayList<Product>();
	public void createProduct() {
		
		Product p=new Product(1234,"Pen",25,18);
		Product p1=new Product(1235,"Eraser",25,12);
		productList.add(p);
		productList.add(p1);
	}
	
	public void compareProducts() {
		if(productList.get(0).equals(productList.get(1))) {
			System.out.println("both are equal");
		}else {
			System.out.println("both are not equal");
		}
		
	}
	
	public void sort() {
		Collections.sort(productList);
		System.out.println("===============");
		System.out.println("Sorted List");
		System.out.println("===============");
		for(Product p : productList) {
			System.out.println(p.getPname()+"\t\t"+p.getPrice()+"\t\t"+p.getQty());
		}
	}
	
}