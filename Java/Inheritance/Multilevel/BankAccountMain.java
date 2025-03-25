// Base class for all bank accounts
class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ". New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

// Savings account inherits from BankAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate) {
        super(accountNumber, accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        System.out.println("Interest to be added: " + interest);
        deposit(interest);
    }
}

// Fixed deposit account inherits from SavingsAccount
class FixedDepositAccount extends SavingsAccount {
    private int tenure;

    public FixedDepositAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate, int tenure) {
        super(accountNumber, accountHolderName, initialBalance, interestRate);
        this.tenure = tenure;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public void calculateMaturityAmount() {
        double maturityAmount = getBalance() * (1 + getInterestRate() / 100 * tenure);
        System.out.println("Maturity Amount: " + maturityAmount);
    }
}

// Main class to demonstrate the usage
public class BankAccountMain {
    public static void main(String[] args) {
        // Create a SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount("SA123", "John Doe", 1000, 5);

        // Deposit and withdraw
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);

        // Calculate interest
        savingsAccount.calculateInterest();

        // Create a FixedDepositAccount
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("FD456", "Jane Smith", 5000, 7, 2);

        // Calculate maturity amount
        fixedDepositAccount.calculateMaturityAmount();
    }
}