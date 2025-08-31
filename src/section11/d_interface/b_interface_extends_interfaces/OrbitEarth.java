package section11.d_interface.b_interface_extends_interfaces;

import section11.d_interface.a_interface_basics.FlightEnabled;
import section11.d_interface.a_interface_basics.Trackable;

public interface OrbitEarth extends FlightEnabled, Trackable {
    void orbit();
}