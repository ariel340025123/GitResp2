package com.cjy.thread05;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/4 - 下午5:27
 * @Description: com.cjy.thread04
 * @version: 1.0
 */
public class CustomerThread2 extends Thread {//消费者进程
    private Product2 p;

    public CustomerThread2(Product2 p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            p.getProduct();
        }
    }
}
