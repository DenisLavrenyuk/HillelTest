package homework.hw8;

public class Iguana extends Animal implements Pet, WildAnimal{
    public Iguana(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Iguana "+getName()+" says: Hello");
    }

    @Override
    public void feed() {
        System.out.println("Feeding iguana " + getName());
    }

    @Override
    public void walk() {
        System.out.println("Walking iguana "+getName());
    }
    @Override
    public void play() {
        System.out.println("Playing with iguana "+getName());}

    @Override
    public void hunting() {
        System.out.println("Iguana "+getName()+" goes hunting");
    }
}
