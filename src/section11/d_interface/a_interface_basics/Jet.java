package section11.d_interface.a_interface_basics;

public class Jet implements FlightEnabled, Trackable{
    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " has started to fly."); // getClass().getSimpleName() - Runtime class is Bird.
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying.");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " has landed.");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s Coordinates are recorded.");
    }
}
