package Lab4.Exercise1;

public class Solution {
    public static void main(String[] args) {
        Account smith = new Account();
        Account kathy = new Account();

//        Smith
        smith.setName("Smith");
        smith.setAge(25);
        smith.setBalance(2000);
        smith.setAccNum(12345);

//        Kathy
        kathy.setName("Kathy");
        kathy.setAge(29);
        kathy.setBalance(3000);
        kathy.setAccNum(67890);

//        TO be done
        smith.deposit(2000);
        kathy.withdraw(2000);
        System.out.println("Smith has: " + smith.getBalance());
        System.out.println("Kathy has: " + kathy.getBalance());
    }
}