package Lab5.Exercise1;

import java.util.*;
public class Solution {
    static void validate(int age) throws InvalidAgeException {
        if (age < 15)
            throw new InvalidAgeException("Age is less than 15!");
        else
            System.out.println("Welcome user! Age is valid.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try { validate(age); }
        catch (Exception e) { System.out.println("Exception occurred. " + e); }
        sc.close();
    }
}