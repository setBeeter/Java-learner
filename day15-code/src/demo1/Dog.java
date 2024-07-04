package demo1;

public class Dog extends Animal implements Swim {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void act() {
        System.out.println("在吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗在狗刨");
    }
}
