package section11.d_interface.c_abstracted_reference_types;

import section11.d_interface.a_interface_basics.Bird;
import section11.d_interface.a_interface_basics.FlightEnabled;
import section11.d_interface.b_interface_extends_interfaces.Satellite;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Satellite satellite = new Satellite();

        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        fliers.add(bird);
        fliers.add(satellite);
        triggerFliers(fliers);

        LinkedList<FlightEnabled> otherFliers = new LinkedList<>();
        otherFliers.add(bird);
        otherFliers.add(satellite);
        triggerFliers(otherFliers);

        // Keeping the reference type as generalized one would be easy to handle all of its implemented types.
        List<FlightEnabled> anotherFliers = new LinkedList<>(); // We can just change the instance to LinkedList or ArrayList.
        anotherFliers.add(bird);
        anotherFliers.add(satellite);
        triggerFliers(anotherFliers);

        // Output would be same in all 3 cases.
        //Bird has started to fly.
        //Satellite has started to fly.
    }
    public static void triggerFliers(List<FlightEnabled> fliers) {
        for (FlightEnabled fly : fliers) {
            fly.takeOff();
        }
    }
}
