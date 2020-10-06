package learning.lesson_2.Wolf;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.setGender("female");
        wolf1.setNickName("Marusya");
        wolf1.setWeight(3);
        wolf1.setAge(10);
        wolf1.setColor("pink");

        System.out.println("Кличка: " + wolf1.getNickName());
        System.out.println("Пол: " + wolf1.getGender());
        System.out.println("Вес: " + wolf1.getWeight());
        System.out.println("Возраст: " + wolf1.getAge());
        System.out.println("Цвет: " + wolf1.getColor());

        /*wolf1.gender = "male";
        wolf1.nickName = "Toby";
        wolf1.weight = 2;
        wolf1.age = 1;
        wolf1.color = "white";
        System.out.println("Кличка: " + wolf1.nickName);
        System.out.println("Пол: " + wolf1.gender);
        System.out.println("Вес: " + wolf1.weight);
        System.out.println("Возраст: " + wolf1.age);
        System.out.println("Цвет: " + wolf1.color);

        System.out.println(wolf1.nickName + " какие команды ты знаешь?");
        wolf1.go();
        wolf1.sit();
        wolf1.run();
        System.out.println(wolf1.houl());
        System.out.println(wolf1.hunt());*/
    }
}