package section11.d_interface.b_interface_extends_interfaces;

import section11.d_interface.a_interface_basics.Trackable;

// Enums can implement interfaces like Class.
public enum FlightStage implements Trackable {
     GROUNDED, LAUNCH, CRUISE, RETURN;

     @Override
     public void track() {
         if(!this.equals(GROUNDED)) {
             System.out.println("Tracking is active!");
         } else {
             System.out.println("Tracking is disabled!");
         }
     }

     public FlightStage getNextStage() {
         FlightStage[] stages = values();
         return stages[(ordinal() + 1) % stages.length];
     }
 }
