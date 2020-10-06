package learning.lesson_3.game;

public class Player {

    // описываем класс PLayer
    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public Player(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}