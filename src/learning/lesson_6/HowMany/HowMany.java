package learning.lesson_6.HowMany;/*
 * �������� ��������� HowMany.java, ������� ���������, ������� ���� �� ����� � �������.
 */

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ������ ����������� ����� �������
        System.out.print("������� � ������� ����������� ����� ������: ");
        String input = scanner.nextLine();
        int count = 0;  // ��������� ���-�� ���� = 0

        // ���� ������ ������ ���� �����, ����� �������, ���� ���� ���������
        if (input.length() != 0){            // ���� ������� ������ �� ����� 0
            count++;                        // ��� ��� ������ != 0 , �� � ��� ���� ��� ������� 1 �����

            //��������� ������ ������, �� ������ �� ���
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' '){
                    count++;                // ���� ������ ������ ������ - ����������� ���������� ���� �� 1
                }
            }
        }
        System.out.println("���������� ����: " + count);
    }
}