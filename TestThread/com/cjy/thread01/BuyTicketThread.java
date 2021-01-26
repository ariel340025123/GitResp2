package com.cjy.thread01;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/4 - 上午11:49
 * @Description: com.cjy.thread01
 * @version: 1.0
 */
public class BuyTicketThread implements Runnable {
    int ticketNum = 10;
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            synchronized (this) {
                if (ticketNum > 0) {
                    System.out.println("我在"+Thread.currentThread().getName()+"买到了从北京到哈尔滨的第" + ticketNum-- + "张车票");
                }
            }
        }
    }
}
