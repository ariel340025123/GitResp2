package com.cjy.thread06;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/4 - 下午9:03
 * @Description: com.cjy.thread06
 * @version: 1.0
 */
public class Product3 {
    private String brand;
    private String name;

    boolean flag = false;//默认false，没有生产出商品，让生产者生产

    Lock lock = new ReentrantLock();
    Condition produceCondition = lock.newCondition();
    Condition consumeCondition = lock.newCondition();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProduct(String brand, String name) {
        lock.lock();
        try {
            if (flag == true) {//证明有商品，不生产
                try {
//                wait();
                    produceCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            this.setBrand(brand);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setName(name);
            System.out.println("生产者生产了：" + this.getBrand() + "----" + this.getName());

            flag = true;
//        notify();
            consumeCondition.signal();
        }catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void getProduct() {
        lock.lock();
        try {
            if (!flag) {
                try {
//                wait();
                    consumeCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("消费者消费了：" + this.getBrand() +"----"+ this.getName());

            flag = false;
//        notify();
            produceCondition.signal();
        }catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
