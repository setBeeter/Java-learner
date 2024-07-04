package test;

import java.util.Random;

public class test01 {
    /*
    键盘输入任意字符串，打乱里面的内容
     */

    public static void main(String[] args) {

        //输入字符串 str1
        String str1 = "abcde";
        //将字符串转换为数组
        char[] chars = new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            chars[i] = str1.charAt(i);
        }

        //打印字符串数组
        /*
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
         */
        //打乱数组
        Random r = new Random();
        for (int i = 0; i < chars.length; i++) {
            int index = r.nextInt(chars.length);
            char temp=chars[i];
            chars[i]=chars[index];
            chars[index]=temp;
        }

        //数组转为为字符串
        String result = chars.toString();
        String result1 = new String(chars);

        System.out.println(result1);


    }
}
