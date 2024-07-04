package test;

public class t04 {
    /*
   练习四：复制数组
   需求：
   把一个数组中的元素复制到另一个新数组中去。
     */
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6};
        int [] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i]=a[i];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }

    }
}
