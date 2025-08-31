package section11.d_interface.b_interface_extends_interfaces;

import section11.d_interface.a_interface_basics.FlightEnabled;

// Satellite class must implement all the abstract methods of OrbitEarth and its extended Interfaces.
public class Satellite implements OrbitEarth {
    // Overridden orbit method here can be default(package private), as the orbit method in OrbitEarth Interface is public. Got below error, when keeping the method default.
    //'orbit()' in 'section11.d_interface_basics.interface_extends_interfaces.Satellite' clashes with 'orbit()' in 'section11.d_interface_basics.interface_extends_interfaces.OrbitEarth'; attempting to assign weaker access privileges ('package-private'); was 'public'
    @Override
    public void orbit() {
        System.out.println(getClass().getSimpleName() + " is in the Orbit!");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " has started to fly."); // getClass().getSimpleName() - Runtime class is Satellite.
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

// Record can implement interfaces like Class.
 record DragonFly(String type, double weight) implements FlightEnabled {
     @Override
     public void takeOff() {
         System.out.println(getClass().getSimpleName() + " has started to fly."); // getClass().getSimpleName() - Runtime class is Satellite.
     }

     @Override
     public void fly() {
         System.out.println(getClass().getSimpleName() + " is flying.");
     }

     @Override
     public void land() {
         System.out.println(getClass().getSimpleName() + " has landed.");
     }
 }