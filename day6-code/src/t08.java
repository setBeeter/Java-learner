public class t08 {
    /*
    需求：

	定义一个方法fill(int[] arr,int fromIndex,int toIndex,int value)

   功能：

	将数组arr中的元素从索引fromIndex开始到toIndex（不包含toIndex）对应的值改为value
     */
    public static void main(String[] args) {
        int [] a ={1,2,3,4,5,6,7};
        int fromIndex=2;
        int toIndex=6;
        int value=0;
        fill(a,fromIndex,toIndex,value);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }



    }

    public static void fill(int [] arr, int low, int high, int value) {
        for (int i = low; i < high; i++) {
            arr[i]=value;

        }

    }


}
