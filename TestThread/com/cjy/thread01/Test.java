package com.cjy.thread01;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/4 - 上午11:49
 * @Description: com.cjy.thread01
 * @version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        BuyTicketThread tt = new BuyTicketThread();

        Thread t1 = new Thread(tt, "窗口1");
        t1.start();
        Thread t2 = new Thread(tt, "窗口2");
        t2.start();
        Thread t3 = new Thread(tt, "窗口3");
        t3.start();
    }
}
