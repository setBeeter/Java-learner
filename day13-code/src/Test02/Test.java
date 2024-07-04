package Test02;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student("张三",18,"6班");
        System.out.println( stu.getName());
        System.out.println(stu.getAge());
        System.out.println(stu.getStudentClass());
        stu.act();




    }


}
