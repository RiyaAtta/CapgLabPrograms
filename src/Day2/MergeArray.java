package Day2;

import java.util.*;
import java.util.Arrays;
public class MergeArray 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.print("Enter the sizes of two arrays: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		System.out.println("first array: ");
		for ( i = 0; i < n1; i++)
			arr1[i] = sc.nextInt();
		System.out.println("second array: ");
		for (i = 0; i < n2; i++)
			arr2[i] = sc.nextInt();
		
		int[] mergedArray = merging(arr1, arr2);
		System.out.println("Arrays after merging: " + Arrays.toString(mergedArray));
		sc.close();

	}
	static int[] merging(int[] arr1, int[] arr2) 
	{
		int res[] = new int[arr1.length + arr2.length];
		int i = 0, k = 0, j = 0;
		while (i < arr1.length) 
		{
			res[k] = arr1[i];
			i += 1;
			k += 1;
		}
		while (j < arr2.length)
		{
			res[k] += arr2[j];
			j += 1;
			k += 1;
		}
		
		Arrays.sort(res);
		return res;
		
	}
	

}