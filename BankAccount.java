public class BankAccount {

    // Private attributes (encapsulated)
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Public getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Transaction methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + " into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + " from account " + accountNumber);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            System.out.println("Insufficient funds in account " + accountNumber);
        }
    }

    // Example usage (Main class)
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("PGR500", "Rafael Meneses", 100.00);

        // Access account details using getter methods
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Perform transactions
        account.deposit(435.00);
        account.withdraw(212.00);
        account.withdraw(1430.00); // Attempt to withdraw more than balance
        account.deposit(-180.00); // Attempt to deposit a negative amount

        // Display the final balance
        System.out.println("Final Balance: $" + account.getBalance());
    }
}
