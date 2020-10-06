package learning.lesson_2.Jaeger2;

// make blueprint class robot "Jaeger"
public class Jaeger2 {

    // public закрывает доступ к переменным для обращения из вне класса
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strenght;
    private int armor;

    public Jaeger2() {

    }

    public Jaeger2 (String modelName, String mark, String origin, float height, float weight, int speed, int strengh, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strenght = strengh;
        this.armor = armor;
    }

    // геттер переменной modelName, можем обратиться к геттеру, а не напрямую к перемнной и получить modelName
    public String getModelName() {
        return modelName;
    }

    public String getMark() {
        return mark;
    }

    public String getOrigin() {
        return origin;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public int getArmor() {
        return armor;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrenght() {
        return strenght;
    }

    // сеттер позволяет поменять значение переменно, но мы так же может указать условие для замены
    public void setModelName(String modelName) {
        if (modelName == " ") {
            System.out.println("Пустая строка - не меняем");
        } else {
            this.modelName = modelName;
        }
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    // Методы
    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public void move() {
        System.out.println("Вы прошли 5 шагов");
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void useVertexCannon() {
    }

    // Метод toString
    @java.lang.Override
    public java.lang.String toString() {
        return "Jaeger{" +
                "modelName='" + modelName + '\'' +
                ", mark='" + mark + '\'' +
                ", origin='" + origin + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", speed=" + speed +
                ", strenght=" + strenght +
                ", armor=" + armor +
                '}';
    }
}