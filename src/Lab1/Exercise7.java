package Lab1;
import java.util.Scanner;
public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check Increasing or Not: ");
		int n=sc.nextInt();
		System.out.println(checkNumber(n));
		sc.close();
	}
	public static boolean checkNumber(int n)
	{
		boolean flag=false;
		int currentDigit=n%10;
		n=n/10;
		while(n>0)
		{
			if(currentDigit<=n%10)
			{
				flag=true;
				break;
			}
		
			currentDigit=n%10;
			n=n/10;
		}
		if(flag)
			return false;
		else
			return true;
	}

}