package section11.a_abstraction_basics;

public abstract class Animal {
    protected String type;
    private String size;
    public double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void makeNoise();
    public abstract void move(String speed);
}
