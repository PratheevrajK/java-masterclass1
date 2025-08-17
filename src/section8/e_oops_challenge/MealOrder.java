package section8.e_oops_challenge;

public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder() {
        this(new Burger(),
                new Item("Drink", "Coke", 50),
                new Item("Side", "Fries", 100));
    }

    public MealOrder(Burger burger, Item drink, Item side) {
        this.burger = burger;
        this.drink = drink;
        this.side = side;
    }
    public void setDrinkSize(String drinkSize) {
        drink.setSize(drinkSize);
    }

    public void printItemizedList() {
        System.out.printf("""
                MealOrder:
                %s
                %s
                %s %n""", burger.printItem(), drink.printItem(), side.printItem());
    }
    public void printTotal() {
        System.out.println("Total price: " + (burger.getBasePrice()+ drink.getBasePrice()+ side.getBasePrice()));
    }
}
