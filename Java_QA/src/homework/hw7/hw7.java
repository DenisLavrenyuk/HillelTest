package homework.hw7;

import java.util.Arrays;
import java.util.Scanner;

import static homework.hw7.arrayMethods.addToArray;

public class hw7 {
    public static void main(String[] args) {
        int[] mass = new int[]{1, 2, 3, 4, 5};
        System.out.println("Array: "+Arrays.toString(mass));
        int number=100, position=1;
//        arrayMethods.addToArray(mass, number);
//        arrayMethods.addToArray(mass, number, position);
        System.out.println("Array: "+Arrays.toString(addToArray(mass,number)));
        System.out.println("Array: "+Arrays.toString(addToArray(mass,number,position)));
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter array element");
//        if (scanner.hasNextInt()) {
//            number = scanner.nextInt();
//        }
//        else {System.out.println("ERROR: wrong command");
//            System.exit(0);
//        }
//        System.out.println("enter position");
//        if (scanner.hasNextInt()) {
//            position = scanner.nextInt();
//        }
//        else {System.out.println("ERROR: wrong command");
//            System.exit(0);
//        }

    }
}
