package test;

import java.util.Scanner;

public class test04 {
    /*
   请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。例如："abcba"、"上海自来水来自海上"均为对称字符串。
     */
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("输入的字符为"+str);
        System.out.println();

        //将字符串转化StringBulider对象
        StringBuilder sb = new StringBuilder(str);
        //调用对象的reverse
        String str1 = sb.reverse().toString();

        if (str.equals(str1)) {
            System.out.println(str + "是对称字符");
        } else {
            System.out.println(str + "不是对称字符");
        }

    }
}
