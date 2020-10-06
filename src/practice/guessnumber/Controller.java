package practice.guessnumber;

import java.util.Arrays;
import java.util.Scanner;

public class Controller {

    private static final int MAX_ATTEMPS = 10;
    private final Player player1;
    private final Player player2;
    private int randomNumber;

    Scanner scanner = new Scanner(System.in);

    // создаем контроллер для 2х игроков и передаем в параеметры имена
    public Controller(final Player player1, final Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        int attemps = 0;
        int[] arrayNumbersForPlayer1 = setArray(player1);
        int[] arrayNumbersForPlayer2 = setArray(player2);
        System.out.println("Computer set random number from 0 to 100");
        setRandomNumber();
        while (attemps < MAX_ATTEMPS) {
            inputNumber(player1);
            inputNumber(player2);
            arrayNumbersForPlayer1[attemps] = player1.getNumber();
            arrayNumbersForPlayer2[attemps] = player2.getNumber();
            player1.setArrayNumbers(arrayNumbersForPlayer1);
            player2.setArrayNumbers(arrayNumbersForPlayer2);
            int inputNumberPlayer1 = checkNumber(player1, attemps);
            int inputNumberPlayer2 = checkNumber(player2, attemps);
            if (attemps == 9) {
                System.out.println("No more attemps\n"
                        + player1.getName() + " have array " + Arrays.toString(player1.getArrayNumbers()) + "\n"
                        + player2.getName() + " have array " + Arrays.toString(player1.getArrayNumbers()));
                yesOrNo();
                attemps = 0;
            }
            // увеличиваем количество попыток на 1
            attemps++;
            // добавляем условия окончания игры
            if (inputNumberPlayer1 == randomNumber && inputNumberPlayer2 == randomNumber) {
                break;
            } else if (inputNumberPlayer1 == randomNumber || inputNumberPlayer2 == randomNumber) {
                break;
            }
        }
    }

    public void yesOrNo() {
        while (true) {
            System.out.println("Do you want play again (Y or N)?: ");
            String yesOrNo = scanner.next().trim();
            if (yesOrNo.equals("y")) {
                break;
            }
            if (yesOrNo.equals("n")) {
                System.exit(0);
            }
        }
    }

    private int[] setArray(final Player player) {
        int[] arrayNumberForPlayer = new int[MAX_ATTEMPS];
        for (int i = 0; i < MAX_ATTEMPS; i++) {
            arrayNumberForPlayer[i] = 0;
        }
        return arrayNumberForPlayer;
    }

    // компьютер загадывает число
    private int setRandomNumber() {
        return (randomNumber = (int) + (Math.random() * 100));
    }

    // запрашиваем число у игрока
    private void inputNumber(final Player player) {
        System.out.printf("Player %s please input your number: ", player.getName());
        player.setNumber(scanner.nextInt());    // задаем число для игрока
    }

    // int
    private int checkNumber(final Player player, int attemps) {
        int number = player.getNumber();
        String name = player.getName();
        if (number == randomNumber) {
            System.out.printf("Congratulations!!! Player %s winner in %s attemps! ", name, attemps + 1);
            // выводим массив чисел методом копирования массия длинной attemps
            System.out.println("Winner numbers: "
                    + Arrays.toString(Arrays.copyOf(player.getArrayNumbers(), attemps + 1)));
        } else if (number > randomNumber) {
            System.out.printf("Player %s input to big number\n", name);
        } else {
            System.out.printf("Player %s input to small number\n", name);
        }
        return number;
    }

}
