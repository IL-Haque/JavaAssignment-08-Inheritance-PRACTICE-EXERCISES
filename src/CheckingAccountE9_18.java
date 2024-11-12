public class CheckingAccountE9_18 {
    private double balance;
    private int transactionCount; // To keep track of the number of transactions
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 1.0;

    // Constructor to initialize the balance and transaction count
    public CheckingAccountE9_18(double initialBalance) {
        balance = initialBalance;
        transactionCount = 0; // Initially no transactions have occurred
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        transactionCount++;
        applyTransactionFee();
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactionCount++;
            applyTransactionFee();
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    // Method to calculate and apply the transaction fee if necessary
    private void applyTransactionFee() {
        if (transactionCount > FREE_TRANSACTIONS) {
            balance -= TRANSACTION_FEE; // Deduct the fee
            System.out.println("Transaction fee applied. New balance: " + balance);
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Method to get the number of transactions for testing purposes
    public int getTransactionCount() {
        return transactionCount;
    }
}
