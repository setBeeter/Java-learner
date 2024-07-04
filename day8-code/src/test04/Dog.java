package test04;

public class Dog {
    /*
    定义狗类Dog。属性:毛的颜色color，品种breed。行为:吃饭()，看家lookHome()
     */
    private String color;
    private String breed;

    public Dog() {
    }

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
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

    /**
     * 获取
     *
     * @return breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * 设置
     *
     * @param breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    //行为 吃饭()，看家lookHome()
    //黑色的藏獒正在啃骨头.....
    //黑色的藏獒正在看家.
    public void ead() {
        System.out.println(color + "的" + breed + "正在啃骨头");
    }

    public void lookHome() {
        System.out.println(color + "的" + breed + "正在看家");
    }

}
