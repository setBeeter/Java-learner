package test;

import java.util.Scanner;
//	儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
//	女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2

public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入父亲身高(cm)");
        int father = sc.nextInt();
        System.out.println("请输入母亲身高(cm)");
        int mother = sc.nextInt();
        double son , daughter;
        son =(father+mother)*1.08/2;
        daughter=(father*0.923+mother)/2;
        System.out.println("儿子身高为:"+son);
        System.out.println("女儿身高为:"+daughter);










    }
}
