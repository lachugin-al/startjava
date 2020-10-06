package learning.lesson_1;

public class Cycle {
    public static void main(String[] args) {

        // Цикл от 0 до 20
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // цикл от counter  = 6 до counter = -6
        int counter = 6;
        while (counter >= -6) {
            System.out.print(counter + " ");
            counter -= 2;   // аналогично counter = counter - 2;
        }
        System.out.println();

        // сумма четных чисел number = 10 до 20 используя цикл while
        int numberStart = 10;
        int sumOdds = 0;
        int numberFinish = 20;
        do {
            if (numberStart % 2 != 0) {     // остаток от деления 2 != 0, 11/2, 12/2 далее 6/2/2 = 1, 13/2 до 20/2 = 0
                sumOdds += numberStart;     // пока numberStart != 20
            }
            numberStart++;
        } while (numberStart <= numberFinish);
        System.out.println(sumOdds + " - сумма всех четных чисел с 10 до 20");
    }
}
