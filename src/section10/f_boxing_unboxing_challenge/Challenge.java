package section10.f_boxing_unboxing_challenge;

import java.util.ArrayList;

public class Challenge {
    public static void main(String[] args) {
        Bank sbiBank = new Bank("SBI");
        System.out.println(sbiBank.getBankName());

        String customer1 = "Raj";
        sbiBank.addNewCustomer(customer1, 1000);
        sbiBank.addTransaction(customer1, 250.0);
        sbiBank.addTransaction(customer1, -100.0);
        sbiBank.printStatement(customer1);

        String customer2 = "Pratheev";
        sbiBank.addTransaction(customer2, 500.0);
        sbiBank.printStatement(customer2);
    }
}

class Bank {
    private String bankName;
    private ArrayList<Customer> customers;
    public Bank(String bankName) {
        this.bankName = bankName;
        customers = new ArrayList<>();
    }
    private Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if(customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer name - (%s) not found!%n", customerName);
        return null;
    }
    public void addNewCustomer(String customerName, double initialDeposit) {
        if(findCustomer(customerName) != null) {
            System.out.printf("Customer name - (%s) already exists!%n", customerName);
            return;
        }
        customers.add(new Customer(customerName, initialDeposit));
        System.out.printf("New Customer - (%s) has been added successfully!%n", customerName);
    }
    public void addTransaction(String customerName, double transactionAmount) {
        var customer = findCustomer(customerName);
        if(customer != null) {
            customer.transactions().add(transactionAmount);
        }
    }
    public String getBankName() {
        return bankName;
    }
    public void printStatement(String customerName) {
        var customer = findCustomer(customerName);
        if(customer != null) {
            System.out.println("-".repeat(30));
            System.out.printf("Customer name: %s%n", customer.name());
            System.out.println("Transactions:");
            for (double transaction : customer.transactions()) {
                System.out.printf("$%10.2f (%s)%n", transaction, transaction < 0 ? "debit" : "credit");
            }
            System.out.println("-".repeat(30));
        }
    }
}

record Customer(String name, ArrayList<Double> transactions) {
    public Customer(String name, double transaction) {
        this(name.toUpperCase(), new ArrayList<>());
        transactions.add(transaction);
    }
}