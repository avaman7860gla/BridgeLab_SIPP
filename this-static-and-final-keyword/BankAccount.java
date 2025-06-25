class BankAccount {
    static String bankName = "ABC Bank";
    static int totalAccounts = 0;

    final String accountNumber;
    String accountHolderName;

    BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Bank Name: " + bankName);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("12345", "Alice");
        BankAccount acc2 = new BankAccount("67890", "Bob");
        acc1.displayDetails();
        acc2.displayDetails();
        BankAccount.getTotalAccounts();
    }
}