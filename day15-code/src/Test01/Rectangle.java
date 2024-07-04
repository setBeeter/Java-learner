package Test01;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * 获取
     * @return length
     */
    public double getLength() {
        return length;
    }

    /**
     * 设置
     * @param length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * 获取
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * 设置
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }

   //面积

    @Override
    public double area() {
        System.out.println("长方形的面积为:");
       double area = length*width;
       return area;
    }
    //周长

    @Override
    public double length() {
        System.out.println("长方形的周长为:");
        double l = (width+length)*2;
        return l;
    }
}
