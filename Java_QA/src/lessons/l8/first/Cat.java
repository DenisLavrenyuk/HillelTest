package lessons.l8.first;

public class Cat extends Animal implements Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    void greeds() {
        System.out.println("CAt "+getName()+"  seys mow");
    }

    @Override
    public void feed() {
        System.out.println( "Feading cat "+getName());
    }

    @Override
    public void play() {
        System.out.println("Playing cat "+getName());
    }

    @Override
    public void valk() {
        System.out.println("Walking cat "+getName());
    }
}
