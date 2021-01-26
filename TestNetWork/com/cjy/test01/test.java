package com.cjy.test01;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/5 - 上午10:39
 * @Description: com.cjy.test01
 * @version: 1.0
 */
public class test {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress ia = InetAddress.getByName("192.168.2.174");
//        System.out.println(ia);
//        InetAddress ia2 = InetAddress.getByName("localhost");
//        System.out.println(ia2);
//        InetAddress ia3 = InetAddress.getByName("127.0.0.1");
//        System.out.println(ia3);
//        InetAddress ia4 = InetAddress.getByName("MacxdeMacBook-Pro.local");
//        System.out.println(ia4);
//        InetAddress ia5 = InetAddress.getByName("www.mashibing.com");
//        System.out.println(ia5);
//        System.out.println(ia5.getHostName());
//        System.out.println(ia5.getHostAddress());
//
//        InetAddress ia6 = InetAddress.getByName("www.baidu.com");
//        System.out.println(ia6);

        InetSocketAddress isa = new InetSocketAddress("192.168.2.174", 8080);
        System.out.println(isa);
        System.out.println(isa.getHostName());
        System.out.println(isa.getAddress());

        InetAddress ia = isa.getAddress();
        System.out.println(ia.getHostName());
        System.out.println(ia.getAddress());
    }
}
