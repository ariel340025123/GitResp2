package com.cjy.test03;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/6 - 上午10:59
 * @Description: com.cjy.test02
 * @version: 1.0
 */
public class TestSeason {
    public static void main(String[] args) {
//        Season winter = Season.WINTER;
//        System.out.println(winter);
//        System.out.println("--------------------");
//        com.cjy.test03.Season[] values = com.cjy.test03.Season.values();
//        for (com.cjy.test03.Season s : values) {
//            System.out.println(s);
//        }
//        com.cjy.test03.Season autumn = com.cjy.test03.Season.valueOf("AUTUMN");
//        System.out.println(autumn);
        Season autumn = Season.AUTUMN;
        autumn.show();
        Season summer = Season.SUMMER;
        summer.show();
        Season winter = Season.WINTER;
        winter.show();
    }
}
