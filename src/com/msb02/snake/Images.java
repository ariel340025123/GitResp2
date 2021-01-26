package com.msb02.snake;

import javax.swing.*;
import java.net.URL;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2020/12/24 - 下午2:55
 * @Description: com.msb02.snake
 * @version: 1.0
 */
public class Images {
    //将图片的路径封装为一个对象：
    public static URL bodyURL = Images.class.getResource("/com/msb02/image/body.png");
    //将图片封装为程序中一个对象：
    public static ImageIcon bodyImg = new ImageIcon(bodyURL);
    //将图片的路径封装为一个对象：
    public static URL downURL = Images.class.getResource("/com/msb02/image/down.png");
    //将图片封装为程序中一个对象：
    public static ImageIcon downImg = new ImageIcon(downURL);
    //将图片的路径封装为一个对象：
    public static URL foodURL = Images.class.getResource("/com/msb02/image/food.png");
    //将图片封装为程序中一个对象：
    public static ImageIcon foodImg = new ImageIcon(foodURL);
    //将图片的路径封装为一个对象：
    public static URL headerURL = Images.class.getResource("/com/msb02/image/header.png");
    //将图片封装为程序中一个对象：
    public static ImageIcon headerImg = new ImageIcon(headerURL);
    //将图片的路径封装为一个对象：
    public static URL leftURL = Images.class.getResource("/com/msb02/image/left.png");
    //将图片封装为程序中一个对象：
    public static ImageIcon leftImg = new ImageIcon(leftURL);
    //将图片的路径封装为一个对象：
    public static URL rightURL = Images.class.getResource("/com/msb02/image/right.png");
    //将图片封装为程序中一个对象：
    public static ImageIcon rightImg = new ImageIcon(rightURL);
    //将图片的路径封装为一个对象：
    public static URL upURL = Images.class.getResource("/com/msb02/image/up.png");
    //将图片封装为程序中一个对象：
    public static ImageIcon upImg = new ImageIcon(upURL);
}
