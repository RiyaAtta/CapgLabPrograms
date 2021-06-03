package com.capgemini.model;

public class Product implements Comparable<Product>{

	private int pid;
	private String pname;
	private Float price;
	private Float qty;
	
	//default constructor
	public Product() {
		super();
	}
	
	//Parameterized constructor
	public Product(int pid, String pname, float price,float qty) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.setQty(qty);
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Float getQty() {
		return qty;
	}

	public void setQty(Float qty) {
		this.qty = qty;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pid;
		result = prime * result + ((pname == null) ? 0 : pname.hashCode());
		result = prime * result + Float.floatToIntBits(price);
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
		Product other = (Product) obj;
		if (pid != other.pid)
			return false;
		if (pname == null) {
			if (other.pname != null)
				return false;
		} else if (!pname.equals(other.pname))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		return true;
	}

	
	@Override
	public int compareTo(Product product) {
		// TODO Auto-generated method stub
		Float tot=price*qty;
		Float totp=product.price*product.qty;
		return tot.compareTo(totp);
	}

}