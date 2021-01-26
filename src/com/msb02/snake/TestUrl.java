package com.msb02.snake;

import java.net.URL;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2020/12/24 - 下午2:56
 * @Description: com.msb02.snake
 * @version: 1.0
 */
public class TestUrl {
    public static void main(String[] args) {
        URL url = Images.class.getResource("/");
        System.out.println(url);
    }
}
