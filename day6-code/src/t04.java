import java.util.Scanner;

public class t04 {
    public static void main(String[] args) {
        /*
        数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。
        请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试。
         */
        System.out.println("请输入一个小数");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.println("小数的绝对值为:");
        System.out.println(getJue(num));
    }

    public static double getJue(double a) {
        if(a>0)
            return a;
        else
            return (-a);

    }
}
