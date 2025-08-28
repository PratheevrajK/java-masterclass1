package section10.g_enums;

public class VehicleDetails {
    public static void main(String[] args) {
        for (Vehicle vehicle : Vehicle.values()) {
            System.out.printf("%s has %d tyres.%n", vehicle.name(), vehicle.noOfTyres());
        }
//        BIKE has 2 tyres.
//        SCOOTY has 2 tyres.
//        AUTO has 3 tyres.
//        CAR has 4 tyres.
//        JEEP has 4 tyres.
//        VAN has 4 tyres.
//        BUS has 4 tyres.
//        LORRY has 4 tyres.
    }
}
