package section8.a_smart_kitchen_challenge;

public class Refrigerator extends Appliance {
    public void orderFood() {
        if (getHasWorkToDo()) {
            System.out.println("Your Food is being prepared!");
            setHasWorkToDo(false);
        }
    }
}
