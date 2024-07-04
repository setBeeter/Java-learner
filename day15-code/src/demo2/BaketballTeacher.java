package demo2;

public class BaketballTeacher extends Coah{
    public BaketballTeacher() {
    }

    public BaketballTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打篮球");
    }
}
