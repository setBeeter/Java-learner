import java.util.Scanner;

public class t05 {
    /*
    键盘录入一个正整数
    定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
    在main方法中打印该数字是几位数
   演示格式如下:
   (1)演示一:
	  请输入一个整数:1234
	  控制台输出:1234是4位数字
   (2)演示二:
	  请输入一个整数:34567
	  控制台输出:34567是5位数字
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        System.out.println(num+"是"+weiShu(num)+"位数字");

    }

    public static int weiShu (int a) {
        int count=0;
        while (a!=0){
            count++;
            a=a/10;
        }
        return count;
    }


}
