package lessons.l9;

import lessons.l81.Cat;
import lessons.l81.Dog;

public class lesson91 {
    public static void main(String[] args) {
        Dog dog= new Dog("Spyke");
        //  System.out.println(dog);
        Cat cat=new Cat("Spyke");
        //  System.out.println(cat);
        Dog dog2=new Dog("pyke");
        System.out.println(dog==dog2);
        System.out.println(dog.equals(cat));

    }
}
