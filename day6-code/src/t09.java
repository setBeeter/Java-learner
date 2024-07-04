public class t09 {
    /*
    需求：
	定义一个方法copyOf(int[] arr, int newLength)

功能：
	将数组arr中的newLength个元素拷贝到新数组中，并将新数组返回，从索引为0开始
     */
    public static void main(String[] args) {
        int [] a ={1,2,3,4,5,6,7};
        int newlength=6;

    }

    public static int copyOf(int [] arr, int length) {
        int [] b = new  int[length];
        for (int i = 0; i < b.length; i++) {
            b[i]=arr[i];
        }
        return ;

    }
}
