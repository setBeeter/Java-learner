package test04;

/*
定义猫类Cat。属性:毛的颜色color，品种breed。行为:吃饭eat()，抓老鼠catchMouse()
 */
public class Cat {
    private String color;
    private String bread;

    public Cat() {

    }

    public Cat(String color, String bread) {
        this.color = color;
        this.bread = bread;
    }
    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取
     * @return bread
     */
    public String getBread() {
        return bread;
    }

    /**
     * 设置
     * @param bread
     */
    public void setBread(String bread) {
        this.bread = bread;
    }
    //行为
    //花色的波斯猫正在吃鱼.....
    //花色的波斯猫正在逮老鼠.
    public void eat(){
        System.out.println(color+"的"+bread+"正在吃鱼.....");
    }

    public void catchMouse(){
        System.out.println(color+"的"+bread+"正在逮老鼠.....");

    }
}
