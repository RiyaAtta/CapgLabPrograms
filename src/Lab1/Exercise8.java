package Lab1;
import java.util.Scanner;
public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check if it is a power of two or not: ");
		int n=sc.nextInt();
		System.out.println(checkNumber(n));
		sc.close();
	}
	public static boolean checkNumber(int n)
	{
		if(n==0)
			return false;
		while(n!=1)
		{
			if(n%2!=0)
			{
				return false;
			}
			n=n/2;
		}
		return true;
	}

}