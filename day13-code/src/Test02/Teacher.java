package Test02;

public class Teacher extends Role{
    private String stuff;

    public Teacher(String stuff) {
        this.stuff = stuff;
    }

    public Teacher(String name, int age, String stuff) {
        super(name, age);
        this.stuff = stuff;
    }

    public void setStuff(String stuff) {
        this.stuff = stuff;
    }

    public String getStuff() {
        return stuff;
    }

    @Override
    public void act() {
        super.act();
        System.out.println("发布问题");
    }
}
