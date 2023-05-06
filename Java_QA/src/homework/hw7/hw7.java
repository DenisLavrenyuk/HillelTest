package homework.hw7;

import java.util.Arrays;

public class hw7 {
    public static void main(String[] args) {
        int[] massive = {1, 2, 3, 4, 5};
        System.out.println("Initial Array: " + Arrays.toString(massive));
        int number = 100, position = 2;
        System.out.println("Number: "+number+" Position: "+position+"\n");

        int[] massive1=addToArray(massive, number);
        System.out.println("Default Array: " + Arrays.toString(massive1));
        int[] massive2=addToArray(massive, number, position);
        System.out.println("Positioned Array: " + Arrays.toString(massive2));
    }
    public static int[] addToArray(int[]massive,int number) {
        int[] newMassive=new int[massive.length+1];
        newMassive[0] = number;
        for (int t = 1; t <= massive.length; t++) {
            newMassive[t] = massive[t - 1];
        }
            return newMassive;
        }
    public static int[] addToArray(int[]massive,int number, int position){
        int[] newMassive=new int[massive.length+1];
        if (position>=0 && position<massive.length) {
            for (int t = 0; t < position; t++) {
                newMassive[t] = massive[t];
            }
            newMassive[position] = number;
            for (int t = position + 1; t <= massive.length; t++) {
                newMassive[t] = massive[t - 1];
            }
            return newMassive;
        }
        else System.out.println("Error: position is out of array");
        return null;
    }
}

