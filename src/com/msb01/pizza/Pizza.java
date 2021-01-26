package com.msb01.pizza;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2020/12/24 - 上午10:10
 * @Description: com.msb01.pizza
 * @version: 1.0
 */
public class Pizza {
    String name;   //披萨的名称
    int size;      //披萨的大小
    double price;  //披萨的价格

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //展示披萨信息
    public void displayInfo () {
        System.out.println("名称：" + name);
        System.out.println("价格：" + price + "元");
        System.out.println("大小：" + size + "寸");
    }

    //构造方法
    public Pizza() {

    }

    public Pizza(String name, int size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }
}
