package com.cjy.thread06;

import com.cjy.thread05.Product2;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/4 - 下午9:03
 * @Description: com.cjy.thread06
 * @version: 1.0
 */
public class ProducerThread3 extends Thread{
    private Product3 p;

    public ProducerThread3(Product3 p) {
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
