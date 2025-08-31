package section11.a_abstraction_basics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog puppy = new Dog("Puppy", "Small", 10);
        Fish whale = new Fish("Whale", "Large", 1000);
        executeBehaviours(puppy, "Slow");
        //Lol!
        //Puppy is walking!
        executeBehaviours(whale, "Fast");
        //Songs!
        //Whale is swimming!

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(puppy);
        animals.add(whale);
        animals.add(new Dog("Lab", "Large", 50));
        animals.add(new Dog("Bomarian", "Small", 25));
        animals.add(new Fish("Goldfish", "Small", 0.20));

        for(Animal animal : animals) {
            executeBehaviours(animal, "Fast");
        }
        //Lol!
        //Puppy is running!
        //Songs!
        //Whale is swimming!
        //Woof Woof!
        //Lab is running!
        //Woof Woof!
        //Bomarian is running!
        //Purrs!
        //Goldfish is swimming!
    }
    public static void executeBehaviours(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
    }
}
