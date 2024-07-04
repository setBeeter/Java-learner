package Test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SplittableRandom;

public class BookTest {
    public static void main(String[] args) {
        /*
        菜单:
        1 : 添加图书
        2 : 查询图书
        3: 根据书名查询图书信息
        4: 删除图书(通过编号)
        5: 修改图书信息
        6:推出系统
         */
        ArrayList<Book> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("*********************");
            System.out.println("1:添加图书信息");
            System.out.println("2:打印所有图书信息");
            System.out.println("3:查询图书信息");
            System.out.println("4:删除图书信息");
            System.out.println("5:修改图书信息");
            System.out.println("6:退出图书管理系统");
            System.out.println("*********************");
            System.out.println("请输入要进行的操作");
            Scanner sc = new Scanner(System.in);
            //定义对象和集合

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    //添加图书信息
                    add(list);
                    break;
                case 2:
                    //打印所有图书信息
                    print(list);
                    break;
                case 3:
                    //查询图书信息
                    System.out.println("请输入图书名字");
                    String name = sc.next();
                    find(list, name);
                    break;
                case 4:
                    //删除图书信息
                    System.out.println("请输入要删除的图书编号");
                    String id = sc.next();
                    delete(list, id);
                    break;

                case 5:
                    //修改图书信息
                    System.out.println("请输入要修改图书的编号");
                    String id1 = sc.next();
                    update(list,id1);
                    break;
                case 6:
                    //6:退出图书管理系统
                    System.out.println("感谢使用,再见");
                    System.exit(0);
                default:
                    System.out.println("没有此选项,请重新输入");
                    break;
            }
        }
    }

    // 添加
    public static void add(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();
        /*
        编号，书名，作者，价格
         */
        System.out.println("请输入要添加的书籍编号");
        String id = sc.next();
        //唯一编号
        int index = getIndex(list, id);
        if (index >= 0) {
            System.out.println("已有图书id,添加失败");
        } else {
            System.out.println("请输入要添加的图书名");
            String name = sc.next();
            System.out.println("请输入要添加的图书作者");
            String author = sc.next();
            System.out.println("请输入要添加放入图书价格");
            String price = sc.next();

            b.setId(id);
            b.setName(name);
            b.setAuthor(author);
            b.setPrice(price);

            list.add(b);
            System.out.println("图书信息添加成功!");
        }


    }
    //  打印
    public static void print(ArrayList<Book> list) {
        System.out.println("图书编号\t" + "书名\t\t" + "作者\t" + "价格\t");
        for (int i = 0; i < list.size(); i++) {
            Book b = list.get(i);
            //编号，书名，作者，价格
            System.out.println(b.getId() + " " + b.getName() + " " + b.getAuthor() + " " + b.getPrice());
        }


    }
    //查找  可以根据书名，查询单本图书信息，显示信息后，返回到菜单。
    public static void find(ArrayList<Book> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            Book b = list.get(i);
            if (b.getName().equals(name)) {
                System.out.println("图书编号\t" + "书名\t\t" + "作者\t" + "价格\t");
                System.out.println(b.getId() + " " + b.getName() + " " + b.getAuthor() + " " + b.getPrice());
                return;
            }
        }
        System.out.println("没有查询到图书信息");

    }
    //删除  通过编号删除
    public static void delete(ArrayList<Book> list, String id) {
        int index = getIndex(list, id);
        if (index >= 0) {
            list.remove(index);
            System.out.println("删除成功");
        } else {
            System.out.println("图书系统里没有此编号,删除失败");
        }


    }
    //查找指定编号的图书, 返回索引
    public static int getIndex(ArrayList<Book> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Book b = list.get(i);
            if (b.getId().equals(id)) {
                return i;
            }
        }
        return -1;

    }
    //修改图书信息 可以修改图书的信息，但编号不可以修改
    public static void update(ArrayList<Book> list, String id) {
        int index = getIndex(list,id);
        if (index>=0){
            Book b =list.get(index);
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入要修改的图书名称");
            String name = sc.next();
            System.out.println("请输入要修改的图书作者");
            String atuhor = sc.next();
            System.out.println("请输入要修改的图书价格");
            String price = sc.next();

            b.setName(name);
            b.setAuthor(atuhor);
            b.setPrice(price);

            System.out.println("修改成功");
        }
        else {
            System.out.println("查询不到此编号的图书,修改失败");
        }

    }


}
