package StudentSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class UseTest {
    public static void main(String[] args) {
        ArrayList<Use> list = new ArrayList<Use>();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("*********************");
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作: 1登录 2注册 3忘记密码 4退出");
            System.out.println("*********************");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    //登陆
                    log(list);
                    break;
                case 2:
                    //注册
                    register(list);
                    break;
                case 3:
                    //忘记密码
                    break;
                case 4:
                    System.out.println("谢谢使用");
                    System.exit(0);
                    break;
                default:
                    System.out.println("没有该选项");
                    break;
            }
        }
    }

    //登陆
    private static void log(ArrayList<Use> list) {
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            //1，键盘录入用户名
            System.out.println("请输入用户名");
            String username = sc.next();
            //用户名如果未注册，直接结束方法，并提示：用户名未注册，请先注册
            int index = getIndex(list, username);
            if (index == -1) {
                System.out.println("用户名未注册,请先注册");
                return;
            }
            //2，键盘录入密码
            System.out.println("请输入用户密码");
            String password = sc.next();
            //3. 键盘录入验证码
            while (true) {
                String rightcode = yanzhengCode();
                System.out.println(rightcode);
                System.out.println("请输入验证码");
                String code = sc.next();
                if (code.equals(rightcode)) {
                    System.out.println("验证码输入成功");
                    break;
                } else {
                    System.out.println("验证码输入失败,请重新输入");
                }
            }
            //4.再判断用户名和密码是否正确，有3次机会

            Use u = list.get(index);

            if ((u.getUsername().equals(username)) && (u.getPassword().equals(password))) {
                System.out.println("登陆成功");
                break;
            } else {
                if (i == 2) {
                    System.out.println("用户已锁死,请联系管理员,电话xxx-xxxxxxx");
                    break;
                } else {
                    System.out.println("用户名或密码错误.还有" + (2 - i) + "次机会");
                }
            }
        }
    }

    //打印验证码
    private static String yanzhengCode() {
        Random r = new Random();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }
        //随机抽取四个字母
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            char c = list.get(index);
            sb.append(c);
        }
        int num = r.nextInt(10);
        sb.append(num);
        //数字可以出现在任意位置
        char[] array = sb.toString().toCharArray();
        int numIndex = r.nextInt(array.length);
        char temp = array[numIndex];
        array[numIndex] = array[array.length-1];
        array[array.length-1] = temp;

        String str = new String(array);
        return str;
    }

    //注册
    public static void register(ArrayList<Use> list) {
        Scanner sc = new Scanner(System.in);
        //输入用户名
        String name;
        while (true) {
            System.out.println("请输入用户名");
            name = sc.next();
            boolean flag = checkUsername(list, name);
            if (flag) {
                System.out.println("用户名添加成功");
                break;
            } else {
                System.out.println("用户名输入失败,请重新输入");
            }
        }
        //输入用户密码
        String password;
        while (true) {
            System.out.println("请输入密码");
            password = sc.next();
            System.out.println("请再次输入密码");
            String password1 = sc.next();
            if (password1.equals(password)) {
                System.out.println("用户密码设置成功!");
                break;
            } else {
                System.out.println("两次密码输入不一致,请重新输入");
            }
        }
        //输入身份证号码
        String id;
        while (true) {
            System.out.println("请输入身份证号码");
            id = sc.next();
            boolean flag = checkUserid(id);
            if (flag) {
                System.out.println("id验证成功");
                break;
            } else {
                System.out.println("id验证失败,请重新输入");
            }

        }
        //输入手机号码
        String phonenum;
        while (true) {
            System.out.println("请输入手机号");
            phonenum = sc.next();
            boolean flag = checkPhonenum(phonenum);
            if (flag) {
                System.out.println("手机号验证成功");
                break;
            } else {
                System.out.println("手机号验证失败,请重新输入");
            }


        }
        Use u = new Use(name, password, id, phonenum);
        list.add(u);
        System.out.println("注册成功");
        print(list);

    }

    //打印集合
    private static void print(ArrayList<Use> list) {
        for (int i = 0; i < list.size(); i++) {
            Use u = list.get(i);
            System.out.println("用户名为:" + u.getUsername() + ", " + "用户密码为:" + u.getPassword() + ", "
                    + "用户身份证号位:" + u.getId() + ", " + "用户手机号为:" + u.getPassword());
        }
    }

    //验证手机号
    private static boolean checkPhonenum(String phonenum) {
        //长度为11位
        if (phonenum.length() != 11) {
            return false;
        }
        //不能以0为开头
        if (phonenum.charAt(0) == '0') {
            return false;
        }
        //必须都是数字
        boolean flag = nameshuzi(phonenum);
        if (!flag) {
            return false;
        }
        return true;
    }

    //验证身份号码
    private static boolean checkUserid(String id) {
        //长度为18位
        if (id.length() != 18) {
            System.out.println("身份证号码必须为18位");
            return false;
        }
        //不能以0为开头
        if (id.charAt(0) == '0') {
            System.out.println("身份证号码不能以0为开头");
            return false;
        }
        //前17位，必须都是数字
        for (int i = 0; i < id.length() - 1; i++) {
            char c = id.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                System.out.println("前17位，必须都是数字");
                return false;
            }
        }
        //最为一位可以是数字，也可以是大写X或小写x
        char endchar = id.charAt(id.length() - 1);
        if (!((endchar >= '0' && endchar <= '9') || (endchar == 'x') || (endchar == 'X'))) {
            System.out.println("最后一位输入错误");
            return false;
        }
        return true;
    }

    //验证用户名
    private static boolean checkUsername(ArrayList<Use> list, String name) {
        //用户名唯一
        int index = getIndex(list, name);
        if (index != -1) {
            System.out.println("用户名已经存在");
            return false;
        }
        // 用户名长度必须在3~15位之间
        if ((name.length() < 3) || (name.length() > 15)) {
            System.out.println("用户名长度必须在3~15位之间");
            System.out.println();
            return false;
        }
        //只能是字母加数字的组合，但是不能是纯数字

        //检查是否为字母+数字组合
        boolean flag = namezuhe(name);
        if (!flag) {
            System.out.println("用户名必须为字母和数字组合");
            System.out.println();
            return false;
        }
        //检查是否为纯数字
        boolean flag1 = nameshuzi(name);
        if (flag1) {
            System.out.println("用户名不能为纯数字,必须为数字字母组合");
            System.out.println();
            return false;
        }

        //满足全部要求
        return true;


    }

    //检查是否为纯数字
    private static boolean nameshuzi(String name) {
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                //不是纯数字返回false
                return false;
            }
        }
        //是纯数字返回true
        return true;
    }

    //检查是否为字母+数字组合
    private static boolean namezuhe(String name) {
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (!((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {

                return false;
            }

        }
        return true;
    }

    //判断是否用户名已经存在,返回下标索引
    public static int getIndex(ArrayList<Use> list, String usename) {
        for (int i = 0; i < list.size(); i++) {
            Use u = list.get(i);
            if (usename.equals(u.getUsername())) {
                return i;
            }
        }
        return -1;
    }


}
