package HomeWork.customerlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CustomerList {

    public static void main(String[] args) {
        ArrayList<Customer> custList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

//        Input
        System.out.print("Enter the number of users to enter: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the Customer details: ");
            System.out.print("Enter the customer id: ");
            int id = 0;
            try {
                id = sc.nextInt();
                if (id <= 0)
                    System.out.println("Customer ID must be greater than 0");
            } catch (NumberFormatException e) { System.out.println("Customer ID must be an integer"); }

//            Clear buffer
            sc.nextLine();

            System.out.print("Enter the customer name: ");
            String name = sc.nextLine();
            if (name == null || !name.matches("^[a-zA-Z]*$"))
                System.out.println("Name must be containing characters");

            System.out.print("Enter the customer age: ");
            int age = 0;
            try {
                age = sc.nextInt();
                if (age <= 0 || age > 100)
                    System.out.println("Age must be greater than 0 and less than 100.");
            } catch (NumberFormatException e) { System.out.println("Age must be an integer"); }

//            Clear buffer
            sc.nextLine();

            System.out.print("Enter the DOB: ");
            String dob = sc.nextLine();

            System.out.print("Enter the email: ");
            String email = sc.nextLine();
            if (email == null || !email.matches("^(.+)@(.+)$"))
                System.out.println("Email is invalid!");

            System.out.print("Enter customer mobile number: ");
            String mobileNum = sc.next();
            if (mobileNum == null || !mobileNum.matches("^\\d{10}$") )
                System.out.println("Mobile number is invalid!");

            custList.add(new Customer(id, name, age, dob, email, mobileNum));
        }

//        Output
        Iterator<Customer> custItr = custList.iterator();
        System.out.println("Customer ArrayList values using iterator");
        while (custItr.hasNext()) {
            Customer ct = custItr.next();
            System.out.println("ID: " + ct.getCid() +", Name: " + ct.getCustname() + ", Age: " + ct.getAge() + ", DOB: " + ct.getDob() + ", Email: " + ct.getEmail() + ", Phone Number: " + ct.getMobileNumber() + "\n");
        }
    }
}