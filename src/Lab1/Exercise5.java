package Lab1;
import java.util.Scanner;
public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number up to which you want to get the series: ");
		int n=sc.nextInt();
		System.out.println("The sum is: "+calculateSum(n));
		sc.close();
	}
	
	public static int calculateSum(int n)
	{
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

}