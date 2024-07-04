package test02;

public class GirlTest {
    public static void main(String[] args) {
        /*
        我女朋友叫凤姐,身高155.0厘米,体重130.0斤
        女朋友帮我洗衣服
        女朋友给我做饭
         */
        Girl g =new Girl();
        g.setName("凤姐");
        g.setHeight(155);
        g.setWeight(138);
        g.show();
        g.wash();
        g.cook();

    }
}
