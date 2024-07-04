package ClassTest5;

public class StudentTest4 {
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

        //查询数组id为2的学生,如果存在,将年龄+1岁
        //id为2是否存在
        int index=getIndex(arr,4);
        if (index>=0){
            //存在
            //  年龄加一
            int newAge=arr[index].getAge()+1;
            arr[index].setAge(newAge);
        }
        else {
            //不存在
            //失败+1
            System.out.println("id不存在,修改失败");
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
