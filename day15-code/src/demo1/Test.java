package demo1;

public class Test {
    public static void main(String[] args) {
        Rabbit r =new Rabbit("小兔",3);
        System.out.println("姓名为"+r.getName()+", "+r.getAge()+"岁");
        r.act();


        Dog d = new Dog("小狗",2);
        System.out.println("姓名为"+d.getName()+", "+d.getAge()+"岁");
        d.act();
        d.swim();

    }
}
