package test;

import java.util.Scanner;

public class test04 {
    /*
    某商场购物可以打折，具体规则如下：
	普通顾客购不满100元不打折，满100元打9折；
	会员购物不满200元打8折，满200元打7.5折；
	不同打折规则不累加计算。

请根据此优惠计划进行购物结算，键盘录入顾客的类别（0表示普通顾客，1表示会员）和购物的折前金额（整数即可），输出应付金额（小数类型）。
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //顾客类别 if
        System.out.println("请输入客户类别:0为普通,1为vip");
        int vip = sc.nextInt();
        System.out.println("请输入购物金额");
        int money = sc.nextInt();
        double outmoney;
        if(vip==0){
            if(money<100){
                System.out.println("应付金额为"+ money);
            }
            else {
                outmoney = money *0.9;
                System.out.println("应付金额为"+ outmoney);
            }
        }
        else if (vip==1){
            if (money<200){
                outmoney = money*0.8;
            }
            else {
                outmoney = money*0.75;

            }
            System.out.println("应付金额为"+outmoney);
        }
        else {
            System.out.println("请输入正确的客户类别");
        }


        }

    }

