class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void showDetails() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: ₹" + getBalance());
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(123456, "Michael", 5000.0);
        sa.showDetails();
        sa.deposit(1500.0);
        System.out.println("Updated Balance: ₹" + sa.getBalance());
    }
}
