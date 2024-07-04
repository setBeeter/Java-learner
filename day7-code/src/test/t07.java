package test;

import java.util.Scanner;

public class t07 {
   /*
   数组解密
逆运算	先得到每位数，然后每位数都加上5 , 再对10求余，最后将所有数字反转，得到一串新数。
8346->1983;
    */
   public static void main(String[] args) {

      int num = 8346;
      int temp1=num;
      int temp2=num;
         //计算数组的长度
      int length=0;
      while (temp1!=0){
         temp1/=10;
         length++;
      }
      System.out.println(length);
      int [] a = new int[length];
      // 把数据存储到数组中
      while (temp2!=0){
         int temp=temp2%10;
         a[length-1]=temp;
         temp2/=10;
         length--;
      }

      for (int i = 0; i < a.length; i++) {
         System.out.println(a[i]);
      }
      //翻转数组
      for (int i=0,j=length-1; i<j; i++,j--){
         int x = a[i];
         a[i]=a[j];
         a[j]=x;
      }






      //对10取余



      //
   }

}
