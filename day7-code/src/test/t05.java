package test;

import java.util.Scanner;

public class t05 {
    /*
    需求 :
	在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。
	选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
     */
    public static void main(String[] args) {
        //调用输入分数的方法
        int[] score = getScore();
        //调用最高分的方法
        int max = getMax(score);
        //调用最小值的方法
        int min = getMin(score);
        //计算总分平均分
        int sum=0;
        //计算总分
        for (int i = 0; i < score.length; i++) {
            sum+=score[i];
        }
        //去掉最大值与最小值,计算总均分
        sum=sum-max-min;
        sum/=4;
        System.out.println("选手均分为"+sum);

    }

    //定义输入分数的方法
    public static int[] getScore() {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[6];
        for (int i = 1; i <= score.length; ) {
            System.out.println("请输入第" + i + "个学生的分数");
            System.out.println("分数区间在0-100");
            int num = sc.nextInt();
            if (num >= 0 && num <= 100) {
                score[i - 1] = num;
                i++;
            } else {
                System.out.println("输入的分数不合法");
            }

        }
        return score;
    }

    //方法 获取数组最大分数
    public static int getMax(int[] score) {
        int max = score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }

        return max;
    }


    //定义最小值的方法
    public static int getMin(int[] score) {
        int min = score[0];
        for (int i = 0; i < score.length; i++) {
            if (min > score[i]) {
                min = score[i];
            }

        }
        return min;
    }

}

