package Demo2;

public class Animal {
    //年龄  颜色
    //行为  eat   形参Something


    int age;
    String color;

    public Animal() {
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void eat(String something){

    }
}
