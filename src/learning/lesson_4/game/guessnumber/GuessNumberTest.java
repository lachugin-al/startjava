package learning.lesson_4.game.guessnumber;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        System.out.print("\nДобро пожаловать в игру \"Угадай число\" !\n" +
                "В игре учавствуют два игрока.\n\n" +
                "ВНИМАНИЕ!\n" +
                "У Вас есть 10 попыток, чтобы угадать число!\n\n" +
                "Введите имя первого игрока: ");
        Player playerOne = new Player(scanInput.next());    // создаем объект playerOne и передаем значение имени через конструктор
        System.out.print("Привет, " + playerOne.getName() + "!\n");
        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player(scanInput.next());    // создаем объект playerTwo и передаем значение имени через конструктор
        System.out.println("Привет, " + playerTwo.getName() + "!");
        GuessNumber gameForTwo = new GuessNumber(playerOne, playerTwo); // создаем объект класса GuessNumber через конструктор и передаем ему значения ранее созданных объектов игроков

        String userChoice;  // задаем переменную с выбором продолжения игры, после ее окончания
        do {
            gameForTwo.startGuessNumberGame();  // вызываем метод объекта gameForTwo о начале игры
            do {                                // цикл с проверкой продолжать игру или нет
                System.out.print("\nХотите придолжить? (да/нет): ");
                userChoice = scanInput.next();
            } while (!userChoice.equals("да") && !userChoice.equals("нет"));
        } while (userChoice.equals("да"));
    }
}