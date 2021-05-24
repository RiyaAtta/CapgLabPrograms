package Day1;

import java.util.*;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); // object creation of Scanner Class
		System.out.print("Enter a number : ");
		int num = sc.nextInt(); // input for number
		int newnum=0; 
		for(int i=1;i<num;i++) {
			if(num%i==0) // checking for proper divisors of num
				newnum=newnum+i; // generating sum of proper divisors of num
		}
		if(newnum==num)
			System.out.println(num+" is a perfect number.");
		else
			System.out.println(num+" is not a perfect number.");
	}

}