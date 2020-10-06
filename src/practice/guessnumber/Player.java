package practice.guessnumber;

public class Player {

    private final String name;
    private int number;
    private int[] arrayNumbers;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(final int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    // сохраняем введенные числа игроком в массив
    public void setArrayNumbers(int[] arrayNumbers) {
        this.arrayNumbers = arrayNumbers;
    }

    public int[] getArrayNumbers() {
        return arrayNumbers;
    }

}
