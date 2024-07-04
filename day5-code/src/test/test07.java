package test;

public class test07 {
    public static void main(String[] args) {
       /*
        定义一个数组其中包含多个数字。用自己的方式最终实现，
        奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）
        */

        // 1 2 3 4 5 6
        // [1,3 5         6  4 ,2]
        //low++         high--


        int [] a = {1,2,3,4,5,6,7,8,12,14,16};
        int [] b = new int[a.length];
        int low=0;
        int high=a.length-1;
            for (int i = 0; i < a.length; i++) {
                if(a[i]%2==0){
                    b[low]=a[i];
                    low++;
                }
                else {
                    b[high]=a[i];
                    high--;

                }

            }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]+" ");
        }







    }
}
