class BankAccountE9_3 {
    protected double balance;

    public BankAccountE9_3(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal amount must be positive");
        }
    }

    public double getBalance() {
        return balance;
    }
}

