package learning.lesson_4.game.guessnumber;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    // задаем параметры используемые в логике игры
    private int hiddenNumber;       // загадываемое число компьютером
    private Scanner scanInput = new Scanner(System.in); // сканнер
    private Player playerOne;       // ссылка на объект
    private Player playerTwo;       // ссылка на объект
    private int attemptNumber;      // число попыток
    private boolean isWin;          // выиграл или нет
    private boolean isValidNumber;  // проверка числа на правильность ввода
    private int checkingNumber;     // переменная для ввода числа для проверки

    public GuessNumber(Player playerOne, Player playerTwo) {    // конструктор класса GuessNumber и в него передаются объекты playerOne, playerTwo с именами
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startGuessNumberGame() {            // метод с запуском игры
        initStart();                                // метод с инициализацией игры
        while (attemptNumber <= 10 && !isWin) {     // цикл с условиями: 10 попыток или выигрыш
            enterPlayerNumber(playerOne);           // метод на ввод числа первым игроком
            compareNumbers(playerOne);              // сравнение введеннго числа с загаданным компьютером
            enterPlayerNumber(playerTwo);           // метод на ввод числа вторым игроком
            compareNumbers(playerTwo);              // сравнение введеннго числа с загаданным компьютером
            attemptNumber++;                        // счетчик попыток
        }
    }

    private void initStart() {                      // метод с инициализацией игры
        hiddenNumber = new Random().nextInt(100);   // компьютер загадывает число
        attemptNumber = 1;                          // устанавливается число попыток на значение 1 (можно с 0)
        isWin = false;                              // выиграл - false
    }

    private void enterPlayerNumber(Player player) { // метод с записьмю числа в массив чисел загаданных игроком
        int number = enterNumber(player);           // вводи числа
        player.setNumber(attemptNumber, number);    // запись числа в массив с ячейкой соответсвующей номеру попытки
    }

    private int enterNumber(Player player) {
        System.out.print("\n" + player.getName() +", Это ваша " + attemptNumber +
                " попытка, угадывайте число: ");
        do {
            checkingNumber = scanInput.nextInt();
            validNumber(player, checkingNumber);
        } while (!isValidNumber);
        return checkingNumber;
    }

    private void validNumber(Player player, int number) {      // проверка на ввод числа от 0 до 100
        if (number < 0 || number > 100) {
            System.out.println(player.getName() + ", вы ввели не корректное число.");
            System.out.print("Число должно быть от 0 до 100. \nПопробуйте снова!: ");
            isValidNumber = false;
        } else {
            isValidNumber = true;
        }
    }

    private void compareNumbers(Player player) {            // метод для сравнения введенного числа
        if (player.getNumber(attemptNumber) > hiddenNumber) {   // геттер вывода числа из массива, на вход получаем
                                                                // public int getNumber(1)
                                                                // return numbers[1 - 1] - выводт число из 0 ячейки
            System.out.println("Введенное число больше, чем загадал компьютер.");
        } else if (player.getNumber(attemptNumber) < hiddenNumber) {
            System.out.println("Введенное число меньше, чем загадал компьютер.");
        } else {
            System.out.println("\n!!!!!!!!!!!!!!!!\nПоздравляем, " +
                    player.getName() + "! Вы победитель!\n" +
                    "Загаданное число " + player.getNumber(attemptNumber) + ".\n" +
                    "!!!!!!!!!!!!!!!!\nВы угадали с " + attemptNumber + " попытки");
            isWin = true;
            finishGame(player);         // метод с окончание игры и выводом результатов
        }
        if (attemptNumber == 10) {
            System.out.print("\nУ игрока " + player.getName() + " закончились попытки!");
            finishGame(player);
        }
    }

    private void finishGame(Player player) {
        printAllAttempts(player);       // метод с выводом всех попыток через класс Arrays.toString
        setInitialConditions(player);   // обнуление результатов
    }

    private void printAllAttempts(Player player) {
        int[] numbers = player.getNumbers(attemptNumber);       // передаем в массив чисел игрока с кол-вом попыток по счетчику через конструтор
                                                                // public int[] getNumbers(int attemptNumber)
                                                                // return Arrays.copyOf(numbers, attemptNumber);
        System.out.println("\n" + player.getName() + " вводил следующие числа: " );
        System.out.println(Arrays.toString(numbers));           // выводи массив в строку
    }

    private void setInitialConditions(Player player) {          // сбрасываем значения массива до 0
                                                                // Arrays.fill(numbers, 0, attemptNumber - 1, 0);
        player.setInitialConditions(attemptNumber);
    }
}