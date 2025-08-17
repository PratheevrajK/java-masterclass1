package section8.a_smart_kitchen_challenge;

public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;
    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }
    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }
    public DishWasher getDishWasher() {
        return dishWasher;
    }
    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void addWater() {
        brewMaster.setHasWorkToDo(true);
    }
    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }
    public void loadDishwasher() {
        dishWasher.setHasWorkToDo(true);
    }
    public void setKitchenState(boolean coffee, boolean dish, boolean fridge) {
        iceBox.setHasWorkToDo(fridge);
        brewMaster.setHasWorkToDo(coffee);
        dishWasher.setHasWorkToDo(dish);
    }
    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}
