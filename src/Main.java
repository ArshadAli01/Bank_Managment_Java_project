import java.util.*;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final Bank bank = new Bank("ChatGPT Bank");
    private static final Map<String, Customer> customerMap = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("🏦 Welcome to ChatGPT Bank");

        while (true) {
            System.out.println("\n===== Main Menu =====");
            System.out.println("1. Add Customer");
            System.out.println("2. Open Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. View Account Details");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addCustomer();
                case 2 -> openAccount();
                case 3 -> depositMoney();
                case 4 -> withdrawMoney();
                case 5 -> viewAccount();
                case 6 -> {
                    System.out.println("Thank you for using ChatGPT Bank. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void addCustomer() {
        System.out.print("Enter Customer ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        Customer customer = new Customer(id, name);
        customerMap.put(id, customer);
        bank.addCustomer(customer);
        System.out.println("✅ Customer added successfully.");
    }

    private static void openAccount() {
        System.out.print("Enter Customer ID: ");
        String id = sc.nextLine();
        Customer customer = customerMap.get(id);
        if (customer == null) {
            System.out.println("❌ Customer not found!");
            return;
        }

        System.out.println("1. Savings Account\n2. Current Account");
        System.out.print("Choose account type: ");
        int type = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Account Number: ");
        String accNum = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        if (type == 1) {
            System.out.print("Enter Interest Rate: ");
            double rate = sc.nextDouble();
            SavingsAccount sa = new SavingsAccount(accNum, balance, rate);
            customer.openAccount(sa);
        } else if (type == 2) {
            System.out.print("Enter Overdraft Limit: ");
            double limit = sc.nextDouble();
            CurrentAccount ca = new CurrentAccount(accNum, balance, limit);
            customer.openAccount(ca);
        } else {
            System.out.println("❌ Invalid account type.");
        }
    }

    private static void depositMoney() {
        Account account = findAccount();
        if (account == null) return;

        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
    }

    private static void withdrawMoney() {
        Account account = findAccount();
        if (account == null) return;

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }

    private static void viewAccount() {
        System.out.print("Enter Customer ID: ");
        String id = sc.nextLine();
        Customer customer = customerMap.get(id);
        if (customer != null) {
            customer.viewAccounts();
        } else {
            System.out.println("❌ Customer not found!");
        }
    }

    private static Account findAccount() {
        System.out.print("Enter Customer ID: ");
        String id = sc.nextLine();
        Customer customer = customerMap.get(id);
        if (customer == null) {
            System.out.println("❌ Customer not found!");
            return null;
        }

        System.out.print("Enter Account Number: ");
        String accNum = sc.nextLine();

        for (Account acc : customer.getAccounts()) { // access directly for now
            if (acc.accountNumber.equals(accNum)) {
                return acc;
            }
        }
        System.out.println("❌ Account not found!");
        return null;
    }
}
