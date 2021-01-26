package com.cjy.test03;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/5 - 上午11:31
 * @Description: com.cjy.test02
 * @version: 1.0
 */
public class Server {
    public static void main(String[] args){
        System.out.println("服务器端启动了");
        ServerSocket ss = null;
        Socket s = null;
        int count = 0;//记录登录的用户数
        try {
            ss = new ServerSocket(8080);
            while (true) {
                s = ss.accept();
                new ServerThread(s).start();
                count++;
                System.out.println("当前是第"+count+"个用户访问我们的服务器,对应的用户是："+s.getInetAddress());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (s != null) {
                    s.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (ss != null) {
                    ss.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
