package ClassPractice01;

public class Test {
    public static void main(String[] args) {
        System.out.println("布偶猫");
        BuOu b = new BuOu();
        b.eat();
        b.drink();
        b.catchMouse();

        System.out.println("------------------");
        Hasiky h = new Hasiky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();

    }

}
