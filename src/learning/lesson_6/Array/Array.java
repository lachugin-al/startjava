package learning.lesson_6.Array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длинну массива: ");
        int maxLength = scanner.nextInt();
        int[] numbers = new int[maxLength];

        System.out.print("Привет: ");

        // заполнение массива данными
        for(int i = 0; i < numbers.length; i++) {   // можем использовать вместо number.lenght условие i < maxLength
            numbers[i] = scanner.nextInt();         // заполняем массив значениями
        }

        // поиск максимального значения в массиве
        int max = numbers[0]; // устанавливаем max = 0

        for(int i = 0; i < numbers.length - 1; i++) {
            if(max < numbers[i + 1]) {
                max = numbers[i + 1];
            }
        }
        System.out.println("Максимальное значение = " + max);
    }
}
