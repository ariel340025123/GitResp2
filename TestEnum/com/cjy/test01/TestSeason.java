package com.cjy.test01;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/6 - 上午10:49
 * @Description: com.cjy.test01
 * @version: 1.0
 */
public class TestSeason {
    public static void main(String[] args) {
        Season autumn = Season.AUTUMN;
        System.out.println(autumn);
        Season winter = Season.WINTER;
        System.out.println(winter);
        System.out.println(winter.getSeasonName());
    }
}
