package learning.lesson_3.calculator;

import java.util.Scanner; // импортируем сканнер

public class CalculatorTest {

    public static void main(String[] args) {

        // ввод в терминал
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String oneMoreTime;
        do {
            System.out.print("Введите первое число: ");
            calculator.setNumber1(scanner.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setOperator(scanner.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setNumber2(scanner.nextInt());
            System.out.println(calculator.calc());
            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                oneMoreTime = scanner.next();
            } while (!oneMoreTime.equals("да") && !oneMoreTime.equals("нет"));
        } while (oneMoreTime.equals("да"));
    }
}