package Lab3;
import java.util.*;
public class Exercise8 {

	static boolean isPositive(String str) {
		int n = str.length();
		char c[] = new char[n];
		for (int i = 0; i < n; i++) 
			c[i] = str.charAt(i);
		Arrays.sort(c);
		for (int i = 0; i < n; i++) 
			if (c[i] != str.charAt(i))
				return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String st = sc.nextLine();
		if (isPositive(st))
			System.out.println("Is positive string");
		else
			System.out.println("Is not positive string");;
		sc.close();
	}

}