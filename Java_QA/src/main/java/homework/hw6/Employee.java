package homework.hw6;

public abstract class Employee {
    final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return name;
    }

     public abstract String getPosition();

     public abstract String getSeniority();

    public String getInfo() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
