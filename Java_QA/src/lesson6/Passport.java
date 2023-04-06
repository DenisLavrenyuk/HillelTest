package lesson6;

public class Passport {
//    public String getString() {
//        return string;}


    private String name, family;
    private int age;

    public void setAge(int age) {
        if (age>14 && age<90){
        this.age = age;}
        else {
            this.age=14;
        }
    }

    private String sex;

    public String getFamily() {
        return family;
    }

    public Passport(String name, int age) {
        this.name = name;
        setAge(age);
        this.sex = "male";
        this.family = "Dou";
    }

    public Passport(String name, int age, String family, String sex) {
        this.name = name;
        verifyFamily(family);
        this.age = age;
        this.sex = sex;
    }

    public Passport() {
        this.name = "Ivanov";
        this.family = "Ivanov";
        this.age = 15;
        this.sex = "male";
    }

    private String verifyFamily(String str) {
        if (str != "Ivanov") {
            return str;
        } else {
            return "Dou";
        }
    }
}

