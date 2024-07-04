package Test01;

public class Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5.0,3.0);
        System.out.println(r.area());
        System.out.println(r.length());



        Round round = new Round(7,3.14);
        System.out.println(round.area());
        System.out.println(round.length());

    }


}
