package com.cjy.anno;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/6 - 下午2:37
 * @Description: com.cjy.anno
 * @version: 1.0
 */
public class Person {

    /**
     * 下面是eat方法，实现了XXX功能
     * @param num1 就餐人数
     * @param num2 点了几个菜
     */
    public void eat(int num1, int num2) {

    }

    /**
     *
     * @param age 年龄
     * @return int
     * @exception RuntimeException
     * @exception IndexOutOfBoundsException
     * @see Student
     */
    public int sleep(int age) {
        new Student();
        if (age > 10) {
            throw new RuntimeException();
        }
        if (age < 100) {
            throw new IndexOutOfBoundsException();
        }
        return 10;
    }
}
