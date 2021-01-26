package com.cjy.test01;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/6 - 下午5:08
 * @Description: com.cjy.test01
 * @version: 1.0
 */
public class WeChatPay implements Mtwm {
    @Override
    public void payOnline() {
        System.out.println("我已经点了外卖，正在使用微信支付");
    }
}
