package section11.a_abstraction_basics;

public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void makeNoise() {
        if(type.equals("Whale")) {
            System.out.println("Songs!");
        } else {
            System.out.println("Purrs!");
        }
    }

    @Override
    public void move(String speed) {
        if(speed.equals("Slow")) {
            System.out.println(type + " is floating!");
        } else {
            System.out.println(type + " is swimming!");
        }
    }

}
