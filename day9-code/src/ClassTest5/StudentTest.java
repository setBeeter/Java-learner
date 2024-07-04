package ClassTest5;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象数组
        Student[] arr = new Student[3];
        //创建对象
        Student stu1 = new Student(1, "张三", 18);
        Student stu2 = new Student(2, "李四", 19);
        Student stu3 = new Student(3, "王五", 20);
        //给数组赋初值
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        //要求1:添加一个学生对象,在添加的时候进行学号的唯一性判断
        //数组不满->添加学生对象->判断是否已有学生学号->没有这个学号->添加到数组中
        //                                   有这个学号->打印已经有此学号了
        //数组已经满了->创建新数组->添加学生对象->判断是否已有学生学号->没有这个学号->添加到数组中
        //                                                  有这个学号->打印已经有此学号了

        //判断对象数组是否满了
        Student stu4 = new Student(4, "赵六", 20);
        //把stu4添加到数组中
        //学号有了吗?
        boolean flag = contain(arr, stu4.getId());
        if (flag) {
            //学号已有
            System.out.println("id已存在,无法添加");
        } else {
            //学号未有
            //数组满了吗?
            int length = getCount(arr);
            if (arr.length == length) {
                //数组已满
                //System.out.println("数组已经满了");
                //  定义一个新数组,再进行添加
                Student[] newArry = new Student[length + 1];
                for (int i = 0; i < arr.length; i++) {
                    newArry[i] = arr[i];
                }
                newArry[length] = stu4;

                printArr(newArry);
                System.out.println("请输入要删除的学生id信息");
                Scanner sc = new Scanner(System.in);
                int newId = sc.nextInt();
                boolean flag1 = contain(newArry,newId);
                if (flag1){

                }else {
                    System.out.println("id不存在,删除失败");
                }

            } else {
                //数组未满
                arr[length] = stu4;
                printArr(arr);

            }




        }

    }

    public static boolean contain(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                int sid = arr[i].getId();
                if (id == sid) {
                    return true;
                }
            }

        }
        return false;

    }
    //统计数组里面非空元素个数

    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;

            }
        }
        return count;
    }

    //遍历数组

    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getId() + "," + arr[i].getName() + "," + arr[i].getAge());
        }

    }


}
