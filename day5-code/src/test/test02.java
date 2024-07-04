package test;

public class test02 {
    /*
    现有一个小数数组{12.9, 53.54, 75.0, 99.1, 3.14}。请编写代码，找出数组中的最小值并打印。
     */
    public static void main(String[] args) {
        double [] a ={2.9, 53.54, 75.0, 99.1, 3.14};
        double min=1000.0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]<min){
                min = a[i];
            }
        }
        System.out.println("最小值为"+min);
    }
}
