package com.msb;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2020/12/23 - 下午3:20
 * @Description: com.msb
 * @version: 1.0
 */
public interface TestInterface {
    //常亮
    public static final int NUM = 10;
    //方法
    public abstract void a();
    public default void b(){
        System.out.println("-----TestInterface");
    }

    class Test implements TestInterface {
        public void c(){
            b();
            TestInterface.super.b();
        }

        @Override
        public void a() {

        }

        @Override
        public void b() {

        }
    }
}
