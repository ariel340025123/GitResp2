package com.cjy.thread03;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/4 - 下午4:13
 * @Description: com.cjy.thread03
 * @version: 1.0
 */
public class TestThread implements Runnable {
    public int flag = 1;
    static Object o1 = new Object();
    static Object o2 = new Object();

    @Override
    public void run() {
        System.out.println("flag=" + flag);

        if (flag == 1) {
            synchronized (o1) {
                try {
                    Thread.sleep(500);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                synchronized (o2) {
                    System.out.println("2");
                }
            }
        }

        if (flag == 0) {
            synchronized (o2) {
                try {
                    Thread.sleep(500);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                synchronized (o1) {
                    System.out.println("1");
                }
            }
        }
    }
}
