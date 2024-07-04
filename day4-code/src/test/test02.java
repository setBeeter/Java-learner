package test;

import java.util.Scanner;

/*
让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。
 */
public class test02 {
    public static void main(String[] args) {
    //输入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("属于第一个数");
        int num1 = sc.nextInt();
        System.out.println("属于第二个数");
        int num2 = sc.nextInt();
        System.out.println("属于第三个数");
        int num3 = sc.nextInt();
    //比较数据
        if(num1>num2) {

            if (num2>num3){
                System.out.println("最小的值为"+num3);
            }
            else {
                System.out.println("最小的值为"+num2);

            }

        }
        //num2>num1
        else {
            if (num1>num3){

                System.out.println("最小的值为"+num3);

            }
            else {

                System.out.println("最小的值为"+num1);

            }


        }




    }
}
