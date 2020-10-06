package learning.lesson_2.Calculator2;

import java.util.Scanner; // импортируем сканнер

public class CalculatorTest2 {

    public static void main(String[] args) {

        // ввод в терминал
        Scanner scanner = new Scanner(System.in);
        Calculator2 input = new Calculator2();

        String oneMoreTime;
        do {
            System.out.print("input 1: ");
            int number1 = scanner.nextInt();
            input.setNumber1(number1);

            System.out.print("math operator: ");
            String text = scanner.next();           // присваиваем text переменной значение введенное с терминала
            char operator = text.charAt(0);         // присваиваем operator переменной значение первого символа переменной text
            input.setOperator(operator);            // передаем значение переменной в переменную operator объекта input класса Calculator

            System.out.print("number 2: ");
            int number2 = scanner.nextInt();
            input.setNumber2(number2);

            System.out.println(input.calc());
            do {
                System.out.println("One more? [y/n]: ");
                oneMoreTime = scanner.next();
            } while (!oneMoreTime.equals("y") && !oneMoreTime.equals("n"));
        } while (oneMoreTime.equals("y"));
    }
}