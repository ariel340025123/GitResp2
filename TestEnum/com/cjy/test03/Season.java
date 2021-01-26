package com.cjy.test03;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/6 - 上午10:44
 * @Description: com.cjy.test01
 * @version: 1.0
 */
public enum Season implements TestInterface {
    SPRING{
        @Override
        public void show() {
            System.out.println("这是春天。。。");
        }
    },
    SUMMER{
        @Override
        public void show() {
            System.out.println("这是夏天。。。");
        }
    },
    AUTUMN{
        @Override
        public void show() {
            System.out.println("这是秋天。。。");
        }
    },
    WINTER{
        @Override
        public void show() {
            System.out.println("这是冬天。。。");
        }
    };

/*    @Override
    public void show() {
        System.out.println("这是Season....");
    }*/
}
