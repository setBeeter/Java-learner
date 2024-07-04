package test;

import java.util.Random;

public class t03 {
    /*
    需求：
	定义方法实现随机产生一个5位的验证码
验证码格式：
	长度为5
	前四位是大写字母或者小写字母
	最后一位是数字
     */
    public static void main(String[] args) {
        char[] arr = new char[52];
        //给数组下标 0-25 输入赋值a-z
        for (int i = 0; i < 26; i++) {
            arr[i] = (char) (97 + i);
        }
        //给数组下标 26-51 赋值A-Z
        for (int i = 26; i < 52; i++) {
            arr[i] = (char) (65 + i - 26);
        }
        //随机生成第五位数
        Random r = new Random();
        int num = r.nextInt(10);
        //定义字符串result,存储最后的结果

    }
}
