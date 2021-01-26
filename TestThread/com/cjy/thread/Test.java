package com.cjy.thread;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/4 - 上午10:33
 * @Description: com.cjy.thread
 * @version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        BuyTicketThread tt1 = new BuyTicketThread("窗口1");
        tt1.start();
        BuyTicketThread tt2 = new BuyTicketThread("窗口2");
        tt2.start();
        BuyTicketThread tt3 = new BuyTicketThread("窗口3");
        tt3.start();
    }
}
