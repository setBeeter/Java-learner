package demo2;

public class Test {
    public static void main(String[] args) {
        System.out.println("乒乓球运动员");
        Pingpangman pm = new Pingpangman("张三",23);
        System.out.println(pm.getName()+", "+pm.getAge());
        pm.learn();
        pm.speak();
        System.out.println("篮球运动员");
        Basektaballman bm = new Basektaballman("李四",24);
        System.out.println(bm.getName()+", "+bm.getAge());
        bm.learn();
        System.out.println("乒乓球教练");
        Pingbangteacher pt = new Pingbangteacher("王五",36);
        System.out.println(pt.getName()+", "+pt.getAge());
        pt.teach();
        pt.speak();
        System.out.println("篮球教练");
        BaketballTeacher bt = new BaketballTeacher("赵六",36);
        System.out.println(bt.getName()+", "+bt.getAge());
        bt.teach();




    }

}
