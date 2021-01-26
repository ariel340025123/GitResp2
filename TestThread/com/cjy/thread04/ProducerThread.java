package com.cjy.thread04;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/4 - 下午5:19
 * @Description: com.cjy.thread04
 * @version: 1.0
 */
public class ProducerThread extends Thread{//生产者线程

    private Product p;

    public ProducerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            synchronized (p) {
                if (i % 2 == 0) {
                    p.setBrand("费列罗");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    p.setName("巧克力");
                } else {
                    p.setBrand("哈尔滨");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    p.setName("啤酒");
                }
                System.out.println("生产者生产了：" + p.getBrand() + "----" + p.getName());
            }
        }
    }
}
