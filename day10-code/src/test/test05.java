package test;

import java.util.Scanner;

public class test05 {
    /*
    我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。
    请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。
    规则为：号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。
     */
    public static void main(String[] args) {

        //1.输入身份证号,存储到str中
        System.out.println("请输入身份证号");
        Scanner sc =new Scanner(System.in);
        String str= sc.next();
        System.out.println("输入的字符串为"+str);
        //调用方法IdTest bool类型
        boolean test = IdTest(str);
        if (test==true){
            System.out.println("输入的身份证合法");

        }else {
            System.out.println("输入的身份证不合法");

        }


    }
    //IdTest
    public static boolean IdTest(String id) {
        //将字符串转为数组arr
        char [] arr = id.toCharArray();
        //id长度为18
        if(arr.length!=18){
            return false;
        }
        //检测字符串的第0位  不能以数字0开头
        if (arr[0]=='0'){
            return false;
        }
        //检测字符串前17位  必须为数字
        for (int i = 0; i < 17; i++) {
            if( !(arr[i]>='0'&&arr[i]<='9')){
                return false;
            }
        }
        //最后一位可以是数字或者大写字母X
        if (!((arr[17]>='0'&&arr[17]<='9')||(arr[17]=='X'))){
            return false;

        }
        return true;


    }



}
