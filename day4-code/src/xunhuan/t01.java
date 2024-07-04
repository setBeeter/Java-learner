package xunhuan;

import java.util.Scanner;

public class t01 {
    /*
    需求：键盘录入两个数字，表示一个范围。

         统计这个范围中。

	    既能被3整除，又能被5整除数字有多少个？
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count =0;
        System.out.println("请输入第一个数字(下限)");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字(上限)");
        int num2 = sc.nextInt();
        for (int i = num1; i <= num2; i++) {
            if((i%3==0)&&(i%5==0)){
                System.out.println(i+"既能被3整除,又能被5整除");
                count++;
            }

        }

        System.out.println("既能被3整除又能被5整除的数一共有"+count+"个");

    }
}
