package test;

public class t09 {
    public static void main(String[] args) {
        int[][] jidu = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        //调用方法,计算季度营业额
        int sum=0;
        for (int i =0; i<4; i++){
            int sum1=0;
            for (int j=0; j<3;j++){
                sum1=sum1+jidu[i][j];
                sum=sum+jidu[i][j];
            }
            System.out.println("第"+(i+1)+"个季度的营业额为"+sum1);
        }
        System.out.println("全年季度之和为"+sum);
    }
}


    /*
        public static int getSum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }
     */
    //定义一个方法 计算季度营业额

