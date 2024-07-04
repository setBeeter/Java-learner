package Demo2;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }
    //行为吃东西
    //3岁的灰颜色的猫眯着眼睛侧着头吃鱼

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的猫咪着眼睛侧头吃着" +
                something);
    }

    //行为抓老鼠
    public void catchMouse() {
        System.out.println("猫正在抓老鼠");
    }
}
