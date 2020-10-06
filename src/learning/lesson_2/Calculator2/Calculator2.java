package learning.lesson_2.Calculator2;

public class Calculator2 {

    // переменные класса
    private int number1;
    private int number2;
    private char operator;

    // создание геттеров/сеттеров для переменных класса
    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    //    геттеры не нужны, так как вне класса эти значение мы не запрашиваем
    //    public int getNumber1() {
    //        return number1;
    //    }
    //
    //    public int getNumber2() {
    //        return number2;
    //    }
    //
    //    public char getOperator() {
    //        return operator;
    //    }

    // метод калькулятора
    public int calc() {
        switch (operator) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                return number1 / number2;
            case '^':
                pow();
            case '%':
                return number1 % number2;
            default:
                System.out.println("Unknown math operator");
        }
        return 0;
    }

    // метод для возведения в квадрат. private (а не public) так как это служебный метод и из вне он не используется
    private void pow() {
        int degree = 1;
        for (int i = 1; i <= number2; i++) {
            degree *= number1;
        }
        System.out.println(degree);
    }
}
