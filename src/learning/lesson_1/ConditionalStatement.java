package learning.lesson_1;

public class ConditionalStatement {
    public static void main(String[] args) {

        // целое число
        int age = 39;
        if (age > 20 ) {
            System.out.println("Вы старше 20 лет");
        }

        // логическое выражение
        boolean isMale = true;
        if (isMale) {   // если isMail = true
            System.out.println("Мужчина");
        } else {
            System.out.println("Женщина");
        }

        if (!isMale) {
            System.out.println("Точно женщина");
        }

        // число с плавающей точкой
        double height = 1.82;
        if (height < 1.80) {
            System.out.println("Ваш рост меньше 180 см.");
        } else {
            System.out.println("Ваш рост больше 180 см.");
        }

        // символ
        char firstCharName = 'A';
        if (firstCharName == 'A') {
            System.out.println("A");
        } else if (firstCharName == 'B') {
            System.out.println("B");
        } else {
            System.out.println("Not A and Not B");
        }
    }
}
