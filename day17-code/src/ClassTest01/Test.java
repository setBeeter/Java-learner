package ClassTest01;

public class Test {
    public static void main(String[] args) {
        int [] arr1 ={1,2,3,4,5,6,7,8,9,10};
        int [] arr2 = new int[10];

        System.arraycopy(arr1,0,arr2,0,10);
        //参数1: 数据源
        //参数2: 拷贝数据的起始索引
        //参数3: 拷贝目标处
        //参数4: 目标处的索引位置
        //参数5: 拷贝数据的长度
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
