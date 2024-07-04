package demo2;

public abstract class Athlete extends Person{
    public Athlete() {
    }

    public Athlete(String name, int age) {
        super(name, age);
    }

    //抽象类 学习
    public abstract void learn();
}
