package section11.c_abstraction_challenge;

public class MobilePhone extends ProductForSale {
    public MobilePhone(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.printf("%s item is %s selling at $%.2f per phone.%n", getClass().getSimpleName(), type.toUpperCase(), price);
        System.out.println("Brand motto - " + description);
    }
}
