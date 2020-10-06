package learning.lesson_6.Arrays.ArraysNestedArray;

import java.util.Arrays;

public class ArraysNestedArray {
    public static void main(String[] args) {

        // Compare two nested arrays of type integer which are equal
        int[] a1 = { 1, 2, 3 };
        int[] a2 = { 1, 2, 3 };
        Object[] b1 = {a1};
        Object[] b2 = {a2};
        boolean equal = Arrays.equals(b1, b2);
        if (equal) {
            System.out.println("Arrays b1 and b2 are equal with Result : " + equal);
        } else {
            System.out.println("Arrays b1 and b2 are not equal with Result : " + equal);
        }

        // Compare two nested arrays of type integer which are equal with deepEquals
        equal = Arrays.deepEquals(b1, b2);
        if (equal) {
            System.out.println("Arrays b1 and b2 are equal with Result : " + equal);
        } else {
            System.out.println("Arrays b1 and b2 are not equal with Result : " + equal);
        }

        int[] a3 = Arrays.copyOf(a1, a1.length); // �������� ������ a1 ������ ������ a1.lenght
        int[] a4 = Arrays.copyOf(a1, 10);        // �������� ������ a1 ������ ������ 10
        System.out.println(Arrays.toString(a3));
        System.out.println(Arrays.toString(a4));
    }
}