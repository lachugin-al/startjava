package learning.lesson_2.Jaeger;

public class JaegerTest {

    public static void main(String[] args) {

        // ссылаемся на объекты класса Jaeger
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Bracer Phoenix");
        jaegerOne.setMark("Mark-5");
        jaegerOne.setOrigin("USA");
        jaegerOne.setHeight(70.7f);
        jaegerOne.setWeight(2.1f);
        jaegerOne.setSpeed(3);
        jaegerOne.setStrenght(8);
        jaegerOne.setArmor(9);

        Jaeger jaegerTwo = new Jaeger("Cherno Alfa", "Mark-1", "Russia", 85.34f, 2.412f, 3, 10, 10);

        System.out.println("modelName: " + jaegerOne.getModelName());
        System.out.println("modelName: " + jaegerTwo.getModelName());

        jaegerOne = jaegerTwo;

        System.out.println("modelName: " + jaegerOne.getModelName());
    }
}