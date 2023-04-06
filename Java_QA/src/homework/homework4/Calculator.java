package homework.homework4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        double number1 = scanner.nextInt();
        double number2;
        double result = 0;
        char symbol;
        System.out.println("enter second number");
        number2 = scanner.nextInt();
        System.out.println("enter symbol of operation");
        symbol = scanner.next().charAt(0);
        switch (symbol) {
            case '+':
                result = CalcUtils.add(number1, number2);
                System.out.println(result);
                break;
            case '-':
                result = CalcUtils.sub(number1, number2);
                System.out.println(result);
                break;
            case '*':
                result = CalcUtils.mult(number1, number2);
                System.out.println(result);
                break;
            case '/':
                if (number2!=0){
                result = CalcUtils.div(number1, number2);
                    System.out.println(result);
                }
                else {
                    System.out.println("ERROR / by zero");
                }
                break;
            case '%':
                if (number2!=0) {
                    result = CalcUtils.per(number1, number2);
                    System.out.printf("%.2f", result);
                    System.out.println(" %");
                }
                else {
                    System.out.println("ERROR / by zero");
                }
                break;
            default:
                System.out.println("ERROR / wrong command");
                System.exit(0);
                break;
        }
    }
}
