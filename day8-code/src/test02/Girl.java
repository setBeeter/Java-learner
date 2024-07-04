package test02;

/*
定义一个女朋友类。女朋友的属性包含：姓名，身高，体重。
行为包含：洗衣服wash()，做饭cook()。另外定义一个用于展示三个属性值的show()方法。
请在测试类中通过有参构造方法创建对象并赋值，然后分别调用展示方法、洗衣服方法和做饭方法。打印效果如下：
 */
public class Girl {
    private String name;
    private int height;
    private int weight;

    public Girl() {

    }

    public Girl(String name, int height, int weight) {
        this.name=name;
        this.height=height;
        this.weight=weight;
    }


    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * 获取
     * @return weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * 设置
     * @param weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    // 行为
    public  void show () {
        System.out.println("我的女朋友叫"+name+",身高,"+height+"厘米,体重"+weight+"斤");
    }
    public void wash(){
        System.out.println("女朋友给我洗衣服");
    }
    public void cook(){
        System.out.println("女朋友给我做饭");
    }
}
