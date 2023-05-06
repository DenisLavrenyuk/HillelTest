package homework.hw8;

public class BigDog extends Dog{

    public BigDog(String name) {
        super(name);
    }
    @Override
    void greets() {
        System.out.println("Woow");
    }
    void greets(Dog dog) {
        System.out.println("Woooow");
    }
    void greets(BigDog dog) {
        System.out.println("Woooooooow");
    }
}
