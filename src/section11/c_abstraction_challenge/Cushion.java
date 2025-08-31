package section11.c_abstraction_challenge;

public class Cushion extends ProductForSale {
    public Cushion(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.printf("%s brand is %s selling at $%.2f per item%n", getClass().getSimpleName(), type.toUpperCase(), price);
        System.out.println("Our customers say - " + description);
    }
}
