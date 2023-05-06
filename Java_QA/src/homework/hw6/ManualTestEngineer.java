package homework.hw6;

public class ManualTestEngineer extends Employee{
    final String lastName;

    public ManualTestEngineer(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
    @Override
    public String getPosition() {
        return "Manual Test Engineer";
    }

    @Override
    public String getSeniority() {
        return "Junior";
    }
    @Override
    public String getInfo() {
        return getName() + " " + getLastName() + " is a " + getSeniority() + " " + getPosition();
    }
}
