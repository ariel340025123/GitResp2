package com.msb;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2020/12/18 - 上午11:34
 * @Description: com.msb
 * @version: 1.0
 */
public class Test01 implements Serializable {

//    private static final long serialVersionUID = 3474692626855209143L;

    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        int a = 10;
        try {
            System.out.println();
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Date();

        System.out.println(Arrays.toString(new int[]{1, 2, 3}));

    }
}
