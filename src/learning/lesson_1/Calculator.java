package learning.lesson_1;

public class Calculator {
    public static void main(String[] args) {
        System.out.print("Введите число: \n");
        int number1 = 5;
        System.out.print("Что хотите сделать? \n");
        char operator = '^';
        System.out.print("Введите второе число: \n");
        int number2 = 3;

        if (operator == '+') {
            System.out.println(number1 + number2);
        } else if (operator == '-') {
            System.out.println(number1 - number2);
        } else if (operator == '*') {
            System.out.println(number1 * number2);
        } else if (operator == '/') {
            System.out.println(number1 / number2);
        } else if (operator == '^') {
            if (number2 == 0) {
                System.out.println(1);
            }
            int degree = 1;
            for (int i = 1; i <= number2; i++) {
                degree *= number1;  // либо degree = degree * number1;
            }
            System.out.println(degree);
        } else if (operator == '%') {
            System.out.println(number1 % number2);
        }
    }
}
