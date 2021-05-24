package Lab2;
import java.util.*;
import java.util.Arrays;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements: ");
		for (int i = 0; i<n ; i++)
			arr[i] = sc.nextInt();
		System.out.println("The second smallest element of the array is: "+getSecondSmallest(arr));
		sc.close();
	}
	public static int getSecondSmallest(int[] arr)
	{
		Arrays.sort(arr);
		return arr[1];	
	}

}