package section11.d_interface.b_interface_extends_interfaces;

public class Main {
    public static void main(String[] args) {
        Satellite satellite = new Satellite();
        satellite.takeOff();
        satellite.fly();
        satellite.orbit();
        satellite.track();
        satellite.land();
        //Satellite has started to fly.
        //Satellite is flying.
        //Satellite is in the Orbit!
        //Satellite's Coordinates are recorded.
        //Satellite has landed.

        OrbitEarth orbiter = satellite;
        orbiter.orbit(); // Satellite is in the Orbit!

        FlightStage.CRUISE.track(); // Tracking is active!
        FlightStage.GROUNDED.track(); // Tracking is disabled!

        DragonFly fly = new DragonFly("Double-winged", 10.5);
        System.out.println(fly.type()); // Double-winged
        fly.takeOff(); // DragonFly has started to fly.
    }
}
