import java.util.Random;

public class homework1 {
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
        for (int t = 0; t < mass.length; t++) {
            System.out.print(mass[t] + " ");
        }
        for (int k = 0; k < mass.length; k++) {
            if (mass[k] > 5 && mass[k] < 45) {
                sum=mass[k] + sum;
            }
        }
        System.out.println("");
        System.out.println(sum);
        System.out.println("");
        for (int h = 0; h < mass.length; h++) {
            p=mass[h] % 2;
            if (p == 0 &&  mass[h] > 0 ) {
                System.out.println(mass[h]);
            }
        }

    }
}
