
class BankAccount {
    
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private double interestRate;

    
    public BankAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    
    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.isEmpty()) {
            this.accountHolder = accountHolder;
        }
    }

    public void setInterestRate(double interestRate) {
        if (interestRate >= 0) {
            this.interestRate = interestRate;
        } else {
            System.out.println("Error: Interest rate cannot be negative.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal successful. New balance: " + balance);
            } else {
                System.out.println("Error: Insufficient funds.");
            }
        } else {
            System.out.println("Error: Withdrawal amount must be positive.");
        }
    }

    public void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest applied. New balance: " + balance);
    }

    
    public void displayAccountInfo() {
        System.out.println("\nAccount Information:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}


public class EncapBank {
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount("123456789", "John Doe", 1000.0, 2.5);

        
        account.displayAccountInfo();

        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(1500.0); 

        
        account.setInterestRate(-1.0); 

        account.applyInterest();

        account.setAccountHolder("John Smith");

        account.displayAccountInfo();
    }
}