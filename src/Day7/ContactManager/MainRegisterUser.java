package Day7.ContactManager;

public class MainRegisterUser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegisterUser r=new RegisterUser();
		r.readDetails();
		String output=r.displayDetails();
		System.out.println(output);
	}

}