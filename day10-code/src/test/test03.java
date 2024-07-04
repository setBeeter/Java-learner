package test;

import java.util.Scanner;

public class test03 {
    /*
    请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。比如：Hello12345World中字母：10个，数字：5个。
     */
    public static void main(String[] args) {
        //输入一个字符串
        System.out.println("请输入一个字符串");
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        int zimu=0;
        int num=0;
        char [] arr  = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= 'A' && arr[i] <= 'Z') ||(arr[i] >= 'a' && arr[i] <= 'z')) {
                zimu++;
            }
            else if (arr[i]>='0'&&arr[i]<='9') {
                num++;
            }
        }

        System.out.println("字符串中字母个数为"+zimu+"个");
        System.out.println("字符串中数字个数为"+num+"个");

    }
}
