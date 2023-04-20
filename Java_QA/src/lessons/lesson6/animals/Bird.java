package lessons.lesson6.animals;

public class Bird extends Animal {
    public String getColor() {
        return color;
    }

    private String color;
    private int number;

    public Bird(String name, int age, String color, int number) {
        super(name, age);
        this.color = color;
        this.number = number;
    }
}
