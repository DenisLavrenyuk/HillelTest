package lessons.l11;

public class User {
    String name;
    String family;

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public String getPassword() {
        return password;
    }

    public User(String name, String family, String password) {
        this.name = name;
        this.family = family;
        this.password = password;
    }

    String password;

}
