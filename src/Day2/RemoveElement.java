package Day2;

import java.util.Arrays;
import java.util.Scanner;
public class RemoveElement 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.print("Enter the sizes of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter array: ");
		for ( i = 0; i <n ; i++)
			arr[i] = sc.nextInt();
        System.out.println("Index to be removed: ");
        int index = sc.nextInt();
        arr = removeTheElement(arr, index);
        System.out.println("Final Array: "+ Arrays.toString(arr));
	}
	
	
	public static int[] removeTheElement(int[] arr,int index)
	{
			if (arr == null || index < 0|| index >= arr.length)
			{
	  
	            return arr;
	        }
	  
	        
	        int[] anotherArray = new int[arr.length - 1];
	        for (int i = 0, k = 0; i < arr.length; i++) 
	        {
	  
	            if (i == index) 
	            {
	                continue;
	            }
	            anotherArray[k++] = arr[i];
	        }
	        return anotherArray;
	}

}