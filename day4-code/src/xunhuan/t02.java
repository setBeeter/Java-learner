package xunhuan;

public class t02 {
/*
需求：世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，

	假如我有一张足够大的纸，它的厚度是0.1毫米。

	请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
 */

    public static void main(String[] args) {
        double paper = 0.1;
        double mount = 8844430;
        int count=0;

        //0.1  0.2  0.4  0.8   0.16

        while (paper<mount){
            paper = paper*2;
            count++;
        }

        System.out.println("折叠"+count+"次");


    }
}
