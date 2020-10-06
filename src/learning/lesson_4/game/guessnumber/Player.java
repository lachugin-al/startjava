package learning.lesson_4.game.guessnumber;

import java.util.Arrays;

public class Player {

    // создаем переменные класса Player
    private String name;                        // имя игрока
    private int[] numbers = new int[10];        // массив чисел вводимых игроком

    public Player(String name) {
        this.name = name;
    }   // конструктор для создания класса с именем игрока

    public String getName() {
        return name;
    }

    public void setNumber(int attemptNumber, int number) {
        this.numbers[attemptNumber - 1] = number;
    }   // сеттер для записи номера попытки и введенного номера в массив чисел вводимых игроком

    public int getNumber(int attemptNumber) {
        return numbers[attemptNumber - 1];
    }

    public int[] getNumbers(int attemptNumber) {
        return Arrays.copyOf(numbers, attemptNumber);
    }   // получение информации из массива путем копирования

    public void setInitialConditions(int attemptNumber) {
        Arrays.fill(numbers, 0, attemptNumber - 1, 0);
    }   // заполняет массив переданным значением (удобно использовать, если нам необходимо значение по умолчанию для массива)
}