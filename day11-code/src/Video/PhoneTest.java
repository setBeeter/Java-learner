package Video;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        //创建手机对象,存入数据
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);

        //创建集合    存储对象
        ArrayList<Phone> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

      ArrayList<Phone> P= pire(list,3000);







    }

    public static ArrayList<Phone> pire(ArrayList<Phone> array, int price) {
        ArrayList<Phone> result = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getPrice()<price){
               result.add(array.get(i));
            }
        }
        return result;
    }

}
