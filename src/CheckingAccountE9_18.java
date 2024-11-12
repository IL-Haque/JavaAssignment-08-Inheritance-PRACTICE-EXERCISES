public class CheckingAccountE9_18 {
    private double balance;
    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 1.0;

   
    public CheckingAccountE9_18(double initialBalance) {
        balance = initialBalance;
        transactionCount = 0; 
    }

    public void deposit(double amount) {
        balance += amount;
        transactionCount++;
        applyTransactionFee();
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactionCount++;
            applyTransactionFee();
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    private void applyTransactionFee() {
        if (transactionCount > FREE_TRANSACTIONS) {
            balance -= TRANSACTION_FEE;
            System.out.println("Transaction fee applied. New balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getTransactionCount() {
        return transactionCount;
    }
}
