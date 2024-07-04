package test;

import java.util.Scanner;

public class t06 {
    /*
    需求：
	某系统的数字密码（大于0），比如1983，采用加密方式进行传输。
规则如下：
	先得到每位数，然后每位数都加上5 , 再对10求余，最后将所有数字反转，得到一串新数。
     */
    public static void main(String[] args) {
        //键盘录入数据
        System.out.println("请输入需要加密的数据");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //拆分数据,存放到数组中
        //1.计算数据长度
        int length = 0;
        int temp1 = num;
        int temp2 = num;
        while (temp1 != 0) {
            temp1 /= 10;
            length++;
        }
        //2.把数据拆分放到数组中
        int[] a = new int[length];
        while (temp2 != 0) {
            int x = temp2 % 10;
            a[length - 1] = x;
            length--;
            temp2 = temp2 / 10;
        }
        //对数组进行加5 和对10取余操作
        for (int i = 0; i < a.length; i++) {
            a[i] += 5;
            a[i] %= 10;
        }
        //对数组进行翻转
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }
        //输出加密后的数据
        String result = "";
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        System.out.println("加密后的数据为" + result);
    }
}
