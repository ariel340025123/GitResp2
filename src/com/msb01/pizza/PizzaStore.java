package com.msb01.pizza;

import java.util.Scanner;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2020/12/24 - 上午11:48
 * @Description: com.msb01.pizza
 * @version: 1.0
 */
public class PizzaStore {

    public static Pizza getPizza(int choice) {
        Pizza pizza = null;
        Scanner sc = new Scanner(System.in);
        switch (choice) {
            case 1:
                System.out.print("请输入培根的克数：");
                int grams = sc.nextInt();//输入的培根的克数
                System.out.print("请输入披萨的大小：");
                int size = sc.nextInt();
                System.out.print("请输入披萨的价格：");
                double price = sc.nextDouble();

                BaconPizza bp = new BaconPizza("培根披萨", size, price, grams);
                pizza = bp;
                break;
            case 2:
                System.out.print("请输入你想要加入的水果：");
                String ingredients = sc.next();
                System.out.print("请输入披萨的大小：");
                int size2 = sc.nextInt();
                System.out.print("请输入披萨的价格：");
                double price2 = sc.nextDouble();

                FruitPizza fp = new FruitPizza("水果披萨", size2, price2, ingredients);
                pizza= fp;
                break;
            default:
                break;
        }

        return pizza;
    }

}
