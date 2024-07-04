package com.itheima.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    //设置注册页面
    public RegisterJFrame(){
        this.setSize(488,500);
        //设置标题
        this.setTitle("拼图 注册");
        //页面居中
       this.setLocationRelativeTo(null);
        //页面置顶
        this.setAlwaysOnTop(true);
        //页面关闭
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }
}
