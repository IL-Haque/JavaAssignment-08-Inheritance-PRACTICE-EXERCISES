public class BasicAccount extends BankAccount {
    public BasicAccount() {
        super();
    }

    public BasicAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Insufficient funds. Cannot withdraw " + amount);
        } else {
            super.withdraw(amount);
            System.out.println("Withdraw successful. New balance: " + getBalance());
        }
    }
}
