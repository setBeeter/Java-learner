package com.itheima.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Test extends JFrame {
    //实现鼠标监听 动作监听 键盘监听
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        //设置界面的宽高
        jFrame.setSize(603, 680);
        //设置界面的标题
        jFrame.setTitle("事件演示");
        //设置界面置顶
        jFrame.setAlwaysOnTop(true);
        //设置界面居中
        jFrame.setLocationRelativeTo(null);
        //设置关闭模式
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        jFrame.setLayout(null);


        //创建按钮对象
        JButton jbt = new JButton("点我呀!");
        //设置按钮大小  位置
        jbt.setBounds(50,50,150,200);
        //将按钮添加到页面中
        jFrame.getContentPane().add(jbt);

        //给按钮设置为鼠标监听

       jbt.addMouseListener(new MyMouseListener());




        //显示
        jFrame.setVisible(true);


    }

}
