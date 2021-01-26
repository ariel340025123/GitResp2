package com.msb;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2020/12/23 - 下午5:22
 * @Description: com.msb
 * @version: 1.0
 */
public class TestOuter02 {
    public void method() {
//        final int[] num = {10};
        final int num = 10;
        class A {
            public void a() {
//                num[0] = 20;
                System.out.println(num);
            }
        }
    }

    public Comparable method2() {
        class B implements Comparable {

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new B();
    }

    public Comparable method3() {
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }

    public void test() {
        Comparable com = new Comparable(){
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
        System.out.println(com.compareTo("abc"));
    }
}
