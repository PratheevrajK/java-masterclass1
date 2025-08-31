package section11.d_interface.d_jdk8_enhancements;

import section11.d_interface.a_interface_basics.FlightEnabled;
import section11.d_interface.b_interface_extends_interfaces.FlightStage;

public class Rocket implements FlightEnabled {

    FlightStage stage = FlightStage.GROUNDED;

    @Override
    public void takeOff() {
        transition(stage);
        System.out.println(getClass().getSimpleName() + " has been launched");
    }

    @Override
    public void fly() {
        transition(stage);
        System.out.println(getClass().getSimpleName() + " is flying");
    }

    @Override
    public void land() {
        transition(stage);
        System.out.println(getClass().getSimpleName() + " has landed");
    }

    // default methods of Interface are Optional to implement.
    @Override
    public FlightStage transition(FlightStage flightStage) {
        stage = FlightEnabled.super.transition(flightStage); // Calling the default method of the Interface.
        return stage;
    }
    public void log(String description) {
        FlightEnabled.log(description);
    }



}