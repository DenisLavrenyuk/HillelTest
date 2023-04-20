package lessons.l6.animals;

public class Eagle extends Bird{
    String color;


    public Eagle(String name, int age, String color, int number, String color1) {
        super(name, age, color, number);
        this.color = color1;
    }
}