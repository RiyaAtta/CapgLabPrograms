package Lab2;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise4 {
	static int arrSize = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		arrSize = sc.nextInt();	
		int[] array = new int[arrSize];
		System.out.println("Enter array elements: ");
		for(int i=0; i<arrSize; i++)
				array[i] = sc.nextInt();
		int[] sortedArray = modifyArray(array);	
		System.out.println("The resulting array is: ");
		for(int val : sortedArray) {
			if(val != 0)
				System.out.println(val);
		}	
		sc.close();
	}
	public static int[] modifyArray(int[] arr)
	{
		int[] resultArray = new int[arrSize];
		int k = 0;
		for(int i=0; i<arrSize; i++) {
			boolean flag = true;
			for(int j = 0; j<resultArray.length; j++) {
				if(arr[i] != resultArray[j])
					continue;
				else {
					flag = false;
					break;
				}
			}
			if(flag)
				resultArray[k++] = arr[i];
		}
		Arrays.sort(resultArray);
		for(int i=0; i<resultArray.length / 2; i++) {
			int temp = resultArray[i];
			resultArray[i] = resultArray[resultArray.length-i-1];
			resultArray[resultArray.length-i-1] = temp;
		}
		return resultArray;
	}

}