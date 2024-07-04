package test;

import java.util.Scanner;

public class t01 {
    /*
    需求:
	机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
	按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
     */
    public static void main(String[] args) {
        //1.键盘输入月份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        double price = sc.nextInt();
        System.out.println("输入月份");
        int month = sc.nextInt();
        System.out.println("请输入座舱类别,0代表经济舱,1代表头等舱");
        int tclass = sc.nextInt();

        System.out.println("您所要付的票价为" + getPrice(price, month, tclass));


        //2.定义一个方法, 传入票价 月份 和仓位
    }

    public static double getPrice(double price, int month, int tclass) {
        //旺季
        if (month >= 5 && month <= 10) {
            //头等舱
            if (tclass == 1) {
                price = price * 0.9;
            }
            //经济舱
            else {
                price = price * 0.85;
            }
        }
        //淡季
        else {
            //头等舱
            if (tclass == 1) {
                price = price * 0.7;
            }
            //经济舱
            else {
                price = price * 0.65;
            }
        }

        return price;

    }


}

