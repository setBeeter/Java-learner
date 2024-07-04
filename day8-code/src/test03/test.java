package test03;

import java.util.concurrent.Callable;

public class test {
    /*
    工号为123基本工资为15000奖金为6000的项目经理张三正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
     工号为135基本工资为10000的程序员李四正在努力的写着代码......
     */
    public static void main(String[] args) {
        Manager m = new Manager();
        Coder c = new Coder();
        m.setId("123");
        m.setSalary(15000);
        m.setBonus(6000);
        m.setName("张三");
        m.work();

        c.setId("123");
        c.setSalary(10000);
        c.setName("李四");
        c.work();

    }
}
