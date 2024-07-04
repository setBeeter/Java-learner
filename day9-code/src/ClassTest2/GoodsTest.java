package ClassTest2;

public class GoodsTest {
    public static void main(String[] args) {

        //1.创建对象数组
        Goods [] arr = new Goods[3];

        //2.创建对象
        Goods g1 = new Goods("001","小米手机",1999,20);
        Goods g2 = new Goods("002","华为手机",3999,50);
        Goods g3 = new Goods("003","vivo手机",2999,70);

        //3.给对象赋值

        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;

        //输出数组

        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId()+goods.getName()+goods.getPrice()+goods.getCount());
        }




    }


}
