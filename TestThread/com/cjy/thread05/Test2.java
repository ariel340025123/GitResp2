package com.cjy.thread05;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/4 - 下午5:29
 * @Description: com.cjy.thread04
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        Product2 p2 = new Product2();

        ProducerThread2 pt = new ProducerThread2(p2);
        CustomerThread2 ct = new CustomerThread2(p2);

        pt.start();
        ct.start();
    }
}
