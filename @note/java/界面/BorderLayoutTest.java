// 不会倒入包
package com;
import java.awt.*;
import java.io.IOException;

import javax.swing.*;
import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame{

       JButton northBtn = new JButton("北边的按钮");

       
        public BorderLayoutTest(){
            super("边界布局");

            // 获取面板
            Container contentPne= getContentPne();

            // 显示 ,大小
            setSize(600, 400); //单位px
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            // 大小不可改变
            setResizable(false);
            setVisible(true);
        }

    public static void main(String[] args)throws IOException{
        new BorderLayoutTest();
    }

   
}