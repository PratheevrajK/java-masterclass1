package section8.a_smart_kitchen_challenge;

public class CoffeeMaker extends Appliance {
    public void brewCoffee() {
        if (getHasWorkToDo()) {
            System.out.println("Your Coffee is getting brewed!");
            setHasWorkToDo(false);
        }
    }
}
