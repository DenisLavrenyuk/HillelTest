package lessons.lesson6.animals;

public class Parrot extends Bird{

    public Parrot(String name, int age, String color, int number) {
        super(name, 10, color, number);
    }
    public void fly(){
        System.out.println(getName()+" I can fly: \n "+getAge() + " "+getColor());
    }
}
