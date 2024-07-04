package demo2;

public class Pingpangman extends Athlete implements Speak{
    public Pingpangman() {
    }

    public Pingpangman(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("学习打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
