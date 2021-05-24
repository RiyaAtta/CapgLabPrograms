package Lab2;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the String array: ");
		int n = sc.nextInt();
		String strArray[]=new String[n];
		System.out.println("Enter the strings as array elements: ");
		for (int i = 0; i<n ; i++)
			strArray[i] = sc.nextLine();
		System.out.println("The resulting array is: ");
		String[] sortArray = sortStrings(strArray);
		for(String value : sortArray)
			System.out.println(value);
		sc.close();
	}
	public static String[] sortStrings(String[] arr)
	{
		Arrays.sort(arr); //sorting the array of string elements
		int len = arr.length;
		String newArray[] = new String[len];
		for(int i = 0; i<(int)Math.ceil(len/2)+1; i++)
			newArray[i] = arr[i].toUpperCase();
		for(int i = (int)Math.ceil(len/2)+1; i<len; i++)
			newArray[i] = arr[i].toLowerCase();
		return newArray;			
	}

}