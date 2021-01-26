package com.msb02.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2020/12/24 - 下午3:59
 * @Description: com.msb02.snake
 * @version: 1.0
 */
public class GamePanel extends JPanel {
    //定义2个数组
    //蛇的长度
    int length;
    int[] snakeX = new int[200];
    int[] snakeY = new int[200];
    //蛇行走的方向
    String direction;
    //游戏只有两个状态，开始、暂停
    boolean isStart = false;
    //定义蛇的行走方向，加入计时器
    Timer timer;
    //定义食物的x,y轴坐标
    int foodX;
    int foodY;
    //定义一个积分
    int score;
    //默认情况下小蛇没有死亡
    boolean isDie = false;
    public void init() {
        length = 3;

        snakeX[0] = 175;
        snakeY[0] = 275;

        snakeX[1] = 150;
        snakeY[1] = 275;

        snakeX[2] = 125;
        snakeY[2] = 275;

        direction = "R";

        foodX = 300;
        foodY = 200;
    }

    public GamePanel() {
        init();
        //将焦点定位在当前操作的面板上
        this.setFocusable(true);
        //加入监听
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int keycode = e.getKeyCode();
                if (keycode == KeyEvent.VK_SPACE) {
                    if (isDie) {
                        init();
                        isDie = false;
                    } else {
                        isStart = !isStart;
                        repaint(); //重新绘制
                    }
                }
                //监听上下左右方向行动
                if (keycode == KeyEvent.VK_UP) {
                    direction = "U";
                }
                if (keycode == KeyEvent.VK_DOWN) {
                    direction = "D";
                }
                if (keycode == KeyEvent.VK_LEFT) {
                    direction = "L";
                }
                if (keycode == KeyEvent.VK_RIGHT) {
                    direction = "R";
                }
            }
        });
        //对计时器进行初始化动作
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isStart && isDie == false) {
                    //后一节身子走到前一节身子的位置上
                    for (int i = length - 1; i > 0; i--) {
                        snakeX[i] = snakeX[i-1];
                        snakeY[i] = snakeY[i-1];
                    }
                    //动头
//                    snakeX[0] += 25;
                    //动起来
                    if ("R".equals(direction)) {
                        snakeX[0] += 25;
                    }
                    if ("L".equals(direction)) {
                        snakeX[0] -= 25;
                    }
                    if ("U".equals(direction)) {
                        snakeY[0] -= 25;
                    }
                    if ("D".equals(direction)) {
                        snakeY[0] += 25;
                    }
                    //防止蛇出边界
                    if (snakeX[0] > 750) {
                        snakeX[0] = 25;
                    }
                    if (snakeX[0] < 25) {
                        snakeX[0] = 750;
                    }
                    if (snakeY[0] < 100) {
                        snakeY[0] = 725;
                    }
                    if (snakeY[0] > 725) {
                        snakeY[0] = 100;
                    }
                    //加测碰撞的动作，食物的坐标和蛇头的坐标一致的时候才能碰撞
                    if (snakeX[0] == foodX && snakeY[0] == foodY) {
                        length++;
                        foodX = (int)(Math.random()*30+1)*25; //[25, 750]
                        foodY = (new Random().nextInt(26)+4)*25; //[100, 725]
                        score += 10; //吃上食物以后积分加10
                    }
                    //死亡判定，如果和任意一节身子碰撞，则判定小蛇死亡
                    for (int i = 1; i < length; i++) {
                        if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                            isDie = true;
                        }
                    }
                    repaint();//重新绘制
                }
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //填充背景颜色
        this.setBackground(new Color(208,220,226));
        //添加头部图片 paintIcon四个参数：this指的是当前面板  g:指的是使用的画笔  x,y对应的坐标
        Images.headerImg.paintIcon(this, g, 10, 10);
        //调画笔颜色
        g.setColor(new Color(219,226,219));
        //画一个矩形
        g.fillRect(10,70,770,685);

        //画小蛇
        if ("R".equals(direction)) {
            Images.rightImg.paintIcon(this, g, snakeX[0], snakeY[0]);
        } else if ("L".equals(direction)) {
            Images.leftImg.paintIcon(this, g, snakeX[0], snakeY[0]);
        } else if ("U".equals(direction)) {
            Images.upImg.paintIcon(this, g, snakeX[0], snakeY[0]);
        } else if ("D".equals(direction)) {
            Images.downImg.paintIcon(this, g, snakeX[0], snakeY[0]);
        }
//        Images.rightImg.paintIcon(this, g, snakeX[0], snakeY[0]);
        //画蛇身的长度
        for (int i = 1; i < length; i++) {
            Images.bodyImg.paintIcon(this, g, snakeX[i], snakeY[i]);
        }
        //如果游戏暂停的，界面中应该有个提示语
        if (isStart == false) {
            g.setColor(new Color(114, 98, 255));
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            g.drawString("点击空格开始游戏", 250, 330);
        }
        //画食物
        Images.foodImg.paintIcon(this, g, foodX, foodY);
        //画积分
        g.setColor(new Color(255, 248, 248));
        g.setFont(new Font("微软雅黑",Font.BOLD,20));
        g.drawString("积分："+score,620,40);
        //画入死亡状态：
        if(isDie){
            g.setColor(new Color(255, 82, 68));
            g.setFont(new Font("微软雅黑",Font.BOLD,20));
            g.drawString("小蛇死亡，游戏停止，按下空格重新开始游戏",200,330);
        }
    }
}
