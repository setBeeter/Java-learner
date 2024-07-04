package StudentSystem;

import java.util.ArrayList;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        String str = yanzhengCode();
        System.out.println(str);
    }
    //打印验证码
    private static String yanzhengCode() {
        /*
        长度为5
	由4位大写或者小写字母和1位数字组成，同一个字母可重复

比如
	aQa1K
         */
        Random r = new Random();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }
        //随机抽取四个字母
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            char c = list.get(index);
            sb.append(c);
        }
        int num = r.nextInt(10);
        sb.append(num);
        //数字可以出现在任意位置
        char [] array=sb.toString().toCharArray();
        int numIndex = r.nextInt(array.length);
        char temp = array[numIndex];
        array[numIndex]=array[array.length-1];
        array[array.length-1]=temp;

        String str=array.toString();
        return str;


    }
}
