package homework.hw7;

public class arrayMethods{
public static int[]addToArray(int[]mass,int number){
    for (int t=mass.length-1;t>0;t--){
        mass[t]=mass[t-1];
    }
        mass[0]=number;
    return mass;
}
    public static int[]addToArray(int[]mass,int number, int position){
    int[] newMass=mass;
    for (int t=mass.length-1;t>position;t--){
        newMass[t]=newMass[t-1];
    }
    newMass[position]=number;
    return newMass;
    }
}
