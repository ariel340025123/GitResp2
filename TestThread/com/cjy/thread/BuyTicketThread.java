package com.cjy.thread;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/4 - 上午10:30
 * @Description: com.cjy.thread
 * @version: 1.0
 */
public class BuyTicketThread extends Thread {

    static int ticketNum = 10;
    @Override
    public void run() {
//        super.run();
        for (int i = 0; i <= 100; i++) {
            //第一种方式
//            synchronized (BuyTicketThread.class) {
//                if (ticketNum > 0) {
//                    System.out.println("我在"+this.getName()+"买到了从北京到哈尔滨的第" + ticketNum-- + "张车票");
//                }
//            }
            //第二种用方法的形式做同步代码
            buyTicket();
        }
    }

    public static synchronized void buyTicket() {
            if (ticketNum > 0) {
                System.out.println("我在" + Thread.currentThread().getName() + "买到了从北京到哈尔滨的第" + ticketNum-- + "张车票");
            }
    }

    public BuyTicketThread(String name) {
        super(name);
    }
}
