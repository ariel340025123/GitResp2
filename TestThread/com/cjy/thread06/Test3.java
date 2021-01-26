package com.cjy.thread06;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/4 - 下午9:03
 * @Description: com.cjy.thread06
 * @version: 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        Product3 p3 = new Product3();

        ProducerThread3 pt = new ProducerThread3(p3);
        CustomerThread3 ct = new CustomerThread3(p3);

        pt.start();
        ct.start();
    }
}
