package Lab1;
import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		System.out.println("Sum of the cubes of the digit is= "+cubesOfDigits(n));
		sc.close();
	}
		
		public static int cubesOfDigits(int n)
		{
			int r, sum=0;
			while(n>0)
			{
				r=n%10;
				sum=sum+(r*r*r);
				n/=10;
			}
			return sum;
		}
	

}