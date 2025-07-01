
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accNo, double bal, double rate) {
        super(accNo, bal);
        this.interestRate = rate;
    }

    void displayAccountType() {
        System.out.println("Savings Account");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accNo, double bal, double limit) {
        super(accNo, bal);
        this.withdrawalLimit = limit;
    }

    void displayAccountType() {
        System.out.println("Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {
    int maturityPeriod;

    FixedDepositAccount(String accNo, double bal, int period) {
        super(accNo, bal);
        this.maturityPeriod = period;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}
