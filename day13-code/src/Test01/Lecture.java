package Test01;

public class Lecture extends Teacher{
    public Lecture() {
    }

    public Lecture(String id, String name) {
        super(id, name);


    }
    @Override
    public void work(){
        System.out.println("讲师在授课!");

    }
}
