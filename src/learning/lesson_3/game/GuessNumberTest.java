package learning.lesson_3.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {

        // создаем 2 игрока через конструктор
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя игрока №1: ");
        Player player1 = new Player(scanner.next());
        //player1.name = scanner.next();
        //player1.number = scanner.nextInt();
        System.out.print("Введите имя игрока №2: ");
        Player player2 = new Player(scanner.next());

        // запуск игры
        GuessNumber game = new GuessNumber(player1, player2);

        String oneMoreTime;
        do {
            game.startGame();
                do {
                    System.out.println("Хотите продолжить? [да/нет]: ");
                    oneMoreTime = scanner.next();
                } while (!oneMoreTime.equals("да") && !oneMoreTime.equals("нет"));
        } while (!oneMoreTime.equals("нет"));
    }
}