package section8.d_polymorphism_challenge;

public class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;
    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }
    @Override
    public void startEngine() {
        System.out.printf("Gas Car -> All %d cylinders are fired up, Ready!\n", cylinders);
    }
    @Override
    protected void runEngine() {
        System.out.printf("Gas Car-> Usage exceeds the average: %.2f.\n", avgKmPerLitre);
    }
}
