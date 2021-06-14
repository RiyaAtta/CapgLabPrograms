package Lab9.Concurrent.Exercise2;

import java.util.Scanner;


public class JobSeeker implements Runnable{
	String name;
	public JobSeeker(String s)
	{
		name = s;
	}
	boolean validate(String str) {
		if(str.endsWith("_job")&&str.contains("_")) {
			int l=str.substring(0,str.indexOf("_")).length();
			if(l>8)
				return true;
		}
		return false;
	}
	@Override
	public synchronized void run() {
		System.out.println(name);
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name of: "+name);
			String str=sc.next();
			Thread.sleep(100);
		boolean flag=validate(str);
		if(flag==true) {
			System.out.println(name +" created!");
		}
		else {
			System.out.println(name+" not created");
		}
		}
		catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		
	}
	
	
}