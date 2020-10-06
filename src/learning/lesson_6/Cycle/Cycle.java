package learning.lesson_6.Cycle;

public class Cycle {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i+=2) {                 // Инкремента +2
            numbers[i] = i + 1;                         // присваиваем каждому элементу в цикле значение i + 1
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}