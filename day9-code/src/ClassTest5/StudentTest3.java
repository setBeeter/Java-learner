package ClassTest5;

import java.util.Scanner;

public class StudentTest3 {
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


        System.out.println("请输入要删除的学生id信息");
        Scanner sc = new Scanner(System.in);
        int newId = sc.nextInt();
        int index = getIndex(arr, newId);
        System.out.println(index);
        if (index >= 0) {
            arr[index] = null;
        } else {
            System.out.println("id不存在,删除失败");
        }

        printArr(arr);


    }

    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getId() == id) {
                    return i;
                }
            }
        }
        return -1;

    }

    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].getId() + "," + arr[i].getName() + "," + arr[i].getAge());
            }
        }

    }

}