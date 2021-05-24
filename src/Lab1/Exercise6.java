package Lab1;
import java.util.Scanner;
public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number up to which you want to get the series: ");
		int n=sc.nextInt();
		System.out.println("The result is: "+calculateDifference(n));
		sc.close();
	}
	public static int calculateDifference(int n)
	{
		int sum_of_the_squares=0,square_of_the_sum=0;
		int sum_n=(n*(n+1))/2; // calculating the square of the sum
		square_of_the_sum=sum_n*sum_n;
		
		for(int i=1;i<=n;i++)
		{
			sum_of_the_squares=sum_of_the_squares+(i*i); //calculating the sum of the square
		}
		return (square_of_the_sum-sum_of_the_squares);
	}

}