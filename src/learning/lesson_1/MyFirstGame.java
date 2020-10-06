package learning.lesson_1;

public class MyFirstGame {
    public static void main(String[] args) {
        int rndNum = 50;
        System.out.print("Угадай число: ");
        int guessNum = 60;

        while (guessNum != rndNum) {
            if (guessNum < rndNum) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                guessNum ++;
            } else if (guessNum > rndNum) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                guessNum --;
            }
        }
        System.out.println("Вы угадали!" + guessNum);
    }
}
