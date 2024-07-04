package StudentCommunication;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    /*
    "-------------欢迎来到黑马学生管理系统----------------"
"1：添加学生"
"2：删除学生"
"3：修改学生"
"4：查询学生"
"5：退出"
"请输入您的选择:"
     */
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        loop:
        while (true) {
            //菜单栏
            System.out.println(" -------------欢迎来到黑马学生管理系统----------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择:");
            Scanner sc = new Scanner(System.in);
            //功能按键
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    add(list);
                    break;
                case 2://删除学生
                    delete(list);
                    break;
                case 3:
                    update(list);
                    break;
                case 4:
                    search(list);
                    break;
                case 5:
                    System.out.println("退出");
                    break loop;
                default:
                    System.out.println("输入错误,没有此功能,请重新输入.");
                    break;
            }
        }


    }
    //添加
    public static void add(ArrayList<Student> list) {
        //定义对象
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        //输入学生信息
        while (true) {
            System.out.println("请输入学生的学号id");
            String id = sc.next();
            int index = getIndex(list, id);
            if (index >= 0) {
                System.out.println("id已存在,请重新输入id");
            } else {
                stu.setId(id);
                break;
            }
        }

        System.out.println("请输入学生的姓名");
        String name = sc.next();
        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        System.out.println("请输入学生的家庭住址");
        String add = sc.next();

        stu.setName(name);
        stu.setAge(age);
        stu.setAdd(add);

        //对象存储到集合中
        list.add(stu);
        System.out.println("学生信息添加成功");
    }
    //删除
    public static void delete(ArrayList<Student> list) {
        System.out.println("请输入要删除的学生id");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int index = getIndex(list, id);
        if (index >= 0) {
            //  id存在则删除
            list.remove(index);
            System.out.println("id为" + id + "的学生信息删除成功");
        } else {
            // id不存在则提示不存在,返回初试菜单
            System.out.println("id不存在,删除失败");
        }

    }
    //修改
    //  键盘录入id
    public static void update(ArrayList<Student> list) {
        System.out.println("请输入要修改学生的id");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int index = getIndex(list, id);
        if(index>=0){
            //  存在 继续录入其他信息
            Student stu = list.get(index);
            System.out.println("请输入要修改的学生的姓名");
            String name = sc.next();
            System.out.println("请输入要修改的学生的年龄");
            int age = sc.nextInt();
            System.out.println("请输入要修改的学生的家庭住址");
            String add = sc.next();
            stu.setAge(age);
            stu.setName(name);
            stu.setAdd(add);
            System.out.println("id为"+id+"的学生信息修改成功");
        }
        else{
            //  不存在提示不存在
            System.out.println("要修改的学生id不存在,修改失败");
        }
    }
    //查询
    public static void search(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息,请添加后再查询");
        } else {
            //打印表头
            System.out.println("id\t\t  姓名\t 年龄\t 家庭住址");
            //打印集合数据
            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);
                System.out.println(stu.getId() + "\t\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAdd());
            }
        }


    }
    //通过id获取索引
    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
                return i;
            }

        }
        return -1;
    }
}


