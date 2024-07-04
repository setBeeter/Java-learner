package com.heimait.demo2;

import java.util.Scanner;

public class yuehui {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("输入你的魅力值");
        int myfashion = sc.nextInt();
        System.out.println("输入女孩的魅力值");
        int girlfashion = sc.nextInt();
        if(myfashion>girlfashion)
        {
            System.out.println("约会成功");

        }
        else

        {

            System.out.println("约会失败");



        }
        


    }
}
