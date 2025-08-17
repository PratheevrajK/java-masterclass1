package section8.a_smart_kitchen_challenge;

public class DishWasher extends Appliance {
    public void doDishes() {
        if (getHasWorkToDo()) {
            System.out.println("Your Dishes are being washed!");
            setHasWorkToDo(false);
        }
    }
}
