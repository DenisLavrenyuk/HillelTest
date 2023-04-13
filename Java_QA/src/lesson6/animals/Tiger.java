package lesson6.animals;

public class Tiger extends Mammal{


    public Tiger(String name, int age, boolean predator, String color) {
        super(name, age, predator, color);
    }
    public Tiger(String name,int age,String color) {
        this(name,age,true,color);
    }
}
