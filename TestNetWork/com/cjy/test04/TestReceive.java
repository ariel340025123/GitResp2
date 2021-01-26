package com.cjy.test04;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/5 - 下午3:48
 * @Description: com.cjy.test04
 * @version: 1.0
 */
public class TestReceive {
    public static void main(String[] args) {
        System.out.println("老师上线了。。");

        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(8080);

            while (true) {
                byte[] bytes = new byte[1024];
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
                ds.receive(dp);
                //接收取出转字符串输出
                byte[] data = dp.getData();
                String str = new String(data,0, dp.getLength());
                System.out.println("学生对老师说：" + str);
                if ("byebye".equals(str)) {
                    System.out.println("学生已经下线了，老师也下线。。。");
                    break;
                }
                //老师回复
                Scanner sc = new Scanner(System.in);
                System.out.print("老师：");
                String str2 = sc.next();
                byte[] bytes2 = str2.getBytes();
                DatagramPacket dp2 = new DatagramPacket(bytes2, bytes2.length, InetAddress.getByName("localhost"), 8888);
                ds.send(dp2);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            ds.close();
        }
    }
}
