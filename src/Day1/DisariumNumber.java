package Day1;

import java.util.*;
public class DisariumNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); // object creation of Scanner Class
		System.out.print("Input a number : ");
		int num = sc.nextInt(); // input for number
		String number = ""+num; // storing the number in String format
		int sum=0; // for storing sum of digits to the power of their respective position
		int length_num=number.length();
		int temp=num; // temporary storage
		while(num>0) {
			sum=sum+(int)Math.pow(num%10,length_num--);
			num=num/10;
		}
		if(sum==temp) // check if sum equals value in temporary storage
			System.out.println("Disarium Number.");
		else
			System.out.println("Not a Disarium Number.");

	}

}