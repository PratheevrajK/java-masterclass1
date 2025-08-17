package section8.e_oops_challenge;

public class Main {
    public static void main(String[] args) {
        MealOrder regular = new MealOrder();
        regular.printItemizedList();
        regular.printTotal();

        System.out.println("Updating drink size...");
        regular.setDrinkSize("LARGE");
        regular.printItemizedList();
        regular.printTotal();

    }
}
