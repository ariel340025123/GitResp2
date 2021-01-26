package com.msb01.pizza;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2020/12/24 - 上午10:12
 * @Description: com.msb01.pizza
 * @version: 1.0
 */
public class FruitPizza extends Pizza {
    String ingredients;   //水果披萨的配料

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
    //重写父类的方法
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("配料水果：" + ingredients);
    }

    public FruitPizza() {

    }

    public FruitPizza(String ingredients) {
        this.ingredients = ingredients;
    }

    public FruitPizza(String name, int size, double price, String ingredients) {
        super(name, size, price);
        this.ingredients = ingredients;
    }
}
