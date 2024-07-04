package ClassPractice04;

public class Test {
    public static void main(String[] args) {
        Cooker c = new Cooker("001","张三",1800);
        System.out.println(c.getId());
        System.out.println(c.getName());
        System.out.println(c.getSalary());
        c.eat();
        c.work();


        System.out.println();
        Manager m = new Manager("001","李四",2500,1800);
        System.out.println(m.getId());
        System.out.println(m.getName());
        System.out.println(m.getSalary());
        m.eat();
        m.work();

    }
}
