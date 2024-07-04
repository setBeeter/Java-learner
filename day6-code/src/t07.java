public class t07 {
    /*
    需求：
	定义一个方法fill(int[] arr,int value)
    功能：
	将数组arr中的所有元素的值改为value
     */
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int num = 0;
        fill(a,num);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }

    public static void fill(int []arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }

    }


}
