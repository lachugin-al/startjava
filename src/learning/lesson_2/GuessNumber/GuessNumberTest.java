package learning.lesson_2.GuessNumber;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {

        // создаем 2 игрока через конструктор
        Scanner scanner = new Scanner(System.in);       // подключаем класс Scanner
        System.out.print("Введите имя игрока №1: ");
        //Player player1 = new Player(scanner.next());  // создаем объект класса Player через конструктор
        Player player1 = new Player();                  // создаем объект класса Player
        player1.setName(scanner.next());                // присваиваем значение переменной в новом созданном классе через Setter
        System.out.print("Введите имя игрока №2: ");
        Player player2 = new Player(scanner.next());    // создаем объект класса Player через конструктор

        // запуск игры
        GuessNumber game = new GuessNumber(player1, player2);

        String oneMoreTime;
        do {
            game.startGame();
                do {
                    System.out.println("Хотите продолжить? [да/нет]: ");
                    oneMoreTime = scanner.next();
                } while(!oneMoreTime.equals("да") && !oneMoreTime.equals("нет"));
        } while (!oneMoreTime.equals("нет"));
    }
}