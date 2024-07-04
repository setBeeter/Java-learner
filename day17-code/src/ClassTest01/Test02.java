package ClassTest01;

import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        Runtime.getRuntime().availableProcessors(); //获得CPU的线程数
        Runtime.getRuntime().maxMemory();           //JVM从系统中获得内存大小 单位byte
        Runtime.getRuntime().totalMemory();         //java虚拟机已经从系统中获得的内存大小  单位byte
        Runtime.getRuntime().freeMemory();          //JVM剩余内存的大小

        Runtime.getRuntime().exec("");   //运行cmd命令
        //shutdown  关机
        //-s       : 默认1min之后关机
        //-s -t    :指定时间关机,后面加s
        //-a       :取消关机操作
        //-r       :关机重启





    }
}
