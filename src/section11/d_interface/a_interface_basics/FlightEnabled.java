package section11.d_interface.a_interface_basics;

import section11.d_interface.b_interface_extends_interfaces.FlightStage;

import java.util.Date;

public interface FlightEnabled{
    double MILE_TO_KM = 1.60934;
    double KM_TO_MILE = 0.621371;

    public abstract void takeOff(); // public and abstract are redundant.
    abstract void fly(); // abstract is redundant.
    void land(); // suggested approach to declare abstract in an Interface.

    // Jdk8 enhancement - default method is introduced.
    default FlightStage transition(FlightStage stage) {
//        System.out.println("Transition not implemented on " + getClass().getSimpleName());
//        return null;
        FlightStage nextStage = stage.getNextStage();
        log(" Begin transition to " + nextStage);
        System.out.println("Transitioning from " + stage +  " to " + nextStage);
        return nextStage;
    }
    // Jdk8 enhancement - public static method is introduced.
    static void log(String description) {
        Date today = new java.util.Date();
        System.out.println(today + description);
    }
    //Jdk9 enhancement - private static method is introduced.
    private void logStage(FlightStage stage) {
        System.out.println("Monitoring " + stage);
    }
}
