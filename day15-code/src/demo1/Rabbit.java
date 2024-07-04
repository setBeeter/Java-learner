package demo1;

public class Rabbit extends Animal {
    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void act() {
        System.out.println("在吃胡萝卜");
    }
}
