package com.cjy.thread04;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/4 - 下午5:27
 * @Description: com.cjy.thread04
 * @version: 1.0
 */
public class CustomerThread extends Thread {//消费者进程
    private Product p;

    public CustomerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            synchronized (p) {
                System.out.println("消费者消费了：" + p.getBrand() +"----"+ p.getName());
            }
        }
    }
}
