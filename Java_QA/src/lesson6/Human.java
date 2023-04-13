package lesson6;

public class Human {
    String name, family;
    int age;
    String sex;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.sex="male";
        this.family="Dou";
    }

    public Human(String name,int age, String family, String sex) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.sex = sex;
    }

    public Human() {
        this.name="Ivanov";
        this.family="Ivanov";
        this.age=15;
        this.sex="male";
    }
}
