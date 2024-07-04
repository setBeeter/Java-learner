package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;


public class GameJframe extends JFrame implements KeyListener, ActionListener {
    //记录空白方格的位置
    int x = 0;
    int y = 0;
    //初始化碎片图片的下标
    int[][] arr = new int[4][4];
    //存储胜利图片的下标
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    //统计步数
    int step = 0;
    //图片路径
    String path = "day16-code\\image\\girl\\girl6\\";
    //抽取代码,避免重复书写
    Random r = new Random();
    //创建菜单上的条目
    //  重新游戏 重新登陆 关闭游戏 美女 动物 运动
    JMenuItem regame = new JMenuItem("重新游戏");
    JMenuItem relogin = new JMenuItem("重新登陆");
    JMenuItem closegaem = new JMenuItem("关闭游戏");
    JMenuItem girl = new JMenuItem("美女");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");
    JMenuItem account = new JMenuItem("公众号");


    //设置游戏页面
    public GameJframe() {
        //初始化页面
        initJFrame();
        //初始化菜单
        initJMenu();
        //初始化数据
        initData();
        //初始化图片(打乱)
        initImag();
        // 显示页面
        this.setVisible(true);
    }

    //初始化页面
    private void initJFrame() {
        this.setSize(603, 680);
        //设置页面标题
        this.setTitle("拼图游戏单机版 v1.0");
        //设置页面置顶
        this.setAlwaysOnTop(true);
        //设置页面居中
        this.setLocationRelativeTo(null);
        //设置页面关闭
        this.setDefaultCloseOperation(3);
        //取消默认居中
        this.setLayout(null);
        // 在页面设置上添加键盘监听
        this.addKeyListener(this);
    }

