package com.msb01.pizza;

import java.util.Scanner;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2020/12/24 - 上午10:12
 * @Description: com.msb01.pizza
 * @version: 1.0
 */
public class TestPizza {
    //这是程序的入口main方法
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("请选择想要制作的披萨：1.培根披萨 2.水果披萨：");
            int choice = sc.nextInt();

            Pizza p = PizzaStore.getPizza(choice);
            p.displayInfo();
        }
    }
}
