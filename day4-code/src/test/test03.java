package test;


import java.util.Scanner;

public class test03 {
    /*
    某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
	存期		年利率（%）
	一年		2.25
	两年		2.7
	三年		3.25
	五年		3.6
请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
提示：
	存入金额和存入年限均由键盘录入
	本息计算方式：本金+本金×年利率×年限
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入存入金额(必须大于1000)");
        int money = sc.nextInt();
        //如果输入的金额小于1000,如何处理?
        if (money<1000){
            System.out.println("存入金额必须大于1000");
        }
        System.out.println("请输入存入年限(1,2,3,5任选一)");
        int year = sc.nextInt();
        double sum;
        switch (year){
            case 1:{
                sum = money+(money*0.025*1);
                System.out.println("本息总额为:"+ sum );
                break;
            }
            case 2:{
                sum = money+(money*0.027*2);
                System.out.println("本息总额为:"+ sum );
                break;
            }
            case 3:{
                sum = money +(money*0.0325*3);
                System.out.println("本息总额为:"+ sum );
                break;
            }
            case 5:{
                sum = money +(money*0.036*5);
                System.out.println("本息总额为:"+ sum );
                break;
            }
            default:
                System.out.println("请输入正确年份");
                break;

        }





    }




}
