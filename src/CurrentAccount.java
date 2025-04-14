class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from " + accountNumber);
        } else {
            System.out.println("Exceeded overdraft limit!");
        }
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Current Account: " + accountNumber + " | Balance: ₹" + balance);
    }
}
