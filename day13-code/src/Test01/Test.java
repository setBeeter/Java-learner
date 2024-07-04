package Test01;

public class Test {
    public static void main(String[] args) {
        Lecture l = new Lecture("001", "王讲师");
        System.out.println(l.getId());
        System.out.println(l.getName());
        l.work();
        System.out.println();
        Tutor t = new Tutor("002","李助教");
        System.out.println(t.getId());
        System.out.println(t.getName());
        t.work();
        System.out.println();
        Maintainer m =new Maintainer();
        m.setId("003");
        m.setName("孙维护");
        System.out.println(m.getId());
        System.out.println(m.getName());
        m.work();
        System.out.println();
        System.out.println();
        Buyer b = new Buyer("004","祝专员");
        System.out.println(b.getId());
        System.out.println(b.getName());
        b.work();











    }
}


