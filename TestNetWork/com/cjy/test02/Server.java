package com.cjy.test02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/5 - 上午11:31
 * @Description: com.cjy.test02
 * @version: 1.0
 */
public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(8080);
        Socket s = ss.accept();

        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String str = dis.readUTF();
        System.out.println("客户端传过来的是：" + str);

        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("你好，我是服务器端，我收到了你发给我的请求了");

        dos.close();
        dis.close();
        s.close();
        ss.close();
    }
}
