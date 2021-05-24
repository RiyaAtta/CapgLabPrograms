package Day4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegExDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// . represents single character
		System.out.println(Pattern.matches("..s", "mas"));
		String s="Thisisastring345";
		//String str="THISISASTRING";
		String s1="d";
		System.out.println(Pattern.matches("[^abc]", s1));
		System.out.println(s.length());
		//[abc] it looks for a or b or c
		//[^abc] it looks for other character except a or b or c
		System.out.println(Pattern.matches("[a-zA-Z0-9]{16}", s));
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the mobile number");
		//String mobNo=sc.next();
		
		/*boolean result=Pattern.matches("[789]{1}[0-9]{9}", mobNo);//using character classes and quantifiers
		System.out.println("result = "+result);
		boolean result1=Pattern.matches("[789]{1}\\d{9}", mobNo); // using metacharacters
		System.out.println("result using metacharacters = "+result1);*/
		
		System.out.println("Enter the email");
		String email=sc.next();
		String regexEmail="^(.+)@(.+)$";
		
		//^=> start of the line(caret)
		//$=> end of the line(dollar)
		//.+=> atleast one or more characters
		
		Pattern pattern = Pattern.compile(regexEmail);
		Matcher matcher = pattern.matcher(email);
		boolean b=matcher.matches();
		System.out.println(b);
		
		System.out.println("Enter the password");
		String pwd=sc.next();
		
		System.out.println(Pattern.matches("[a-zA-z0-9]{8,}", pwd));
		sc.close();
	}

}