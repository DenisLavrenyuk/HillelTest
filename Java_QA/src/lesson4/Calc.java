
    package lesson4;

    public class Calc {
        public static void main(String[] args) {//start main method
            int n1 = 3, n2 = 2;

            char symbol = '8';
            if (symbol == '+') {
                System.out.println(n1 + n2);
            }
            if (symbol == '*') {
                System.out.println(n1 * n2);
            }
            if (symbol == '/') {
                if (n2 != 0) {
                    System.out.println(n1 / n2);
                } else {
                    System.out.println("ERROR / by zero");
                }
            }
            double result = 0;

            switch (symbol) {
                case '-':
                    result = n1 - n2;
                    break;
                case '+':
                    result = n1 + n2;
                    break;
                case '/':
                    result = n2 == 0 ? 0 : (double) n1 / n2;
                    break;
                default:
                    System.out.println("not find symbol");
            }

            System.out.println(result);
        }// end main method

    }

