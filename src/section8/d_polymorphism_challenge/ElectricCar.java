package section8.d_polymorphism_challenge;

public class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;
    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
    @Override
    public void startEngine() {
        System.out.printf("Electric Car -> All %d batteries are connected, Ready!\n", batterySize);
    }
    @Override
    protected void runEngine() {
        System.out.printf("Electric Car-> Usage exceeds the average: %.2f.\n", avgKmPerCharge);
    }
}

