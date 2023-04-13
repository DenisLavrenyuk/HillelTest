package lesson6;

public class Passport {
    public String getString() {
        return string;
    }

    private static String string = "Human";

    public static void print() {
        System.out.println("hello Pasport");
    }

    public void setString(String string) {
        Passport.string = string;
    }

    private String name, family;
    private int age;

    public void setAge(int age) {
        if (age > 14 && age < 90) {
            this.age = age;
        } else {
            this.age = 14;
        }
    }

    public String getFamily() {
        return family;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    private String sex;

    public String getName() {
        return name;
    }

    public Passport(String name, int age) {
        this.name = name;
        setAge(age);
        this.sex = "male";
        this.family = "Dou";
    }

    public Passport(String name, int age, String family, String sex) {
        this.name = name;
        this.family = verifyFamily(family);
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

