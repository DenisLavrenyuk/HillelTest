package lesson6.animals;

public class Mammal extends Animal{
    boolean predator;
    String color;

    public Mammal(String name, int age, boolean predator, String color) {
        super(name, age);
        this.predator = predator;
        this.color = color;
    }
}
