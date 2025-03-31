
abstract class BankAccount {
    String accountHolder;
    double balance;
    
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder + " | Balance: $" + balance);
    }
}


class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }
    
    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into " + accountHolder + "'s savings account.");
    }
    
    
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from " + accountHolder + "'s savings account.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}


public class BankDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new SavingsAccount("Alice", 1000.00);
        
        myAccount.displayBalance();
        myAccount.deposit(500);
        myAccount.withdraw(300);
        myAccount.displayBalance();
    }
}
