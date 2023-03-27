import java.util.Random;

public class homework3 {
    public static void main(String[] args) {
        int m = 20;
        int sum = 0;
        int p;
        int[] mass = new int[m];
        Random rand = new Random();
        for (int t = 0; t < mass.length; t++) {
            mass[t] = rand.nextInt(50);
        }
        System.out.println("length mass = " + mass.length);
        System.out.print("Array: ");
        for (int t = 0; t < mass.length; t++) {
            System.out.print(mass[t] + " ");
        }
        for (int t = 0; t < mass.length; t++) {
            if (mass[t] > 5 && mass[t] < 45) {
                sum=mass[t] + sum;
            }
        }
        System.out.println("");
        System.out.println("Summa = " + sum);
        System.out.print("Even and positive: ");
        for (int t = 0; t < mass.length; t++) {
            p=mass[t] % 2;
            if (p == 0 &&  mass[t] > 0 ) {
                System.out.print(mass[t] + " ");
            }
        }
    }
}
