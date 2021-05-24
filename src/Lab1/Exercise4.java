package Lab1;
import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,j,flag;
		System.out.println("Enter the number upto which you want to print The Prime Numbers:");
		int n=sc.nextInt();
		for(i=2;i<n;i++)
		{
			flag=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
					flag=1;
			}
			if(flag==0)
				System.out.println(i);
		}
		sc.close();
	}

}