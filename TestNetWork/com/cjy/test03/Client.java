package com.cjy.test03;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/5 - 上午11:16
 * @Description: com.cjy.test02
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("客户端启动了");
        Socket s = null;
        User user = null;
        OutputStream os = null;
        ObjectOutputStream oos = null;
        InputStream is = null;
        ObjectInputStream ois = null;
        try {
            s = new Socket("192.168.2.174", 8080);

            Scanner sc = new Scanner(System.in);
            System.out.print("请输入登录名：");
            String username = sc.next();
            System.out.print("请输入登录密码：");
            String pwd = sc.next();
            user = new User(username, pwd);

            os = s.getOutputStream();
            oos = new ObjectOutputStream(os);
            oos.writeObject(user);

            is = s.getInputStream();
            ois = new ObjectInputStream(is);
            boolean b = ois.readBoolean();
            if (b) {
                System.out.println("登录成功");
            } else {
                System.out.println("对不起，登录失败");
            }
        } catch (Exception ex) {

        }finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (s != null) {
                    s.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
