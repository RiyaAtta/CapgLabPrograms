package Lab4.Exercise1;

public class Account extends Person{
    private long accNum;
    private double balance;
    private Person accHolder;

//    Methods
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }

//    Getters
    public long getAccNum() {
        return accNum;
    }

//    Setters
    public void setAccNum(long newAccNum) {
        this.accNum = newAccNum;
    }
    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }
}