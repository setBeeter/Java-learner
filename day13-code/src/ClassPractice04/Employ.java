package ClassPractice04;

public class Employ {
    private String id;
    private String name;
    private double salary;


    public Employ() {
    }

    public Employ(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println("员工在工作");
    }

    public void eat(){
        System.out.println("吃米饭");
    }

}
