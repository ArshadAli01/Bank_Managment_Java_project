import java.util.*;

class Bank {
    private String name;
    private List<Customer> customers;
    private List<Employee> employees;

    public Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
        employees = new ArrayList<>();
    }

    public void addCustomer(Customer c) {
        customers.add(c);
        System.out.println("Customer " + c.getCustomerId() + " added to bank.");
    }

    public void addEmployee(Employee e) {
        employees.add(e);
        System.out.println("Employee " + e + " added to bank.");
    }
}
