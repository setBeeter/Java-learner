package ClassTests3;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Car c = new Car();
            //键盘录入
            //录入品牌
            System.out.println("请输入汽车品牌");
            String brand = sc.next();
            c.setBrand(brand);
            //录入价格
            System.out.println("请输入汽车价格");
            int price = sc.nextInt();
            c.setPrice(price);
            //录入颜色
            System.out.println("请输入汽车颜色");
            String color = sc.next();
            c.setColor(color);

            arr[i] = c;

        }

        //打印出来

        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand()+" "+car.getPrice()+""+arr[i].getColor());
        }

    }


}
