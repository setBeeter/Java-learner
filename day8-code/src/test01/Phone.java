package test01;
/*
定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，有打电话call()和sendMessage()两个功能。
 */
public class Phone {
    //定义属性
    private String name;
    private int price;
    private String color;

    public Phone() {

    }

    public Phone(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    //name的set与get
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    /**
     * 获取
     *
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * 设置
     *
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * 获取
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    //使用方法定义手机的功能
    /*
    正在使用价格为3998元黑色的小米手机打电话....
    正在使用价格为3998元黑色的小米手机发短信....
     */
    public  void call() {
        System.out.println("正在使用价格为"+price+"元"+color+"的"+name+"手机打电话");
    }

    public void sendMessage() {
       System.out.println("正在使用价格为"+price+"元"+color+"的"+name+"手机发信息");
    }
}
