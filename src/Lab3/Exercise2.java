package Lab3;
import java.util.*;
public class Exercise2 {

	static String getImage(String str) {
		StringBuffer sbf = new StringBuffer(str);
		return sbf.reverse().toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String st = sc.next();
		String rev = getImage(st);
		System.out.println(st + "|" + rev);
		sc.close();
	}

}