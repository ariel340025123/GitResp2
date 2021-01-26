package com.cjy.test02;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/7 - 上午9:50
 * @Description: com.cjy.test02
 * @version: 1.0
 */
public class Test02 {

    public static void main(String[] args) throws ClassNotFoundException {
        //方式1：通过getClass()方法获取
        Person p = new Person();
        Class cls = p.getClass();
        System.out.println(cls);
        //方式2：通过内置class属性：
        Class cls2 = Person.class;
        System.out.println(cls2);
        //方式3：--》用的最多：调用Class类提供的静态方法forName
        Class cls3 = Class.forName("com.cjy.test02.Person");
        System.out.println(cls3);
        //方式4：利用类的加载器(了解技能点)
        ClassLoader loader = Test02.class.getClassLoader();
        Class cls4 = loader.loadClass("com.cjy.test02.Person");
        System.out.println(cls4);
    }
}
