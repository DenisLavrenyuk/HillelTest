package homework.hw8;

public class BigDog extends Dog{

    public BigDog(String name) {
        super(name);
    }
    @Override
    void greets() {
        System.out.println("Woow");
    }
}
