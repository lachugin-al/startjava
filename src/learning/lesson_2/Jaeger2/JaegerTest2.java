package learning.lesson_2.Jaeger2;

public class JaegerTest2 {

    public static void main(String[] args) {
        Jaeger2 jaegerOne = new Jaeger2();
        jaegerOne.setModelName("Bracer Phoenix");
        jaegerOne.setMark("Mark-5");
        jaegerOne.setOrigin("USA");
        jaegerOne.setHeight(70.7f);
        jaegerOne.setWeight(2.1f);
        jaegerOne.setSpeed(3);
        jaegerOne.setStrenght(8);
        jaegerOne.setArmor(9);

        Jaeger2 jaegerTwo = new Jaeger2("Cherno Alfa", "Mark-1", "Russia", 85.34f, 2.412f, 3, 10, 10);

        System.out.println("modelName: " + jaegerOne.getModelName());
        System.out.println("modelName: " + jaegerTwo.getModelName());

        // toString
        jaegerOne.toString();

        // или
        System.out.println(jaegerOne);
        System.out.println(jaegerOne.scanKaiju()); // в методе scanKaiju() нет System.out.println, поэтому выводим таким образом

        jaegerOne = jaegerTwo;
        System.out.println("modelName: " + jaegerOne.getModelName());
    }
}