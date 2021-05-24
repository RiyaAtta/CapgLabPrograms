package Day4;

import java.util.*;
import java.util.regex.*;
public class Validation1 {

/*ublic static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		// validating mobile no
		System.out.println("Enter mobile no:");
		String mobile=sc.nextLine();
		Pattern p=Pattern.compile("[789]{1}[0-9]{9}");
		Matcher m=p.matcher(mobile);
		if(m.find() && m.group().equals(mobile))
			System.out.println("valid mobile");
		else
			System.out.println("not valid mobile");
		// validating pin code
		System.out.println("Enter pin code");
		String pin=sc.nextLine();
		String regex="^[1
		
		
		sc.close();
			
	}
}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Username");
		String name=sc.next();
		System.out.println(Pattern.matches("^[A-Za-z]{7,}[@$!%*#?&]{1,}$", name));

		System.out.println("Enter Email");
		String email=sc.next();
		System.out.println(Pattern.matches("^[a-zA-Z0-9+_.-]+@(.+)$", email));

		System.out.println("Enter Password");
		String pwd=sc.next();
		System.out.println(Pattern.matches("^[a-zA-Z0-9._+-//*@]{8,16}", pwd));

		System.out.println("Enter mobileno.");
		String mobileno=sc.next();
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}",mobileno ));

		System.out.println("Enter city");
		String city=sc.next();
		System.out.println(Pattern.matches("^[a-zA-Z]{2,50}", city));

		System.out.println("Enter Pin");
		String pin=sc.next();
		System.out.println(Pattern.matches("^[1-9]{1}[0-9]{5}$", pin));


		sc.close();
		}
}