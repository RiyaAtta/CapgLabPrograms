package Lab9.lambdaExpressionsandStreamAPI.Exercise1;

import java.util.Scanner;

public class CalculatePower {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 Power p=(int x,int y)->{return (int) (Math.pow(x,y));};
		 System.out.println("Enter x value: ");
		 int x=sc.nextInt();
		 System.out.println("Enter y value: ");
		 int y=sc.nextInt();
		 System.out.println(p.power(x, y));
	}
}
