package learning.lesson_2.GuessNumber2;

public class GuessNumberTest2 {

    public static void main(String[] args) {
        GuessNumber2 game = new GuessNumber2();
        System.out.println("Введите имя певрого игрока: ");
        game.player1 = new Player2(game.scan.next());
        System.out.println("Введите имя второго игрока: ");
        game.player2 = new Player2(game.scan.next());
        String oneMoreTime = "да";

        // запуск игры
        do {
            game.startGame();
            System.out.println("Хотите продолжить? [да/нет]: ");
            oneMoreTime = game.scan.next();

            // запрос на повторение игры
            while (!oneMoreTime.equals("да") && !oneMoreTime.equals("нет")) {
                System.out.println("Хотите продолжить? [да/нет]: ");
                oneMoreTime = game.scan.next();
            }
        } while (oneMoreTime.equals("да"));
    }
}