package com.msb02.snake;

import javax.swing.*;
import java.awt.*;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2020/12/24 - 下午3:20
 * @Description: com.msb02.snake
 * @version: 1.0
 */
public class StartGame {
    public static void main(String[] args) {
        //创建一个窗体
        JFrame jf = new JFrame();
        //给窗体设置一个标题
        jf.setTitle("小游戏 贪吃蛇");
        //设置窗体弹出的坐标，对应窗体的宽高
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        jf.setBounds((width-800)/2, (height-800)/2, 800, 800);
        //设置窗体大小不可调节
        jf.setResizable(false);
        //关闭窗口的同时，程序随之关闭
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //创建面板
        GamePanel gp = new GamePanel();
        //将面板放入窗体
        jf.add(gp);
        //默认情况下窗体是隐藏效果，必须将窗体进行显现
        jf.setVisible(true);
    }
}
