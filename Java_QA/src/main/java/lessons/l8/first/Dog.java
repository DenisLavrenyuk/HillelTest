package lessons.l8.first;

import java.util.Objects;

public class Dog extends Animal implements Pet{
    int t;
    public Dog(String name) {
        super(name);
    }

    @Override
    void greeds() {
        System.out.println("dog say "+getName()+" woof");
    }
    private   String greeds(int t) {
        System.out.println("dog say "+getName()+" woof");
        return "dog say "+getName()+" woof";
    }
    void greeds(Dog dog) {
        System.out.println("dog say "+dog.getName()+" woooooooof");
    }

    @Override
    public void feed() {
        System.out.println("================");
    }

    @Override
    public void play() {

    }

    @Override
    public void valk() {

    }

    @Override
    public String toString() {
        return "{\"Name\":"+getName()+",\n\"Greeds\":"+greeds(5)+"}";
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true; // сравнение ссылки в памяти
// return obj instanceof Dog dog)&&(this.getName().equals(dog.getName())); //сравнение типа обьекта и имени
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return t == dog.t;
    }

    @Override
    public int hashCode() {
        return Objects.hash(t);
    }
}