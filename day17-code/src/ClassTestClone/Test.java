package ClassTestClone;

import com.google.gson.Gson;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建一个对象
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};
        User u1 = new User(1, "zhangsan", "1234qwer", "girl11", data);
        User u2 = new User(1, "zhangsan", "1234qwer", "girl11", data);
        //克隆对象

//        Gson gson = new Gson();
//
//        String s = gson.toJson(u1);
//
//        User u2 = gson.fromJson(s, User.class);
//
//        System.out.println(u1);
//        System.out.println(u2);

        Object obj = new Object();

    }
}
