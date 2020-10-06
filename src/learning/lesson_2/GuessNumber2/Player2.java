package learning.lesson_2.GuessNumber2;

public class Player2 {

    // описываем класс Player
    private String name;
    private int number;

    public Player2(String name) {           // �������� setter name, ��� ��� �������� �������� ����� �����������
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}