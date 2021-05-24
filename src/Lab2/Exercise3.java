package Lab2;
import java.util.*;
import java.util.Arrays;
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements: ");
		for (int i = 0; i<n ; i++)
			arr[i] = sc.nextInt();
		int[] b = getSorted(arr);
		for(int element : b)
			System.out.println(element);
		sc.close();
	}
	public static int[] getSorted(int[] arr)
	{
		int len = arr.length;
		for(int i=0; i<len; i++) {
			StringBuffer s = new StringBuffer(String.valueOf(arr[i]));
			s.reverse();
			arr[i] = Integer.parseInt(String.valueOf(s));
		}
		Arrays.sort(arr);
		return arr;
	}

}