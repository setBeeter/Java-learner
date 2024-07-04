package Video;

import java.util.ArrayList;

public class StudentTest {

    public static void main(String[] args) {
        //创建对象
        Student s1 = new Student("zhangsan", 16);
        Student s2 = new Student("lisi", 15);
        Student s3 = new Student("wangwu", 18);

        //创建集合对象
        ArrayList<Student> stu = new ArrayList<>();

        //将对象存储到集合对象中去
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);

       int index= findId(stu,18);
       if (index>=0){
           System.out.println();
       }
       else {

       }


        /*
           需求：
    1，main方法中定义一个集合，存入三个用户对象。

      用户属性为：id，username，password

   2，要求：定义一个方法，根据id查找对应的学生信息。

      如果存在，返回索引

      如果不存在，返回-1
代码示例：
         */


    }

    public static int findId(ArrayList<Student> stu, int age) {
        for (int i = 0; i < stu.size(); i++) {
            if (stu.get(i).getAge()==age) {
                return i;
            }
        }
        return -1;



    }
}
