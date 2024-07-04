public class t01 {
    //定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        System.out.println(getMin(num1,num2));



    }

    public static int getMin(int a, int b) {
        if(a>b)
            return b;
        else
            return a;

    }
}
