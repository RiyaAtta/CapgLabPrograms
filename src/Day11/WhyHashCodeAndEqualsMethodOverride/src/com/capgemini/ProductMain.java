package com.capgemini;

import java.util.ArrayList;
import java.util.Collections;

import com.capgemini.service.ProductManager;

public class ProductMain {
	
	public static void main(String[] args) {
		
		ProductManager pm=new ProductManager();
		
		pm.createProduct();
		pm.compareProducts();
		
		pm.sort();
//		ArrayList<String> names = new ArrayList<String>();
//		names.add("Rama11");
//		names.add("Rama1");
//		if(names.get(0).equals(names.get(1))) {
//			System.out.println("Strings are equal");
//		}else {
//			System.out.println("Strings are not equal");
//		}
//		
//		Collections.sort(names);
//		System.out.println(names);
		//because String class has overriden the hashcode and equals method
		//All wrapper classes has overriden the hashcode and equals method
	}

}