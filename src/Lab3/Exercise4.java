package Lab3;
import java.util.*;
public class Exercise4 {

	static int modifyNumber(int number1) {
		String s = Integer.toString(number1);
		String ans = "";
		for (int i = 0; i < s.length()-1; i++) 
			ans += Integer.toString(Math.abs(Character.getNumericValue(s.charAt(i)) - Character.getNumericValue(s.charAt(i+1))));
		ans += s.substring(s.length()-1);
		return Integer.parseInt(ans);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		System.out.println(modifyNumber(n));
		sc.close();
	}

}