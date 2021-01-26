package com.cjy.thread05;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/4 - 下午5:17
 * @Description: com.cjy.thread04
 * @version: 1.0
 */
public class Product2 {
    private String brand;
    private String name;

    boolean flag = false;//默认false，没有生产出商品，让生产者生产

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

    public synchronized void setProduct(String brand, String name) {
        if (flag == true) {//证明有商品，不生产
            try {
                wait();
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
        notify();
    }

    public synchronized void getProduct() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费者消费了：" + this.getBrand() +"----"+ this.getName());

        flag = false;
        notify();
    }
}
