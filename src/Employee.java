class Employee {
    private String employeeId;
    private String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public void createAccountForCustomer(Customer customer, Account account) {
        customer.openAccount(account);
        System.out.println("Employee " + name + " created account for " + customer.getCustomerId());
    }
}
