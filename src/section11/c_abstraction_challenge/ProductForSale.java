package section11.c_abstraction_challenge;

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return quantity * price;
    }
    public void printPricedItem(int quantity) {
        System.out.printf("%-10s: %10.2f * %-4d = %10.2f%n", type, price, quantity, getSalesPrice(quantity));
    }
    public abstract void showDetails();
}
