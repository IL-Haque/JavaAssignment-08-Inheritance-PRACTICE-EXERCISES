// Main.java
public class MainE9_2 {
    public static void main(String[] args) {
        BasicAccount account = new BasicAccount(100.0);

        // Display initial balance
        System.out.println("Initial balance: " + account.getBalance());

        // Try to withdraw an amount within the balance
        account.withdraw(50.0);

        // Attempt to withdraw more than the balance
        account.withdraw(100.0);

        // Display final balance
        System.out.println("Final balance: " + account.getBalance());
    }
}
