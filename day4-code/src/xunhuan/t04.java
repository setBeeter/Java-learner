package xunhuan;

import java.util.Scanner;

public class t04 {
    /*
    需求：

      给定两个整数，被除数dividend和除数divisor（都是正数，且不超过int的范围）。

      将两数相除，要求不使用乘法、除法和 % 运算符。

      得到商和余数。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数");
        int dividend = sc.nextInt();
        System.out.println("请输入除数");
        int divisor = sc.nextInt();
        int a = dividend - divisor;
        int count = 1;

        //  50  2
        // 50-2     48-2    46-2
        while (a >= divisor) {
            a = a - divisor;
            count ++;

        }
        System.out.println("商为"+count);
        System.out.println("余数为"+a);
    }
}
