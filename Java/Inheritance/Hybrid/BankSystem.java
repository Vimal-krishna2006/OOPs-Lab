class Bank {
    String name;
    
    Bank(String name) {
        this.name = name;
    }
    
    void displayBank() {
        System.out.println("Bank Name: " + name);
    }
}

class Account extends Bank {
    String accountNumber;
    String customerName;
    double balance;
    
    Account(String bankName, String accountNumber, String customerName, double balance) {
        super(bankName);
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }
    
    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully");
    }
    
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully");
        } else {
            System.out.println("Insufficient balance");
        }
    }
    
    void display() {
        displayBank();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;
    
    SavingsAccount(String bankName, String accountNumber, String customerName, 
                  double balance, double interestRate) {
        super(bankName, accountNumber, customerName, balance);
        this.interestRate = interestRate;
    }
    
    void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
    
    void display() {
        super.display();
        System.out.println("Account Type: Savings");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;
    
    CurrentAccount(String bankName, String accountNumber, String customerName, 
                  double balance, double overdraftLimit) {
        super(bankName, accountNumber, customerName, balance);
        this.overdraftLimit = overdraftLimit;
    }
    
    void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully");
        } else {
            System.out.println("Exceeded overdraft limit");
        }
    }
    
    void display() {
        super.display();
        System.out.println("Account Type: Current");
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("MyBank", "S001", "John", 1000, 5);
        CurrentAccount current = new CurrentAccount("MyBank", "C001", "Jane", 2000, 500);
        
        System.out.println("SAVINGS ACCOUNT:");
        savings.display();
        savings.deposit(500);
        savings.withdraw(200);
        savings.addInterest();
        System.out.println("Updated Balance: " + savings.balance);
        
        System.out.println("\nCURRENT ACCOUNT:");
        current.display();
        current.deposit(300);
        current.withdraw(2500);
        System.out.println("Updated Balance: " + current.balance);
    }
}