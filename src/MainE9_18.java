public class MainE9_18 {
    public static void main(String[] args) {
        CheckingAccountE9_18 account = new CheckingAccountE9_18(100.0); // Initial balance of $100

      
        account.deposit(50); 
        account.deposit(20); 
        account.deposit(10);  
        account.deposit(30); 
        account.withdraw(40);  
        account.withdraw(30);  

    
        System.out.println("Final balance: " + account.getBalance());
        System.out.println("Total transactions: " + account.getTransactionCount());
    }
}
