package section7.b_constructor_challenge;

public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer(String name, String emailAddress) {
        this(name, 200, emailAddress);
    }

    public Customer() {
        this("NewUser", null);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String describeCustomer() {
        return name + " with emailId " + emailAddress + " has Credit limit of " + creditLimit;
    }
}
