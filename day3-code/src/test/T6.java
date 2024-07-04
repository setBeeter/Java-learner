package test;

import java.util.Scanner;

public class T6 {
/*
数字6是一个真正伟大的数字，键盘录入两个整数。

如果其中一个为6，最终结果输出true。

如果它们的和为6的倍数。最终结果输出true。

其他情况都是false。
 */
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("输入第一个数");
    int num1 = sc.nextInt();
    System.out.println("输入第二个数");
    int num2 = sc.nextInt();
    if (num1==6||num2==6||(num1+num2)%6==0)
        System.out.println("true");
    else
        System.out.println("false");







}









}
