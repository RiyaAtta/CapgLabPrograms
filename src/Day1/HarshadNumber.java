package Day1;

import java.util.*;
public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); // object creation of Scanner Class
		System.out.print("Input a number : ");
		int num = sc.nextInt(); // input for number
		int sum_of_digits=0;
		int temp=num; // temporary storage
		while(num>0) {
			sum_of_digits=sum_of_digits+num%10; // calculating sum of digits of num
			num=num/10;
		}
		if(temp%sum_of_digits==0) // checking if value in temporary storage is divisible by sum of digits of num
			System.out.println(temp+" is a Harshad Number.");
		else
			System.out.println(temp+" is not a Harshad Number.");
	}

}
