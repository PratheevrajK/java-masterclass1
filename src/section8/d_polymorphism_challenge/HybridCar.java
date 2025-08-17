package section8.d_polymorphism_challenge;

public class HybridCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;
    private int batterySize;
    public HybridCar(String description, double avgKmPerLitre, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }
    @Override
    public void startEngine() {
        System.out.printf("Hybrid Car -> All %d cylinders are fired up, Ready!\n", cylinders);
    }
    @Override
    protected void runEngine() {
        System.out.printf("Hybrid Car-> Usage exceeds the average: %.2f for %d batteries.\n", avgKmPerLitre, batterySize);
    }
}