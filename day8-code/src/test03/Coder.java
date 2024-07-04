package test03;
/*
定义程序员类Coder。属性：姓名name，工号id，工资salary。行为：工作work()
 */
public class Coder {
    String name;
    String id;
    int salary;


    public Coder() {
    }

    public Coder(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
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
     * @return salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
    //行为
    public void work(){
        //工号为135基本工资为10000的程序员李四正在努力的写着代码......
        System.out.println("工号为" + id + "基本工资为"+salary+"的程序员"+name+"正在努力写着代码.....");
    }


}
