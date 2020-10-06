package learning.lesson_6.Arrays.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integers = { 5, 2, 1, 4, 3, 9, 6, 8, 7, 10 };

        // Searching a value from array of integer
        int index = Arrays.binarySearch(integers, 2);
        if (index >= 0) {
            System.out.println("Элемент найден по индексу :" + index);
        } else {
            System.out.println("Элемент не найден");
        }

        // Searching a value from array of integer with specific range
        int fromIndex = 2;
        int toIndex = 7;
        int index2 = Arrays.binarySearch(integers, fromIndex, toIndex, 9);
        if (index2 >= 0) {
            System.out.println("Element is found at the index :" + index2);
        } else {
            System.out.println("Element is not found");
        }
    }
}