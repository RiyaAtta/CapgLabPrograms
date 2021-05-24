package Lab1;
import java.util.*;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to perform the following functions: ");
		System.out.println("1.Red	2.Yellow	3.Green");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
		{
			System.out.println("STOP");
			break;
		}
		case 2:
		{
			System.out.println("READY");
			break;
		}
		case 3:
		{
			System.out.println("GO");
			break;
		}
		default:
		{
			System.out.println("INVALID INPUT!!!!");
		}
		}
		sc.close();

	}

}