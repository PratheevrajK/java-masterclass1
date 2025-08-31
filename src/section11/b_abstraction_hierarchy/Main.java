package section11.b_abstraction_hierarchy;

import section11.a_abstraction_basics.Animal;
import section11.a_abstraction_basics.Dog;
import section11.a_abstraction_basics.Fish;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Lab", "Large", 50));
        animals.add(new Dog("Puppy", "Small", 5));
        animals.add(new Fish("Goldfish", "Small", 0.20));
        animals.add(new Bird("Eagle", "Large", 3));

        for (Animal animal : animals) {
            executeBehaviours(animal, "Fast");
        }
        //Woof Woof!
        //Lab is running!
        //Lol!
        //Puppy is running!
        //Purrs!
        //Goldfish is swimming!
        //Screech!
        //Eagle flew away!
        //Bird (Eagle) sheds hair once in lifetime.
    }
    public static void executeBehaviours(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        if(animal instanceof Mammal mammalObj) {
            mammalObj.shedHair();
        }
    }
}
