package learning.lesson_6.Test;/*
 * ��� �������� �������� ������� � �������� ������� � Java
 * �������� ���������, ������� ������ ������� �������� ����������� ������� �� String � �������� �������.
 * �� ����������� �������������� ������ ��� �������� �����������.
 */

public class Test {
    public static void main(String[] args) {
        String[] phrase = {"������ "," ������� "," ������ "," ����� "," ��� "," ����� "," ����� "};

        // ����������� ���������� ������ �������
        int reverse = phrase.length;
        System.out.println(reverse);

        //������� ����������� ������ � �������
        for (int i = 0; i < reverse; i++) {
            System.out.println(phrase[i]);
        }

        // ������ ��������� ���������� ��� ������ ��������� � �������
        String temp;

        // ������ �������� ������� �������
        for (int i = 0; i < reverse/2; i++) {   // reverse/2 ���������� �������� �������
            temp = phrase[reverse-i-1];
            phrase[reverse-i-1] = phrase[i];
            phrase[i] = temp;
        }

        /*
         * 3-0-1 = temp[6] - �����
         * ����� <-- ������
         * ������ <-- �����
         *
         * 3-1-1 = temp[5] - �������
         * ������� <-- �����
         * ����� <-- �������
         *
         * ...
         */

        for (int i = 0; i < reverse; i++) {
            System.out.println(phrase[i]);
        }
    }
}