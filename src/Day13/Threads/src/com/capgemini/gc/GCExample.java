package com.capgemini.gc;

public class GCExample {
	public void finalize() {
		System.out.println("finalize method is called to make this object deleted by GC");
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d = null;
		System.gc();
	}
}

