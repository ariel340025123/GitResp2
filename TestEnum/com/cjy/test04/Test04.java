package com.cjy.test04;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/6 - 上午11:29
 * @Description: com.cjy.test04
 * @version: 1.0
 */
public class Test04 {
    public static void main(String[] args) {
//        Person p = new Person();
//        p.setAge(19);
//        p.setName("lili");
//        p.setSex(Gender.BOY);
//        System.out.println(p);
        Gender sex = Gender.GRIL;

        switch (sex) {
            case BOY:
                System.out.println("这是一个男孩");
                break;
            case GRIL:
                System.out.println("这是一个女孩");
                break;
        }
    }
}
