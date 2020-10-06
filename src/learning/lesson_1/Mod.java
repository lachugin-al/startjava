package learning.lesson_1;

public class Mod {
    public static void main(String[] args) {
        int i = 17; // Целые
        double d = 17.3; // С плавающей точкой

        System.out.println("i mod 10 = " + i % 10);
        System.out.println("d mod 10 = " + d % 10);

        /*
         * получим результат:
         * i mod 10 = 7
         * d mod 10 = 7.300000000000001
         */

        // Создаем и заполняем массивы
        int[] day = new int[] { 1, 2, 5 };
        int[] hour = new int[] { 1, 4, 9 };

        System.out.println("Вы играете уже " + day[0] + " " + declension(day[0], "Days") + " и " + hour[0] + " " + declension(hour[0], "Hour"));
        System.out.println("Вы играете уже " + day[1] + " " + declension(day[1], "Days") + " и " + hour[1] + " " + declension(hour[1], "Hour"));
        System.out.println("Вы играете уже " + day[2] + " " + declension(day[2], "Days") + " и " + hour[2] + " " + declension(hour[2], "Hour"));
    }

    public static String declension(int count, String type) {
        String one = "";
        String two = "";
        String five = "";

        if (type.equals("Days")) {
            one = "день";
            two = "дня";
            five = "дней";
        } else if (type.equals("Hour")) {
            one = "час";
            two = "часа";
            five = "часов";
        }

        if (count > 100) {
            count %= 100;
        }

        if (count > 20) {
            count %= 10;
        }

        switch (count) {
            case 1:
                return one;
            case 2:
                return two;
            case 3:
            case 4:
            default:
                return five;
        }
    }
}
