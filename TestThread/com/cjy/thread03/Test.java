package com.cjy.thread03;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/4 - 下午4:19
 * @Description: com.cjy.thread03
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        TestThread tt = new TestThread();
        TestThread tt2 = new TestThread();
        tt.flag = 1;
        tt2.flag = 0;

        Thread t1 = new Thread(tt);
        Thread t2 = new Thread(tt2);
        t1.start();
        t2.start();
    }
}
