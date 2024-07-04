package test;

import java.util.Random;

public class t08 {
/*
	一个大V直播抽奖，奖品是现金红包，分别有{2, 588 , 888, 1000, 10000}五个奖金。
	请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
	打印效果如下：（随机顺序，不一定是下面的顺序）
	        888元的奖金被抽出
            588元的奖金被抽出
            10000元的奖金被抽出
            1000元的奖金被抽出
            2元的奖金被抽出
 */
    public static void main(String[] args) {
        int [] bounce = {2,588,888,1000,10000};
        Random r = new Random();


        //如何实现抽奖不重复
        //2.升级版
        for (int i = 0; i < bounce.length; i++) {
            int randomIndex = r.nextInt(bounce.length);
            int temp = bounce[i];
            bounce[i]=bounce[randomIndex];
            bounce[randomIndex]=temp;
        }

        for (int i = 0; i < bounce.length; i++) {
            System.out.println(bounce[i]);
        }












        //1. 常规版
       /*
       for (int i = 0; i < 5; ) {
            int index= r.nextInt(bounce.length);
            if (bounce[index]!=0){
                System.out.println(bounce[index]+"元的奖被抽出");
                bounce[index]=0;
                i++;
            }
            else {
                continue;
            }

        }
        */






    }
}
