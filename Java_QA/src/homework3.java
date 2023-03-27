import java.util.Random;

public class homework3 {
    public static void main(String[] args) {
        int m = 20;
        int sum = 0;
        int p=0;
        int[] mass = new int[m];
        Random rand = new Random();
        for (int t = 0; t < mass.length; t++) {
            mass[t] = rand.nextInt(50);
        }
        System.out.println("length mass=" + mass.length);
        System.out.print("Array: ");
        for (int t = 0; t < mass.length; t++) {
            System.out.print(mass[t] + " ");
        }
        for (int k = 0; k < mass.length; k++) {
            if (mass[k] > 5 && mass[k] < 45) {
                sum=mass[k] + sum;
            }
        }
        System.out.println("");
        System.out.println("Summa= " + sum);
        System.out.print("Even and positive: ");
        for (int h = 0; h < mass.length; h++) {
            p=mass[h] % 2;
            if (p == 0 &&  mass[h] > 0 ) {
                System.out.print(mass[h] + " ");
            }
        }

    }
}
