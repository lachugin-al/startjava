package learning.lesson_2.GuessNumber;

import java.util.Scanner;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    private int randomNumber;

    // Ссылаемся на объекты
    private Player player1;
    private Player player2;

    // Создаем объект класс GuessNumber через конструктор использую 2 объекта player1 и player2
    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    // логика игры
    public void startGame() {
        randomNumber = (int) + (Math.random() * 101);
        do {
            System.out.print(player1.getName() + " введите свое число: ");
            player1.setNumber(scanner.nextInt());

            if (player1.getNumber() == randomNumber) {
                System.out.println("Вы угадали!");
                break;
            } else if (player1.getNumber() < randomNumber) {
                System.out.println("Ваше число маленькое");
            } else {
                System.out.println("Ваше число большое");
            }

            System.out.print(player2.getName() + " введите свое число: ");
            player2.setNumber(scanner.nextInt());

            if (player2.getNumber() == randomNumber) {
                System.out.println("Вы угадали!");
                break;
            } else if (player2.getNumber() < randomNumber) {
                System.out.println("Ваше число маленькое");
            } else {
                System.out.println("Ваше число большое");
            }
        } while (player1.getNumber() != randomNumber || player2.getNumber() != randomNumber);
    }
}