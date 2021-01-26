package com.msb;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2020/12/23 - 下午4:07
 * @Description: com.msb
 * @version: 1.0
 */
public class TestOuter {
    //非静态的成员内部类
    public class D {
        int age = 20;
        String name;

        public void method() {
//            a();
            int age = 30;

            //8.内部类和外部类属性重名的时候，如何进行调用
            System.out.println(age);
            System.out.println(this.age);
            System.out.println(TestOuter.this.age);
        }
    }

    //静态成员内部类
    static class E {
        //静态内部类中只能访问外部类中被static修饰的内容
        public void method() {

        }
    }

    //属性
    int age = 10;
    //方法
    public void a() {
        System.out.println("这是a方法");
        {
            System.out.println("这是一个普通块");
            class B {

            }
        }
        class A {

        }
        D d = new D();
        System.out.println(d.name);
        d.method();
    }
    static {
        System.out.println("这是静态块");
    }
    {
        System.out.println("这是构造块");
    }
    //构造器
    public TestOuter() {
        class c {

        }
    }

    public TestOuter(int age) {
        this.age = age;
    }
}

class Demo2 {
    public static void main(String[] args) {
        TestOuter to = new TestOuter();
        to.a();
        //9.创建内部类的对象：
        //静态的成员内部类创建对象：
//        TestOuter.E e = new TestOuter.E();
//        e.method();
        //非静态的成员内部类创建对象
//        TestOuter.D d = to.new D();
//        d.method();
    }
}


