package com.itheima.ui;

import javax.swing.*;

public class LoginJframe extends JFrame {
    //设置登陆页面
    public LoginJframe(){
        this.setSize(488,430);
        //设置页面标题
        this.setTitle("拼图 登陆");
        //设置页面居中
        this.setLocationRelativeTo(null);
        //设置页面置顶
        this.setAlwaysOnTop(true);
        //设置页面关闭
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }
}
