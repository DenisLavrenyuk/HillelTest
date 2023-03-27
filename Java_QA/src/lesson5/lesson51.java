package lesson5;

import java.util.Scanner;

public class lesson51 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter next number");
        int number=scanner.nextInt(), number2;
        char symbol;
        System.out.println("enter second number");
        number2=scanner.nextInt();
        System.out.println("enter symbol of operation");
        symbol=scanner.next().charAt(0);
        switch (symbol){
            case'+': CalcUtil.sum(number,number2);
            break;
            case'-': CalcUtil.sum(number,number2);
            break;
            default:
                System.out.println("Error");
                System.exit(0);
                break;
        }
        System.out.println("result");}
}
