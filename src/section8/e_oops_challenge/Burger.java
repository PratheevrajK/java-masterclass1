package section8.e_oops_challenge;

public class Burger extends Item {
    private Item topping1;
    private Item topping2;
    private Item topping3;

    public Burger(String name, double price) {
        super("BURGER", name, price);
    }
    public Burger() {
        this("Regular", 250);
    }

    public void addTopping(String name, double price) {
        String type = "TOPPING";
        if (topping1 == null) {
            topping1 = new Item(type, name, price);
        } else if (topping2 == null) {
            topping2 = new Item(type, name, price);
        } else if (topping3 == null) {
            topping3 = new Item(type, name, price);
        } else {
            System.out.println("Already added max(3) toppings! Ignoring this one.");
        }
    }

    @Override
    public double getBasePrice() {
        return super.getBasePrice()
                + (topping1 != null ? topping1.getBasePrice() : 0)
                + (topping2 != null ? topping2.getBasePrice() : 0)
                + (topping3 != null ? topping3.getBasePrice() : 0);
    }
}