    //初始化菜单
    private void initJMenu() {
        //初始化菜单
        JMenuBar jb = new JMenuBar();
        //创建菜单上的两个选项
        JMenu function = new JMenu("功能");
        JMenu aboutus = new JMenu("关于我们");
        JMenu photho = new JMenu("更换图片");
        //将条目添加到选项上
        function.add(regame);
        function.add(relogin);
        function.add(closegaem);
        function.add(photho);
        photho.add(girl);
        photho.add(animal);
        photho.add(sport);
        aboutus.add(account);
        //将选项添加到菜单上
        jb.add(function);
        jb.add(aboutus);
        //将条目绑定监听事件
        regame.addActionListener(this);
        relogin.addActionListener(this);
        closegaem.addActionListener(this);
        account.addActionListener(this);
        girl.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);
        //把菜单放置到页面中
        this.setJMenuBar(jb);

    }

    //初始化数据
    private void initData() {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < a.length; i++) {
            int index = r.nextInt(a.length);
            int temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }
        //添加到二维数组中
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            arr[i / 4][i % 4] = a[i];
        }
    }

    //初始化图片(打乱)
    private void initImag() {
        //清空原本的图片
        this.getContentPane().removeAll();
        //显示步数
        JLabel jstep = new JLabel("步数:" + step);
        jstep.setBounds(50, 30, 100, 30);
        this.getContentPane().add(jstep);
        //判断是否胜利
        if (victory()) {
            ImageIcon vi = new ImageIcon("day16-code\\image\\win.png");
            JLabel winj = new JLabel(vi);
            winj.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winj);
        }


        //初始化并打乱图片
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = arr[i][j];
                //创建ImagIcon对象
                ImageIcon icon = new ImageIcon(path + num + ".jpg");
                //创建Jlable对象
                JLabel jLabel = new JLabel(icon);
                //添加图片的边框
                jLabel.setBorder(new BevelBorder(0));
                //设置添加图片的位置
                jLabel.setBounds(j * 105 + 83, i * 105 + 134, 105, 105);
                //将Jlabe对象添加到菜单中
                this.getContentPane().add(jLabel);
            }
        }
        //添加背景图片
        ImageIcon background = new ImageIcon("day16-code\\image\\background.png");
        JLabel jbakground = new JLabel(background);
        jbakground.setBounds(40, 40, 508, 560);
        //添加背景图片的边框
        jbakground.setBorder(new BevelBorder(0));
        this.getContentPane().add(jbakground);
        //刷新图片
        this.getContentPane().repaint();

    }

    //判断是否胜利
    public boolean victory() {


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }


    //重写KeyListener的方法
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    //按住a不松,查看完整图片
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        //a为65
        if (code == 65) {
            //清空原有图片
            this.getContentPane().removeAll();
            //加载完整图片
            ImageIcon whole = new ImageIcon(path + "all.jpg");
            JLabel jLabel = new JLabel(whole);
            jLabel.setBounds(83, 134, 420, 420);
            this.getContentPane().add(jLabel);
            //加载背景图片
            ImageIcon background = new ImageIcon("day16-code\\image\\background.png");
            JLabel jbakground = new JLabel(background);
            jbakground.setBounds(40, 40, 508, 560);
            this.getContentPane().add(jbakground);
            //刷新  (验证不写可以吗?)
            this.getContentPane().repaint();
        }
    }

    @Override
    //进行左右上下移动
    public void keyReleased(KeyEvent e) {
        //胜利之后,不能再进行上下左右移动
        if (victory()) {
            return;
        }
        int code = e.getKeyCode();
        //左：37 上：38 右：39 下：40
        if (code == 37) {
            if (y == 0) {
                return;
            }
            System.out.println("向左移动");
            //左移
            //空白位置左边的图片与它叫唤位置
            //x,y-1 与x,y交换位置
            arr[x][y] = arr[x][y - 1];
            arr[x][y - 1] = 0;
            //更新空白图片下表
            y--;
            step++;

            initImag();

        } else if (code == 38) {
            if (x == 0) {
                return;
            }
            //上移
            System.out.println("向上移动");
            arr[x][y] = arr[x - 1][y];
            arr[x - 1][y] = 0;
            //更新空白图片下表
            x--;
            step++;

            initImag();

        } else if (code == 39) {
            if (y == 3) {
                return;
            }
            System.out.println("向右移动");
            //右移
            arr[x][y] = arr[x][y + 1];
            arr[x][y + 1] = 0;
            //更新空白图片下表
            y++;
            step++;

            initImag();
        } else if (code == 40) {
            if (x == 3) {
                return;
            }
            //下移
            System.out.println("向下移动");
            arr[x][y] = arr[x + 1][y];
            arr[x + 1][y] = 0;
            //更新空白图片下表
            x++;
            step++;
            initImag();
        } else if (code == 65) {
            initImag();
        }
        //按w 一键通关
        else if (code == 87) {
            System.out.println("已输入作弊码,一键通关");
            arr = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0,}
            };

            initImag();

        }

    }

    //重写ActionListener的方法
    @Override
    public void actionPerformed(ActionEvent e) {
        Object c = e.getSource();
        if (c == regame) {
            System.out.println("重新开始游戏");
            step = 0;
            initData();
            initImag();
        } else if (c == relogin) {
            System.out.println("重新登陆");
            this.setVisible(false);
            new LoginJframe();
        } else if (c == closegaem) {
            System.out.println("关闭游戏");
            System.exit(0);
        }
        else if (c == account) {
            System.out.println("公众号");
            ImageIcon acc = new ImageIcon("C:\\Users\\王大壮\\IdeaProjects\\base-code\\day16-code\\image\\about.png");
            //把图片加载到管理区
            JLabel jLabel = new JLabel(acc);
            //设置位置和宽高
            jLabel.setBounds(0, 0, 258, 258);
            //创建弹窗对象
            JDialog jDialog = new JDialog();
            //把管理区加载到弹窗里面
            jDialog.getContentPane().add(jLabel);
            //设置弹窗大小
            jDialog.setSize(344, 344);
            //设置弹窗居中
            jDialog.setAlwaysOnTop(true);
            //设置弹窗置顶
            jDialog.setLocationRelativeTo(null);
            //弹窗显示出来
            jDialog.setVisible(true);
        }
        else if (c==girl){
            //设置随机数1-13 修改路径
            //重新加载图片
            int index = r.nextInt(13)+1;
            path = "day16-code\\image\\girl\\girl"+index+"\\";
            initData();
            initImag();
        }
        else if (c==animal){
            int index = r.nextInt(8)+1;
            path = "day16-code\\image\\animal\\animal"+index+"\\";
            initData();
            initImag();
        }
        else if (c==sport){
            int index = r.nextInt(10)+1;
            path = "day16-code\\image\\sport\\sport"+index+"\\";
            initData();
            initImag();
        }


    }
}
