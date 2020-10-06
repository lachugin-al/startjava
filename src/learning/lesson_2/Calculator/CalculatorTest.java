package learning.lesson_2.Calculator;

import java.util.Scanner; // импортируем сканнер

public class CalculatorTest {

    public static void main(String[] args) {

        // ввод в терминал
        Scanner scanner = new Scanner(System.in);     // создаем экземпляр класса Scanner
        Calculator input = new Calculator();          // создаем экземпляр класса Calculator

        String oneMoreTime;
        do {
            System.out.print("Введите первое число: ");
            input.setNumber1(scanner.nextInt());            // через сеттер присваиваем значение переменной number1
            System.out.print("Введите знак математической операции: ");
            input.setOperator(scanner.next().charAt(0));    // определяем и присваиваем через setOperator первый символ из строки, которую вводим на экран
            System.out.print("Введите второе число: ");
            input.setNumber2(scanner.nextInt());            // через сеттер присваиваем значение переменной number2
            //input.calc();                                 // запускаем метод calc
            System.out.println(input.calc());               // выводим на экран метод input.calc
            do {
                System.out.println("Хотите продолжить? [y/n]: ");
                oneMoreTime = scanner.next();               // присваиваем переменной oneMoreTime строковое значение
            } while (!oneMoreTime.equals("y") && !oneMoreTime.equals("n"));  // через цикл проверяем соответствие значения oneMoreTime = "да" или "нет"
        } while (oneMoreTime.equals("y"));                  // продолжаем цикл пока значение oneMoreTime = "да"
    }
}