public class t02 {
    /*
    定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。
     */
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        int num3=30;
        System.out.println(getMax(num1,num2,num3));

    }

    public static int getMax(int a, int b, int c){
        if(a>b){
            if (b>c)
                return c;
            else
                return b;

        }
        //b>a
        else {
            if (a>c)
                return c;
            else
                return a;
        }



    }
}
