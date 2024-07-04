package demo2;

public class Basektaballman extends Athlete{
    public Basektaballman() {
    }

    public Basektaballman(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("学习打篮球");
    }
}
