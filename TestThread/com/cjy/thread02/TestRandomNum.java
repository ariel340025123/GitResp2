package com.cjy.thread02;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/4 - 下午12:06
 * @Description: com.cjy.thread02
 * @version: 1.0
 */
public class TestRandomNum implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(10);
    }
}
