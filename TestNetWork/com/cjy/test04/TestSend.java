package com.cjy.test04;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/5 - 下午3:42
 * @Description: com.cjy.test04
 * @version: 1.0
 */
public class TestSend {
    public static void main(String[] args) {
        System.out.println("学生上线了。。");
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(8888);

            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.print("学生：");
                String str = sc.next();
                byte[] bytes = str.getBytes();

                DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("localhost"), 8080);
                ds.send(dp);

                if ("byebye".equals(str)) {
                    System.out.println("学生已经下线了。。。");
                    break;
                }

                //接收老师发送回来的信息
                byte[] bytes2 = new byte[1024];
                DatagramPacket dp2 = new DatagramPacket(bytes2, bytes2.length);
                ds.receive(dp2);
                byte[] data = dp2.getData();
                String str2 = new String(data, 0, dp2.getLength());
                System.out.println("老师对学生说：" + str2);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            ds.close();
        }
    }
}
