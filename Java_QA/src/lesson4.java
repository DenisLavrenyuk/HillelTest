import java.util.Arrays;
import java.util.Random;

public class lesson4 {
    public static void main(String[] args) {
        int m = 50;
        int[] mass = new int[m];
        Random rand = new Random();
        for (int t = 0; t < mass.length; t++) {
            mass[t] = rand.nextInt(50);
        }
        // System.out.println(mass[3]);
        System.out.println("length mass=" + mass.length);
        for (int t = 0; t < mass.length; t++) {
            System.out.print(mass[t] + " ");
        }
        System.out.println(' ');


        for (int t : mass) {
            System.out.print(t + " ");
            if (t == 4) {
                System.out.println("break");
                break;
            }
        }
        System.out.println(Arrays.toString(mass));
        int[] mas = new int[]{1, 2, 3, 4, 5, 6};
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
                , {7, 8, 9}
        };
        System.out.println(matrix[1][2]);
        System.out.println(matrix.length);
        for (int t = 0; t < matrix.length; t++) {
            System.out.println("");
            for (int n = 0; n < matrix[t].length; n++) {
                System.out.println(matrix[t][n]);
            }
        }
        int r = 0;
        while (r < 10) {
            System.out.println("r=" + r);
            r++;
            if (r == 5) break;}
            r=0;
            do {
                System.out.println("R=" + r);
                r++;
            } while (r<10);
        }
    }


