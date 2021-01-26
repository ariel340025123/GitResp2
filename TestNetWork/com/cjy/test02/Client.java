package com.cjy.test02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/5 - 上午11:16
 * @Description: com.cjy.test02
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket("192.168.2.174", 8080);
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("你好");

        InputStream is = s.getInputStream();
        DataInputStream dis = new  DataInputStream(is);
        String str = dis.readUTF();
        System.out.println("服务器端对我说：" + str);

        dis.close();
        dos.close();
        s.close();
    }
}
