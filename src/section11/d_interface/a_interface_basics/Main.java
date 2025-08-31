package section11.d_interface.a_interface_basics;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird; // animal will have access to the methods of Animal class only.
        FlightEnabled flier = bird; // flier will have access to the methods of the declared FlightEnabled interface only.
        Trackable tracker = bird; // tracker will have access to the methods of the declared Trackable interface only.

        bird.takeOff(); // Bird has started to fly.
        bird.fly(); // Bird is flying.
        bird.move(); // Wings Flaps!
        bird.track(); // Bird's Coordinates are recorded.
        bird.land(); // Bird has landed.

        // Methods of the declared class is only accessible, even though the assigned runtime class Bird has all the methods.
        animal.move(); // Wings Flaps!
//        animal.fly(); Method not present.

        flier.takeOff(); // Bird has started to fly.
        flier.fly(); // Bird is flying.
        flier.land(); // Bird has landed.
//        flier.move() Method not present.

        tracker.track(); // Bird's Coordinates are recorded.
//        tracker.move(); Method not present.
//        tracker.land(); Method not present.

        System.out.println("-".repeat(30));
        inFlight(flier);
        //Bird has started to fly.
        //Bird is flying.
        //Bird's Coordinates are recorded.
        //Bird's Coordinates are recorded.
        //Wings Flaps!
        //Bird has landed.

        System.out.println("-".repeat(30));
        inFlight(new Jet());
        //Jet has started to fly.
        //Jet is flying.
        //Jet's Coordinates are recorded.
        //Jet has landed.

        System.out.println("-".repeat(30));
        Trackable truck = new Truck();
        truck.track(); // Truck's Coordinates are recorded.
        double kmsTravelled = 100;
        double milesTravelled = kmsTravelled * FlightEnabled.KM_TO_MILE;
        System.out.printf("The Truck has travelled %5.2f Kms or %5.2f miles.", kmsTravelled, milesTravelled); //The Truck has travelled 100.00 Kms or 62.14 miles.
    }
    public static void inFlight(FlightEnabled flier) {
        // flier object is declared as FlightEnabled interface, but in runtime it is a Bird instance.
        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable tracker) { // declaring FlightEnabled to Trackable instance.
            tracker.track();
        }
        if(flier instanceof Bird bird) { // declaring FlightEnabled to Bird instance.
            bird.track();
            bird.move();
        }
        flier.land();
    }
}
