package ClassPractice02;

public class Test {
    public static void main(String[] args) {
        System.out.println("哈士奇");
        Hasiky h = new Hasiky();
        h.eat();
        h.drink();
        h.lookHome();


        System.out.println("沙皮狗");
        Shapi s = new Shapi();
        s.eat();
        s.drink();
        s.lookHome();

        System.out.println("中华田园犬");
        Tianyuan t = new Tianyuan();
        t.eat();
        t.drink();
        t.lookHome();

    }
}
