package practice.guessnumber;

import java.util.Scanner;

public class GuessGame {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Player[] players = setPlayerNames();
        Controller controller = new Controller(players[0], players[1]);
        do {
            controller.play();
            controller.yesOrNo();
        } while (true);
    }

    // задаем имена игроков через консоль
    private static Player[] setPlayerNames() {
        System.out.print("Please input player1 and player2 names separated space: ");
        return (new Player[]{new Player(scanner.next()), new Player(scanner.next())});
    }

}
