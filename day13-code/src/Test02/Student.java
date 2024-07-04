package Test02;

public class Student extends Role {
    private String studentClass;

    public Student() {
    }

    public Student(String name, int age, String studentClass) {
        super(name, age);
        this.studentClass = studentClass;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    @Override
    public void act() {
        super.act();
        System.out.println("填写听课反馈");
    }
}
