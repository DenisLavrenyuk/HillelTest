package homework.hw8;

public class Output {
    public static void main(String[] args) {
        Dog dog = new Dog("Snoopy");
        dog.greets();
        Dog dog1 = new Dog("Pluto");
        dog.greets();
        Cat cat = new Cat("Tom");
        System.out.println(dog+" "+dog1+" "+cat);
    }
}
