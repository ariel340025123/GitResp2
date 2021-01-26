package com.cjy.test02;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/7 - 上午10:16
 * @Description: com.cjy.test02
 * @version: 1.0
 */
public class Demo {

    public static void main(String[] args) {
        /*
        Class类的具体的实例：
        （1）类：外部类，内部类
        （2）接口
        （3）注解
        （4）数组
        （5）基本数据类型
        （6）void
         */
         Class c1 = Person.class;
         Class c2 = Comparable.class;
         Class c3 = Override.class;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        int[] arr1 = {1,2,3};
        Class c4 = arr1.getClass();
        System.out.println(c4);
        int[] arr2 = {5,6,7};
        Class c5 = arr2.getClass();
        System.out.println(c5);
        System.out.println(c4 == c5);

        Class c6 = int.class;
        Class c7 = void.class;
        System.out.println(c6);
        System.out.println(c7);
    }
}
