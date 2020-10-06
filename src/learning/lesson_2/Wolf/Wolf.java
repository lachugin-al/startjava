package learning.lesson_2.Wolf;

public class Wolf {

    // пол, кличка, вес, возраст, окрас
    private String gender;
    private String nickName;
    private int weight;
    private int age;
    private String color;

    // геттеры
    public String getGender() {
        return gender;
    }

    public String getNickName() {
        return nickName;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    // сеттеры
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    // идти, сидеть, бежать, выть, охотиться
    public void go() {
        System.out.println("Идти");
    }

    public void sit() {
        System.out.println("Сидеть");
    }

    public void run() {
        System.out.println("Бежать");
    }

    public String houl() {
        return "Уууууууууууу";
    }

    public boolean hunt() {
        System.out.println("Добыча обнаружена, давай охотиться");
        return true;
    }
}