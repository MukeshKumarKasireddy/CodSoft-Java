import java.util.*;
class BankAccount {
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
            return true;
        } else {
            System.out.println("Insufficient funds or invalid amount.");
            return false;
        }
    }
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}
class ATM {
    private BankAccount account;
    private Scanner sc;
    public ATM(BankAccount account) {
        this.account = account;
        this.sc = new Scanner(System.in);
    }
public void startATM(){
    boolean active = true;
    while(active){
        System.out.println("Welcome to the ATM. Please choose an option:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.println("Enter Choice: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:System.out.println("Enter amount to withdraw: ");
            double withdrawalAmount = sc.nextDouble();
            handleWithDrawl(withdrawalAmount);break;
            case 2:System.out.println("Enter amount to deposit: ");
                double depositAmount = sc.nextDouble();
                handleDeposit(depositAmount);break;
            case 3: handleCheckBalance();break;
            case 4:System.out.println("Thank You for using ATM. Good Bye!");
            active = false;break;
            default:System.out.println("Invalid Option. please try again");
        }
    }
}
    public void handleWithDrawl(double amount) {
        account.withdraw(amount);
    }
    public void handleDeposit(double amount) {
        account.deposit(amount);
    }
    public void handleCheckBalance() {
        account.checkBalance();
    }
}
public class ATMInterface {
    public static void main(String args[]){
        BankAccount userAccount = new BankAccount(1000);
        ATM atmMachine = new ATM(userAccount);
        atmMachine.startATM();
   }
}

