package ClassTest4;

import java.util.Scanner;

public class GirlTest {
    public static void main(String[] args) {
        /*
        	定义数组存储4个女朋友的对象

        	女朋友的属性：姓名、年龄、性别、爱好

            要求1：计算出四女朋友的平均年龄

         	要求2：统计年龄比平均值低的女朋友有几个？并把她们的所有信息打印出来。
         */

        Girl[] arr = new Girl[4];
        Girl g1 = new Girl("小红", 18, "女", "吃饭");
        Girl g2 = new Girl("小慧", 17, "女", "睡觉");
        Girl g3 = new Girl("小婷", 19, "女", "唱歌");
        Girl g4 = new Girl("小宜", 16, "女", "化妆");
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        arr[3] = g4;

        System.out.println("女朋友的平均年龄为" + avgAag(arr));
        double avg = avgAag(arr);
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge()<avg){
                count++;
                System.out.println(arr[i].getName()+","+arr[i].getName()+","+arr[i].getHobby()+",");
            }
        }
        System.out.println("年龄比平均值低的女朋友有"+count+"个");

    }

    public static double avgAag(Girl[] arr) {
        double avg = 0.0;
        for (int i = 0; i < arr.length; i++) {
            avg = avg + arr[i].getAge();
        }
        return avg / arr.length;
    }


}
