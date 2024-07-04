package Test01;

public class Employee {
    private String id;
    private String name;

    public Employee() {

    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //  工作
    public void work() {
        System.out.println("正在工作");
    }



}
