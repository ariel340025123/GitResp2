package com.cjy.thread06;

import com.cjy.thread05.Product2;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/4 - 下午9:02
 * @Description: com.cjy.thread06
 * @version: 1.0
 */
public class CustomerThread3 extends Thread{
    private Product3 p;

    public CustomerThread3(Product3 p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            p.getProduct();
        }
    }
}
