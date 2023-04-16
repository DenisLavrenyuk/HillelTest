package homework.hw8;

public class Dog extends Animal implements Pet {
    int t;

    public Dog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Dog says "+getName()+" Woof");
    }

    @Override
    public void feed() {
        System.out.println("Feeding dog "+getName());
    }

    @Override
    public void play() {
        System.out.println("Playing dog "+getName());
    }

    @Override
    public void walk() {
        System.out.println("Walking dog "+getName());
    }
}
