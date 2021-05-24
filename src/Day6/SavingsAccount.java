package Day6;
import java.util.Scanner;

public class SavingsAccount extends BankAccount {
	Scanner sc=new Scanner(System.in);
    float rateOfInt =  0.3f;
    int withDrawAmt;
    int depAmt;
    public SavingsAccount() { }
    @Override
    public void openAccount() {
        super.enterDetailsToOpenAccount();
        super.minBal = 3000;
        System.out.println("Enter accid");
        accId = sc.nextInt();
        System.out.println("Enter accHolderName");
        sc.nextLine();
        accHolderName = sc.nextLine();
        System.out.println("Enter actualBal");
        actualBal = sc.nextInt();
        System.out.println("Enter address");
        sc.nextLine();
        address = sc.nextLine();
        super.accType = "Savings";
    }

    @Override
    public float calculateInterest() { return actualBal * rateOfInt; }

    @Override
    public void creditAmount() { System.out.println("amount credited = " +calculateInterest()); }

    @Override
    public void checkBalance() { System.out.println("amount credited = " + (actualBal + calculateInterest())); }

    @Override
    public void withDraw() {
        System.out.println("Enter the amount to withdraw");
        withDrawAmt = sc.nextInt();
        System.out.println("after with draw balance = " + (updateAmount()));
        System.out.println("thank you");
    }


    public float updateAmount() { return (actualBal-withDrawAmt); }

    public void addMoney() {
        System.out.println("Enter the amount to deposit");
        depAmt = sc.nextInt();
        actualBal += depAmt;
        System.out.println("after with deposit balance = " + (actualBal));
        System.out.println("thank you");
    }

    }