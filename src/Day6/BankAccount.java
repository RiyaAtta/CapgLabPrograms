package Day6;
import java.util.*;
public abstract class BankAccount {
    int accId;
    String accHolderName;
    float minBal;
    float actualBal;
    String address;
    String accType;

    Scanner sc = new Scanner(System.in);

    public BankAccount() { System.out.println("In abstract class constructor"); }

    public BankAccount(int accId, String accHolderName, float minBal, float actualBal, String address, String accType, Scanner sc) {
        this.accId = accId;
        this.accHolderName = accHolderName;
        this.minBal = minBal;
        this.actualBal = actualBal;
        this.address = address;
        this.accType = accType;
        this.sc = sc;
    }

    public void enterDetailsToOpenAccount() { System.out.println("Enter the details to open account: "); }

//    abstract methods
    public abstract void openAccount();
    public abstract float calculateInterest();
    public abstract void creditAmount();
    public abstract void checkBalance();
    public abstract void withDraw();
}