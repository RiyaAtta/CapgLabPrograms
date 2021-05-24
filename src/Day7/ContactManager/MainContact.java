package Day7.ContactManager;


public class MainContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact c=new Contact();
		c.readDetails();
		String output=c.displayDetails();
		System.out.println(output);
	}

}