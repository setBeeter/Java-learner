package Test01;

public class Round extends Shape {
    private double r;
    private double pai;


    public Round() {
    }

    public Round(double r, double pai) {
        this.r = r;
        this.pai = pai;
    }

    /**
     * 获取
     * @return r
     */
    public double getR() {
        return r;
    }

    /**
     * 设置
     * @param r
     */
    public void setR(double r) {
        this.r = r;
    }

    /**
     * 获取
     * @return pai
     */
    public double getPai() {
        return pai;
    }

    /**
     * 设置
     * @param pai
     */
    public void setPai(double pai) {
        this.pai = pai;
    }

    //重写方法

    // 面积
    @Override
    public double area() {
        System.out.println("圆形的面积为:");
        double s = pai*r*r;
        return s;
    }
    //周长
    @Override
    public double length() {
        System.out.println("圆形的面积为:");
        double length = 2*pai*r;
        return length;
    }
}
