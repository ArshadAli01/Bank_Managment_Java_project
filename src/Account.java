import java.util.*;

abstract class Account {
    protected String accountNumber;
    protected double balance;
    protected Date openedDate;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.openedDate = new Date(); // current date
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " to " + accountNumber);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from " + accountNumber);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public abstract void displayAccountDetails();
}
