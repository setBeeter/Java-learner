package test;

/*

李雷想买一个价值7988元的新手机，她的旧手机在二手市场能卖1500元，
而手机专卖店推出以旧换新的优惠，把她的旧手机交给店家，新手机就能够打8折优惠。
为了更省钱，李雷要不要以旧换新？请在控制台输出。
 */

public class test01 {

    public static void main(String[] args) {

        int shouji = 7988;
        int ershou = 7988-1500;
        double huanxin=7988*0.8;

        if(ershou>huanxin){

            System.out.println("不要以旧换新");


        }
        else {
            System.out.println("需要以旧换新");


        }



    }


}
