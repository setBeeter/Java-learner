public class t06 {
    /*
    需求：
	定义一个方法equals(int[] arr1,int[] arr2).
    功能：
	比较两个数组是否相等（长度和内容均相等则认为两个数组是相同的）
     */
    public static void main(String[] args) {
        int [] a1 ={1,2,3,4,5};
        int [] a2 ={1,2,3,4,6};
        System.out.println(equals(a1,a2));
    }

    public static boolean equals(int [] arr1,int [] arr2) {
        int count=0;
        int sum= 0;
        //判断数组长度相等
        if (arr1.length==arr2.length){

        }
        else
            return false;
        //判断数组内容是否相等
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]==arr2[i]) {
            }
            else {
               return false;
            }
        }
        return true;


    }
}

