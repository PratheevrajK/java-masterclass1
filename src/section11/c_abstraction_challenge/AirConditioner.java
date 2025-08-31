package section11.c_abstraction_challenge;

public class AirConditioner extends ProductForSale {
    public AirConditioner(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.printf("%s brand is %s selling at $%.2f%n", getClass().getSimpleName(), type.toUpperCase(), price);
        System.out.println(description);
    }
}
