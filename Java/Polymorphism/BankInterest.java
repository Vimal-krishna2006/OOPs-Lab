class Bank {
    // Method to display interest rate
    public void getInterestRate() {
        System.out.println("Bank interest rate: 5%");
    }
}

class SBI extends Bank {
    // Overriding the method in SBI class
    @Override
    public void getInterestRate() {
        System.out.println("SBI interest rate: 6%");
    }
}

class HDFC extends Bank {
    // Overriding the method in HDFC class
    @Override
    public void getInterestRate() {
        System.out.println("HDFC interest rate: 7%");
    }
}

public class BankInterest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();
        
        bank.getInterestRate(); // Calls Bank's method
        sbi.getInterestRate();  // Calls SBI's overridden method
        hdfc.getInterestRate(); // Calls HDFC's overridden method
    }
}
