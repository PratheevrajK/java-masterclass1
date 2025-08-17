package section8.a_smart_kitchen_challenge;

public class Main {
    public static void main(String[] args) {
        SmartKitchen myKitchen = new SmartKitchen();

        myKitchen.addWater();
        myKitchen.loadDishwasher();
        myKitchen.pourMilk();
        myKitchen.getBrewMaster().brewCoffee();
        myKitchen.getDishWasher().doDishes();
        myKitchen.getIceBox().orderFood();

        myKitchen.setKitchenState(true, false, true);
        myKitchen.doKitchenWork();
    }
}
