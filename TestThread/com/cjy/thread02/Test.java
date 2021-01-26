package com.cjy.thread02;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/4 - 下午12:08
 * @Description: com.cjy.thread02
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestRandomNum tr = new TestRandomNum();
        FutureTask ft = new FutureTask(tr);
        Thread t = new Thread(ft);
        t.start();

        Object obj = ft.get();
        System.out.println(obj);
    }
}
