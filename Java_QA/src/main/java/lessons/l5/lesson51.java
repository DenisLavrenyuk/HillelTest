package lessons.l5;

import java.util.Scanner;

public class lesson51 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number");
        int number=scanner.nextInt();
        double number2;
        double result = 0;
        char simbol;
        System.out.println("enter second number");
        number2=scanner.nextDouble();
        System.out.println("enter symbol of operation");
        simbol=scanner.next().charAt(0);
        switch (simbol){
            case '+': result=CalcUtil.sum(number,number2);
                break;
            case '-':result=CalcUtil.sub(number,number2);
                break;
            default:
                System.out.println("Error");
                System.exit(0);
                break;
        }
        System.out.println(result);
    }


}