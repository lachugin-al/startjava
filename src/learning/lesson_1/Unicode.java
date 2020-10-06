package learning.lesson_1;

public class Unicode {
    public static void main(String[] args) {

        // выводим на экран значения Юникод символов начиная с unicode = 33 до unicode < 125
        for (char unicodechar = 33; unicodechar < 126; unicodechar++) {
            System.out.print(unicodechar);
        }
    }
}
