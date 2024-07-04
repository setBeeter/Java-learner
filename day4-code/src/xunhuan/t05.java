package xunhuan;

public class t05 {
    /*
        已知2019年是猪年，请在控制台输出从1949年到2019年中所有是猪年的年份。

            训练提示
            1. 1949到2019有很多年？逐个判断这么多年份肯定要用循环。
            2. 用什么条件来判断是否是猪年？
     */


    public static void main(String[] args) {
        int count =0;

        for (int year=2019; year>=1949;year--){
            if(count%12==0){
                System.out.println(year+"是猪年");
            }
            count++;
        }

    }
}
