package Lab5.Exercise2;

import java.util.Scanner;

public class Employee {
    static void validate(String firstName, String lastName) throws NameException{
        if (firstName.isEmpty() && lastName.isEmpty())
            throw new NameException("Name is empty");
        else if (lastName.isEmpty())
            throw new NameException("Last Name is empty");
        else if (firstName.isEmpty())
            throw new NameException("First Name is empty");
        else
            System.out.println("Hello user " + firstName + " " + lastName);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter firstname: ");
        String f = sc.nextLine();
        System.out.print("Enter lastname: ");
        String l = sc.nextLine();
        try { validate(f, l); }
        catch (Exception e) { System.out.println("Exception occurred! " + e); }
    }
}