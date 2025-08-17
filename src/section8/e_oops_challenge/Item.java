package section8.e_oops_challenge;

public class Item {
    private String type;
    private String name;
    private double price;
    private String size = "MEDIUM";

    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public double getBasePrice() {
        return price;
    }
    public double getAdjustedPrice(String size) {
        return switch (size) {
            case "LARGE" -> getBasePrice() + 50;
            case "SMALL" -> getBasePrice() - 50;
            default -> getBasePrice();
        };
    }
    public void setPrice(double adjustPrice) {
        this.price = adjustPrice;
    }
    public void setSize(String size) {
        this.size = size;
        double adjustedPrice = getAdjustedPrice(size);
        setPrice(adjustedPrice);
    }

    public String printItem() {
        if (getType().equals("DRINK")) {
            return getType() + ": { name='" + getName() + "', price='" + getBasePrice() + "', size='" + size + "'}";
        }
        return getType() + ": { name='" + getName() + "', price='" + getBasePrice() + "'}";
    }
}
