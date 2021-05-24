package CaseStudy3;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice:	1. Admin	2. Academic");
        int ch = sc.nextInt();
        if (ch == 1)
            adminPanel();
        else if (ch == 2)
            academicPanel();
        else
            System.out.println("Invalid!!!");
        sc.close();

	}
    public static void adminPanel() {
        Scanner sc = new Scanner(System.in);
        Admin a = new Admin();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Salary: ");
        int sal = sc.nextInt();

        a.adjustSalary(sal);
        a.doAdminStaff();
        sc.close();
    }

    public static void academicPanel() {
        Scanner sc = new Scanner(System.in);
        Academic ac = new Academic();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Salary: ");
        int sal = sc.nextInt();

        ac.adjustSalary(sal);
        ac.giveLecture();
        sc.close();
    }

}