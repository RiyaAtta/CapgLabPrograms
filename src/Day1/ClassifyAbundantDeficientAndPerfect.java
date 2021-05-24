package Day1;

import java.util.*;
public class ClassifyAbundantDeficientAndPerfect {
	public static String classify(int num) {
	int newnum=0; 
		for(int i=1;i<num;i++) {
			if(num%i==0) // checking for proper divisors of num
				newnum=newnum+i; // generating sum of proper divisors of num
		}
		if(newnum==num) // if num equals newnum then it's a perfect number
			return (num+" is a perfect number.");
		else if(newnum>num) // if newnum exceeds num then it's an abundant number
			return(num+" is an abundant number.");
		else
			return(num+" is a deficient number.");
	}
	public static void main(String[] args) {
		for(int i=1;i<=10000;i++)
		{
			System.out.println(classify(i));
		}
	}

}

