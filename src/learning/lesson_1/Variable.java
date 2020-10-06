package learning.lesson_1;

public class Variable {
    public static void main(String[] args) {

        // Объявляем в методе переменные всех существующих в Java примитивных типов данных.
        byte core = 4;
        short ramMhz = 1600;
        int videoMemory = 1536;
        long ramMb = 4048;
        float processor = 2.5f;
        double versionOs = 19.04d ;
        char linuxOs = 'Y';
        boolean isMacOs = 1 - 1 == 0;

        System.out.println(core + " " + ramMhz + " " + videoMemory + " " + ramMb + " " + processor + " " + versionOs + " " + linuxOs + " " + isMacOs);
    }
}
