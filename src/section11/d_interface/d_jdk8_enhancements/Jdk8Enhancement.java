package section11.d_interface.d_jdk8_enhancements;

import section11.d_interface.a_interface_basics.FlightEnabled;
import section11.d_interface.a_interface_basics.Jet;

public class Jdk8Enhancement {
    public static void main(String[] args) {
        inFlight(new Jet());
        //Jet has started to fly.
        //Jet is flying.
        //Jet has landed.

        Rocket rocket = new Rocket();
        rocket.log(" - STARTING Launch"); //Sat Aug 30 21:11:32 IST 2025 - STARTING Launch
        inFlight(rocket);
        //Sat Aug 30 21:11:32 IST 2025 Begin transition to LAUNCH
        //Transitioning from GROUNDED to LAUNCH
        //Rocket has been launched
        //Sat Aug 30 21:11:32 IST 2025 Begin transition to CRUISE
        //Transitioning from LAUNCH to CRUISE
        //Rocket is flying
        //Sat Aug 30 21:11:32 IST 2025 Begin transition to RETURN
        //Transitioning from CRUISE to RETURN
        //Rocket has landed
        rocket.log(" - COMPLETED Landing"); //Sat Aug 30 21:11:32 IST 2025 - COMPLETED Landing

    }
    public static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.fly();
        flier.land();
    }
}
