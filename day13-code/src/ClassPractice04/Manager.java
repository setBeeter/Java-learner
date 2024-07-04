package ClassPractice04;

public class Manager extends Employ{
    private double bounes;

    public Manager() {
    }

    public Manager(String id, String name, double salary, double bounes) {
        super(id, name, salary);
        this.bounes = bounes;
    }
}
