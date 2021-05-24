package Day1;

import java.util.*;
public class LucasNumber {
	
	// function to return Lucas series
	public static int Lucas(int n)
	{
		if(n==1)
			return 2;
		else if(n==2)
			return 1;
		return Lucas(n-1)+Lucas(n-2);
	}
	public static void main(String[] args) {
		System.out.println("First ten Lucas numbers are:");
		for(int i=1;i<=10;i++) {
			System.out.println(Lucas(i));
		}
		
	}

}