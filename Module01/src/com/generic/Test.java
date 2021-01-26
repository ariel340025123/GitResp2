package src.com.generic;

import java.util.HashMap;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/2 - 下午8:38
 * @Description: src.com.generic
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
//        //初始化时不指定泛型，认为这个泛型为object类型
//        GenericTest gt1 = new GenericTest();
//        gt1.a("abc");
//        gt1.a(17);
//        gt1.a(9.8);
//        gt1.b(new String[]{"aaa", "bbb"});
//
//        //实例化时候指定泛型
//        GenericTest<String> gt2 = new GenericTest<>();
//        gt2.sex = "男";
//        gt2.a("abc");
//        gt2.b(new String[]{"a","b"});
        //子类继承父类使用泛型
//        SubGenericTest<String> subGt = new SubGenericTest<>();
//        subGt.a("男");
//        subGt.sex = "女";
//        //使用泛型方法
//        GenericTest<String> gt = new GenericTest<>();
//        GenericTest.c("abc");
//        gt.c("abc");

        HashMap<Integer,String> hm = new HashMap<>();
        System.out.println(hm.put(12,"丽丽"));
        System.out.println(hm.put(7,"菲菲"));
        System.out.println(hm.put(19,"露露"));
        System.out.println(hm.put(12,"明明"));
        System.out.println(hm.put(6,"莹莹"));
        System.out.println("集合的长度："+hm.size());
        System.out.println("集合中内容查看："+hm);
    }
}
