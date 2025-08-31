package section11.a_abstraction_basics;

public class Dog extends Animal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void makeNoise() {
        if(type.equals("Puppy")) {
            System.out.println("Lol!");
        } else {
            System.out.println("Woof Woof!");
        }
    }

    @Override
    public void move(String speed) {
        if(speed.equals("Slow")) {
            System.out.println(type + " is walking!");
        } else {
            System.out.println(type + " is running!");
        }
    }

}
