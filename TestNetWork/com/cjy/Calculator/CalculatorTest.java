package com.cjy.Calculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/5 - 下午6:14
 * @Description: com.cjy.Calculator
 * @version: 1.0
 */
public class CalculatorTest {
    @Before
    public void init() {
        System.out.println("方法执行开始了。。。");
    }
    @After
    public void close() {
        System.out.println("方法执行结束了。。。");
    }

    @Test
    public void testAdd(){
        System.out.println("测试add方法");
        Calculator cal = new Calculator();
        int result = cal.add(20, 10);
//        System.out.println(result);
        //加入断言：预测一下结果,看实际与预测是否一致
        Assert.assertEquals(40, result);
    }

    @Test
    public void testSub(){
        System.out.println("测试sub方法");
        Calculator cal = new Calculator();
        int result = cal.sub(10, 30);
        System.out.println(result);
    }
}
