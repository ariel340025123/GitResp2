package com.msb01.pizza;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2020/12/24 - 上午10:11
 * @Description: com.msb01.pizza
 * @version: 1.0
 */
public class BaconPizza extends Pizza {
    int grams;      //培根披萨的克数

    public int getGrams() {
        return grams;
    }

    public void setGrams(int grams) {
        this.grams = grams;
    }
    //重写父类的方法
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("培根克数：" + grams + "克");
    }

    //培根披萨的构造方法
    public BaconPizza() {

    }
    public BaconPizza(int grams) {
        this.grams = grams;

    }
    public BaconPizza(String name, int size, double price, int grams) {
        super(name, size, price);
        this.grams = grams;
    }

}
