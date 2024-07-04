package ClassAPI;

import java.math.BigInteger;
import java.util.Random;

public class Binginteger {
    public static void main(String[] args) {

//        //获取随机大整数
//        BigInteger b1 = new BigInteger(3,new Random());
//        System.out.println(b1);
//
//        //获取指定大整数
//        BigInteger b2 = new BigInteger("12345678910101236486416516461616456");
//        System.out.println(b2);
//
//        //获取指定进制的大整数
//        BigInteger b3 = new BigInteger("a",16);
//        System.out.println(b3);
//
//        BigInteger b4 =  BigInteger.valueOf(78910000);
//        System.out.println(b4);

        //加法
        BigInteger b5 = BigInteger.valueOf(15);
        BigInteger b6 = BigInteger.valueOf(20);
        BigInteger integer =b5.divide(b6);
        System.out.println(integer);
    }
}
