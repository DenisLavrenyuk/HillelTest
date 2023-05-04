package homework.hw6;

public class AngularDeveloper extends Employee{
    public AngularDeveloper(String name) {
        super(name);
    }

    @Override
    public String getPosition() {
        return "Angular Developer";
    }

    @Override
    public String getSeniority() {
        return "Middle";
    }
    @Override
    public String getInfo() {
        return getName() + " is a " + getSeniority() + " " + getPosition();
    }
}