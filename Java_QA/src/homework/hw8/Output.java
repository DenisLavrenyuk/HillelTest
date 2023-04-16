package homework.hw8;

public class Output {
    public static void main(String[] args) {
        Dog dog = new Dog("Snoopy");
        dog.greets();
        Dog dog1 = new Dog("Pluto");
        dog.greets();
        Cat cat = new Cat("Tom");
        cat.greets();
        cat.feed();
        cat.walk();
        cat.play();
        Lion lion = new Lion("Simba");
        lion.greets();
        Wolf wolf = new Wolf("Akella");
        wolf.hunting();
        BigDog bigDog = new BigDog("Clifford");
        bigDog.greets();
//        System.out.println(dog+" "+dog1+" "+cat);

        test(dog);
        test(dog1);
        test(cat);
    }
    public static void test (Animal animal){
        System.out.println(animal.getName());
    }
}
