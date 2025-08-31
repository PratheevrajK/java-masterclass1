package section11.b_abstraction_hierarchy;

import section11.a_abstraction_basics.Animal;

public abstract class Mammal extends Animal {
    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }
    public abstract void shedHair();
}
