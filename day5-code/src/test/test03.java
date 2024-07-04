package test;
import java.util.Random;

public class test03 {
    /*
    创建一个长度为6的整数数组。请编写代码，随机生成六个0（包含）-100（不包含）之间的整数存放到数组中，
    然后计算出数组中所有元素的和并打印。
     */
    public static void main(String[] args) {
       int [] a = new int [6];
       int sum=0;
        //输入数组
       for (int i=0; i<6; i++){
           Random r = new Random();
           int num = r.nextInt(101);
           a[i]=num;
       }
       //打印并计算数组

        for (int i = 0; i < 6; i++) {
            sum+=a[i];
            System.out.println(a[i]);
        }

        System.out.println("数组的和为"+sum);


    }
}
