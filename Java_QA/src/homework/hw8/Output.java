package homework.hw8;

public class Output {
    public static void main(String[] args) {
        Dog dog = new Dog("Snoopy");
        dog.greets();
        Dog newdog = new Dog("Pluto");
        dog.greets(newdog);
        Cat cat = new Cat("Tom");
        cat.greets();cat.feed();cat.walk();cat.play();
        Lion lion = new Lion("Simba");
        lion.greets();
        Wolf wolf = new Wolf("Akella");
        wolf.hunting();
        BigDog bigDog = new BigDog("Clifford");
        bigDog.greets();bigDog.greets(dog);
        BigDog newbigDog = new BigDog("Sentbernar");
        bigDog.greets(newbigDog);
Iguana iguana=new Iguana("Rango");
iguana.feed(); iguana.play();iguana.walk();iguana.greets();iguana.hunting();
    }
}
