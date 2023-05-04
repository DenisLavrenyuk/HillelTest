package homework.hw6;

import java.util.Arrays;

public class Manager extends Employee{
    final String lastName;
    Employee[] team;

    public Manager(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
    @Override
    public String getPosition() {
        return "Manager";
    }

    @Override
    public String getSeniority() {
        return "Senior";
    }
    public void setTeamMembers(Employee... employees){
        team=employees;
    }

    @Override
    public String getInfo() {
        return getName()+" "+getLastName()+" is a "+getSeniority()+" "+getPosition()+" and has a team of "+team.length+" members: "+ Arrays.toString(team);
    }
}
