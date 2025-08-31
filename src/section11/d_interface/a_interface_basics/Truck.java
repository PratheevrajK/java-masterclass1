package section11.d_interface.a_interface_basics;

public class Truck implements Trackable {
    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s Coordinates are recorded.");
    }
}
