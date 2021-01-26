package com.cjy.thread04;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/4 - 下午5:29
 * @Description: com.cjy.thread04
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Product p = new Product();

        ProducerThread pt = new ProducerThread(p);
        CustomerThread ct = new CustomerThread(p);

        pt.start();
        ct.start();
    }
}
