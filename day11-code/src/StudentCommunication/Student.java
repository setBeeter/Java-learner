package StudentCommunication;

public class Student {
    /*
    属性：id、姓名、年龄、家庭住址
     */
    private String id;
    private  String name;
    private int age;
    private String add;

    public Student() {
    }

    public Student(String id, String name, int age, String add) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.add = add;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
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
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return add
     */
    public String getAdd() {
        return add;
    }

    /**
     * 设置
     * @param add
     */
    public void setAdd(String add) {
        this.add = add;
    }

}
