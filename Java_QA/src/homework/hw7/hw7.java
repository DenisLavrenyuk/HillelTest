package homework.hw7;

import java.util.Arrays;

public class hw7 {
    public static void main(String[] args) {
        int[] massive = new int[]{1, 2, 3, 4, 5};
        System.out.println("Initial Array: " + Arrays.toString(massive));

        int number = 100, position = 2;
        System.out.println("Number: "+number+" Position: "+position+"\n");

      addToArray(new int[]{1, 2, 3, 4, 5}, number);
      addToArray(new int[]{1, 2, 3, 4, 5}, number, position);
    }
    public static void addToArray(int[]massive,int number) {
            for (int t = massive.length - 1; t > 0; t--) {
                massive[t] = massive[t - 1];
            }
            massive[0] = number;
            System.out.println("Default Array: " + Arrays.toString(massive));
        }
    public static void addToArray(int[]massive,int number, int position){
        if (position>=0 && position<massive.length) {
            for (int t = massive.length - 1; t > position; t--) {
                massive[t] = massive[t - 1];
            }
            massive[position] = number;
            System.out.println("Positioned Array: " + Arrays.toString(massive));
        }
        else System.out.println("Error: position is out of array");
    }
}

