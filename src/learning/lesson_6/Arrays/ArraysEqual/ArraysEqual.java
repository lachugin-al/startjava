package learning.lesson_6.Arrays.ArraysEqual;

import java.util.Arrays;

public class ArraysEqual {
    public static void main(String[] args) {

        // Сравнение двух массивов
        int[] a1 = { 1, 2, 3 };
        int[] a2 = { 1, 2, 3 };
        int[] a3 = { 3, 1, 1 };

        boolean equal = Arrays.equals(a1, a2);
        if (equal) {
            System.out.println("Arrays a1 and a2 are equal with Result : " + equal);
        } else {
            System.out.println("Arrays a1 and a2 are not equal with Result : " + equal);
        }
        equal = Arrays.equals(a1, a3);
        if (equal) {
            System.out.println("Arrays a1 and a2 are equal with Result : " + equal);
        } else {
            System.out.println("Arrays a1 and a2 are not equal with Result : " + equal);
        }
    }
}