package learning.lesson_6.Arrays.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Массив char
        char[] chars = {'B', 'D', 'C', 'A', 'E'};
        Arrays.sort(chars);
        System.out.print("Сортировка: ");
        for(char character : chars) {
            System.out.print(character);
        }

        // вывод массива в терминал
        System.out.println();
        for(int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }

        // массив int
        int[] ints = new int[3];
        System.out.print("\nВведите 3 значения в массив: ");
        for(int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }
        for(int integer : ints) {
            System.out.print(integer);
        }
        Arrays.sort(ints);
        System.out.print("\nСортировка: ");
        System.out.print(Arrays.toString(ints));

        // сортировка массива int по индексу from - to
        int[] integers = {8, 2, 4, 5, 3, 7, 1, 10, 6, 9};
        int fromIndex = 2;
        int toIndex = 7;
        Arrays.sort(integers, fromIndex, toIndex);
        System.out.print("\nСортировка: ");
        for(int i = 0; i < integers.length; i++) {
            System.out.print(integers[i] + " ");
        }
    }
}