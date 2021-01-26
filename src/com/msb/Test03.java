package com.msb;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2020/12/22 - 下午4:31
 * @Description: com.msb
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        Gril g = new Gril();

        Pig p = new Pig();
        Animal an = p;

        g.play(an);
    }
}
