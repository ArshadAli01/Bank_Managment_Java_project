class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest: ₹" + interest);
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Savings Account: " + accountNumber + " | Balance: ₹" + balance);
    }
}
