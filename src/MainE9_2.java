
public class MainE9_2 {
    public static void main(String[] args) {
        BasicAccount account = new BasicAccount(100.0);

        System.out.println("Initial balance: " + account.getBalance());

        account.withdraw(50.0);

        account.withdraw(100.0);


        System.out.println("Final balance: " + account.getBalance());
    }
}
