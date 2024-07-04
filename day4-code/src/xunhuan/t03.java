package xunhuan;

import java.util.Scanner;

public class t03 {
    /*
    需求：给你一个整数 x 。

如果 x 是一个回文整数，打印 true ，否则，返回 false 。

解释：回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

例如，121 是回文，而 123 不是。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        System.out.println("请输入一个数");
        int x = sc.nextInt();
        int baocun =x;
        while (x!=0){
            int ge =x%10;
            x=x/10;
            temp = temp*10 + ge;
        }
        if (temp==baocun){
            System.out.println(baocun+"是回文数");
        }
        else {
            System.out.println(baocun+"不是回文数");
        }

    }
}
