package test;

import java.util.Scanner;

public class T7 {
    /*
    需求：
	键盘录入一个三位数，求这个三位数每一位的数字和。
	举例：
	键盘录入123。那么每一位数字相加为：1 + 2 + 3，和为：7。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num = sc.nextInt();

        int ge, shi , bai;
        ge = num%10;
        shi = num/10%10;
        bai = num/100;

        System.out.println(ge+shi+bai);




    }
}
