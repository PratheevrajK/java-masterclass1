package section11.b_abstraction_hierarchy;

public class Bird extends Mammal {
    public Bird(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair() {
        System.out.printf("%s (%s) sheds hair once in lifetime.%n", getClass().getSimpleName(), type);
    }

    @Override
    public void makeNoise() {
        System.out.println("Screech!");
    }

    @Override
    public void move(String speed) {
        if(speed.equals("Slow")) {
            System.out.println(type + " floats in air!");
        } else {
            System.out.println(type + " flew away!");
        }
    }
}
