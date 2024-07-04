package test;

import java.util.Scanner;

public class test06 {
    /*
    有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。
    再通过键盘录入一个整数数字。
    要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。执行效果如下：
    请输入一个整数数字：
    50
    生成的新数组是：12 14 23 45 50 66 68 70 77 90 91
     */

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        int index=0;

        // 66
        //12 14 23 45  50  68 70 77 90 91

        int [] a ={12,14,23,45,66,68,70,77,90,91};
        int [] b = new int[11];
        for (int i = 0; i < a.length; i++) {
            if(num>a[i]){
                b[i] = a[i];
                index++;
            }
            else {
                b[i+1]=a[i];

            }

            }
        b[index]=num;
        System.out.println("插入数据后的数组为:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }


        }





}
