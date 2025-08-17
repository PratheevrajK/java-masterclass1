package section8.d_polymorphism_challenge;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("Ferrari Red");
        myCar.startEngine();
        myCar.drive();

        Car gasCar = new GasPoweredCar("Petrol", 100, 2);
        gasCar.startEngine();
        gasCar.drive();

        Car electricCar = new ElectricCar("LiPo", 250, 4);
        electricCar.startEngine();
        electricCar.drive();

        Car hybridCar = new HybridCar("Hydrogen/Li-ion", 300, 2, 2);
        hybridCar.startEngine();
        hybridCar.drive();
    }
}
