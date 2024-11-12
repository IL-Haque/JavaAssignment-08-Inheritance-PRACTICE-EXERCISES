class BasicAccountE9_3 extends BankAccountE9_3 {
    private static final double OVERDRAFT_PENALTY = 30.0;

    public BasicAccountE9_3(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            super.withdraw(amount);
            if (balance < 0) {  // Check for overdraft
                System.out.println("Overdraft occurred! Applying penalty.");
                balance -= OVERDRAFT_PENALTY;
            }
        } else {
            System.out.println("Withdrawal amount must be positive");
        }
    }
}
