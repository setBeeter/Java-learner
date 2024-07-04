package demo2;

public class Pingbangteacher extends Coah implements Speak{
    public Pingbangteacher() {
    }

    public Pingbangteacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");

    }
}
