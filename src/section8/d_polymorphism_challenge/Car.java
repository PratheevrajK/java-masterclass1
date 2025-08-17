package section8.d_polymorphism_challenge;

public class Car {
    private String description;
    public Car(String description) {
        this.description = description;
    }
    public void startEngine() {
        System.out.println("Car -> Starting...");
    }
    public void drive() {
        System.out.printf("%s is moving...\n", getClass().getSimpleName());
        runEngine();
    }
    protected void runEngine() {
        System.out.println("Car -> engine/motor is running...");
    }
}
