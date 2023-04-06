package lesson6.animals;

public class Bird extends Animal {
    String color;

    public String getColor() {
        return color;
    }

    int number;

    public Bird(String name, int age, String color, int number) {
        super(name, age);
        this.color = color;
        this.number = number;
    }
}
