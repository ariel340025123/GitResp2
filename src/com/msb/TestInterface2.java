package com.msb;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2020/12/23 - 下午3:38
 * @Description: com.msb
 * @version: 1.0
 */
public interface TestInterface2 {
    public static final int NUM = 10;

    public abstract void a();
    public default void b() {
        System.out.println("-----TestInterface2---b");
    }
    public static void c(){
        System.out.println("TestInterface2中的静态方法");
    }
}

class Demo implements TestInterface2 {
    @Override
    public void a() {
        System.out.println("重写了a方法");
    }

    public static void c(){
        System.out.println("Demo中的静态方法");
    }
}

class A {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.c();
        Demo.c();
        TestInterface2.c();
    }
}
