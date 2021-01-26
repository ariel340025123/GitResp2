package com.cjy.test02;

import java.io.Serializable;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/7 - 上午9:50
 * @Description: com.cjy.test02
 * @version: 1.0
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 1109283666516401085L;
    //属性
    private int age;
    public String name;
    //方法
    private void eat(){
        System.out.println("Person---eat");
    }
    public void sleep(){
        System.out.println("Person---sleep");
    }
}
