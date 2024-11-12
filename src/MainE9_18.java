public class MainE9_18 {
    public static void main(String[] args) {
        CheckingAccountE9_18 account = new CheckingAccountE9_18(100.0); // Initial balance of $100

        // Perform some transactions
        account.deposit(50);  // Deposit $50
        account.deposit(20);  // Deposit $20
        account.deposit(10);  // Deposit $10
        account.deposit(30);  // This deposit should incur a fee (4th transaction)

        account.withdraw(40);  // Withdrawal of $40
        account.withdraw(30);  // Withdrawal of $30 (5th transaction, should incur a fee)

        // Print final balance and transaction count
        System.out.println("Final balance: " + account.getBalance());
        System.out.println("Total transactions: " + account.getTransactionCount());
    }
}
