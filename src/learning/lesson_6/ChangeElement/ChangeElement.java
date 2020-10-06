package learning.lesson_6.ChangeElement;/*
 * Заменить каждый элемент массива с нечетным индексом на ноль
 * 1. Создайте массив из 8 случайных целых чисел из отрезка [1;10]
 * 2. Выведите массив на экран в строку
 * 3. Замените каждый элемент с нечётным индексом на ноль
 * 4. Снова выведете массив на экран на отдельной строке
 */

import java.util.Arrays;

public class ChangeElement {
    public static void main(String[] args) {
        int[] mas = new int[8];

        // полняем массив случайными числами
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random() * 10) + 1;
        }

        // выводим массив в стоку
        /*for(int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }*/

        // выводим массив в стоку
        System.out.println(Arrays.toString(mas));

         /*
         После этого заменяем каждый элемент с нечетным индексом на 0.
         Если индекс не делится без остатка на 2 (то есть, если он нечетный),
         то обнулить элемент под этим индексом
         */
        for (int i = 0; i < mas.length; i++) {
            if (i%2 == 1) {
                mas[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}