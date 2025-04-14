import java.util.*;

class Customer {
    private String customerId;
    private String name;
    private List<Account> accounts;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void openAccount(Account account) {
        accounts.add(account);
        System.out.println(name + " opened new account: " + account.accountNumber);
    }

    public void viewAccounts() {
        System.out.println("\nAccounts for " + name + ":");
        for (Account acc : accounts) {
            acc.displayAccountDetails();
        }
    }

    public String getCustomerId() {
        return customerId;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

}
