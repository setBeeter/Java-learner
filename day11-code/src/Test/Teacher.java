package Test;

public class Teacher {
    private String name;
    private String sdept;


    public Teacher() {
    }

    public Teacher(String name, String sdept) {
        this.name = name;
        this.sdept = sdept;
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
     * @return sdept
     */
    public String getSdept() {
        return sdept;
    }

    /**
     * 设置
     * @param sdept
     */
    public void setSdept(String sdept) {
        this.sdept = sdept;
    }

}
