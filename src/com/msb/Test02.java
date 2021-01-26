package com.msb;

import java.util.Arrays;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2020/12/18 - 下午4:12
 * @Description: com.msb
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
//        int age = 10;
//        System.out.println("helloworld");
//        String str = "abc";
//        System.out.println(str);
////        Student stu = new Student();
        for (int i = 0; i < 100; i++) {
            System.out.println("i");
        }
        int a = 10;
        int b = 20;
        int c = 30;
        int[] arr = new int[4];
        arr[0] = 11;
        arr[1] = 56;
        arr[2] = 98;
        arr[3] = 66;
        Arrays.toString(arr);
        int d = eat();
        System.out.println(d);
    }

    public static int eat(){
        System.out.println("-----1");
        System.out.println("-----2");
        System.out.println("-----3");
        System.out.println("-----4");
        return 10;
    }
}
