package lesson6.animals;

public class Mammal extends Animal{
    boolean predator;
    String color;

    public boolean isPredator() {
        return predator;
    }

    public void setPredator(boolean predator) {
        this.predator = predator;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Mammal(String name, int age, boolean predator, String color) {
        super(name, age);
        this.predator = predator;
        this.color = color;
    }
}
