package Lab1;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter which Fibonacci Number you want to find: ");
		int n=sc.nextInt();
		System.out.println("The "+n+"th Fibonacci number by recursive method is: "+recFibonacci(n));
		System.out.println("The "+n+"th Fibonacci number by nonrecursive method is: "+nonrecFibonacci(n));
		sc.close();
	}
	public static long recFibonacci(long n)
	{
		if(n==0 || n==1)
			return n;
		else
			return (recFibonacci(n-1)+recFibonacci(n-2));
	}
	public static long nonrecFibonacci(long n)
	{
		if(n==0 || n==1)
			return n;
		else
		{
			long a=0, b=1, count=1,temp;
			while(count++<n)
			{
				temp=a;
				a=b;
				b=temp+a;
			}
			return b;
		}
		
	}

}