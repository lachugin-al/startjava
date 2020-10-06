package learning.lesson_6.Arrays.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        // создаем массив
        int[] mas = {1, 10, 23, 3, 15};

        // устанавливаем изначально значение - что массив не отсортирован и добавлем временную переменную
        boolean isSorted = false;
        int temp;

        // цикл пока массив не отсортирован
        while (!isSorted) {
            for (int i = 0; i < mas.length - 1; i++) {       // сортируем массив до конца -1
                if (mas[i] > mas[i + 1]) {                   // если два соседних числа отсортированы то не меняем местами
                    isSorted = false;
                    temp = mas[i];
                    mas[i]= mas[i + 1];
                    mas[i + 1] = temp;
                } else {
                    isSorted = true;                        // после если не меняем местами то выставляем true
                }
            }
        }
        System.out.println(Arrays.toString(mas));           // выводим массив в строку в консоль
    }
}