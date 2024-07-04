package test;

import java.util.Random;

public class test02 {
    /*
    生成验证码
    内容：可以是小写字母，也可以是大写字母，还可以是数字
    长度为5
      内容中是四位字母，1位数字。
      其中数字只有1位，但是可以出现在任意的位置。
     */

    public static void main(String[] args) {
        //定义数组,存储 a-z; A-Z
        char[] chs = new char[52];
        //  存储a-z
        for (int i = 0; i < 26; i++) {
            chs[i] = (char) (97 + i);
        }
        // 存储A-Z
        for (int i = 26; i < chs.length; i++) {
            chs[i] = (char) (65 + i - 26);
        }
        //随机下标 取四次 数组
        Random r = new Random();
        String str = "";
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(chs.length);
            str=str+chs[index];
        }


        //拼接上 数组  得到结果字符串result;
        int num = r.nextInt(10);
        str=str+num;
        //将字符串  str 转为为数组
        char[] arr = str.toCharArray();

        //打乱数组
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            char temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }

        //转为为字符串
        String result = new String(arr);
        System.out.println(result);


    }
}
