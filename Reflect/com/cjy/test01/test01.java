package com.cjy.test01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/6 - 下午5:12
 * @Description: com.cjy.test01
 * @version: 1.0
 */
public class test01 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
////        String str = "微信支付";
////        String str = "支付宝支付";
////        if ("微信支付".equals(str)) {
//////            new WeChatPay().payOnline();
////            pay(new WeChatPay());
////        }
////
////        if ("支付宝支付".equals(str)) {
////            pay(new AliPay());
////        }
////
////        if ("银行卡支付".equals(str)) {
////            pay(new BankCardPay());
////        }
        String str = "com.cjy.test01.WeChatPay";
//        String str = "com.cjy.test01.AliPay";

        Class cls = Class.forName(str);
        Object o = cls.newInstance();
        Method method = cls.getMethod("payOnline");
        method.invoke(o);
    }

//    public static void pay(WeChatPay wc) {
//        wc.payOnline();
//    }
//
//    public static void pay(AliPay ap) {
//        ap.payOnline();
//    }
//
//    public static void pay(BankCardPay bc) {
//        bc.payOnline();
//    }
    public static void pay (Mtwm m) {
        m.payOnline();
    }
}
