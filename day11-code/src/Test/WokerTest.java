package Test;

import java.util.ArrayList;

public class WokerTest {
    public static void main(String[] args) {
        Worker w1 = new Worker("张三", 3000);
        Worker w2 = new Worker("李四", 3500);
        Worker w3 = new Worker("王五", 4000);
        Worker w4 = new Worker("赵六", 4500);
        Worker w5 = new Worker("田七", 5000);

        ArrayList<Worker> list = new ArrayList<>();


        list.add(w1);
        list.add(w2);
        list.add(w3);
        list.add(w4);
        list.add(w5);


        //判断是否有姓名为"王五"的员工  改名王小五
        for (int i = 0; i < list.size(); i++) {
            Worker w = list.get(i);
            String name = "王五";
            if (w.getName().equals(name)) {
                w.setName("王小五");
            }
        }
        //判断是否有姓名为"赵六"的员工 有的话将其删除

        for (int i = 0; i < list.size(); i++) {
            Worker w =list.get(i);
            String name1="赵六";
            if (w.getName().equals(name1)){
                list.remove(i);
            }
        }

        //给姓名为 田七的员工涨500工资

        for (int i = 0; i < list.size(); i++) {
            Worker w =list.get(i);
            String name2="田七";
            if (w.getName().equals(name2)){
             w.setSalary(w.getSalary()+500);
            }
        }


        for (int i = 0; i < list.size(); i++) {
            Worker w = list.get(i);
            System.out.println("姓名:" + w.getName() +
                    ", 工资:" + w.getSalary());

        }





    }
}
