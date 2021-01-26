package com.cjy.thread05;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/4 - 下午5:19
 * @Description: com.cjy.thread04
 * @version: 1.0
 */
public class ProducerThread2 extends Thread{//生产者线程

    private Product2 p;

    public ProducerThread2(Product2 p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                p.setProduct("费罗列","巧克力");
            } else {
                p.setProduct("哈尔滨", "啤酒");
            }
        }
    }
}
