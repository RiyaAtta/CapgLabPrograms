package Day8.collectionsexamples;
import java.util.*;
public class Flower {

	private int fid;
	private String fname;
	private double price;
	private double qty;
	public Flower() {
		super();
	}
	public Flower(int fid, String fname, double price, double qty) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.price = price;
		this.qty = qty;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	
	
}