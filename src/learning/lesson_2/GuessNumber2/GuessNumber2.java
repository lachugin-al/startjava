package learning.lesson_2.GuessNumber2;

import java.util.Scanner;

public class GuessNumber2 {
    public int randomNumber;
    Scanner scan = new Scanner(System.in);
    Player2 player1;
    Player2 player2;

    // метод логики игры
    public void startGame() {

        // компьютер загадывает случайное число
        randomNumber = (int) (Math.random() * 100);

        // запрос чисел от игроков
        System.out.println(player1.getName() + " вводите Ваше число: ");
        player1.setNumber(scan.nextInt());
        System.out.println(player2.getName() + " вводите Ваше число: ");
        player2.setNumber(scan.nextInt());

        while (true) {
            if (player1.getNumber() == randomNumber) {
                System.out.println(player1.getName() + " Выиграл");
                break;
            } else if (player2.getNumber() == randomNumber) {
                System.out.println(player2.getName() + " Выиграл");
                break;
            }

            if (player1.getNumber() < randomNumber) {
                System.out.println(player1.getName() + " ввел маленькое число, введите другое: ");
            } else if (player1.getNumber() > randomNumber) {
                System.out.println(player1.getName() + " ввел большое число, введите другое: ");
            }
            player1.setNumber(scan.nextInt());

            if (player2.getNumber() < randomNumber) {
                System.out.println(player2.getName() + " ввел маленькое число, введите другое: ");
            } else if (player2.getNumber() > randomNumber) {
                System.out.println(player2.getName() + " ввел большое число, введите другое: ");
            }
            player2.setNumber(scan.nextInt());
        }
    }
}