package Demo1;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher("张三",35);
        register(t);
        Student stu = new Student("李四",25);
        register(stu);
    }


    public static void register(Person p) {
        p.show();

    }
}
