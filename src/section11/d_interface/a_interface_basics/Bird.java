package section11.d_interface.a_interface_basics;

public class Bird extends Animal implements FlightEnabled, Trackable {
    @Override
    void move() {
        System.out.println("Wings Flaps!");
    }

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
