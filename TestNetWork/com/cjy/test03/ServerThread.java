package com.cjy.test03;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/5 - 下午2:23
 * @Description: com.cjy.test03
 * @version: 1.0
 */
public class ServerThread extends Thread {
    private Socket s = null;

    InputStream is = null;
    ObjectInputStream ois = null;
    User user = null;
    OutputStream os = null;
    ObjectOutputStream oos = null;

    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            is = s.getInputStream();
            ois = new ObjectInputStream(is);
            user = (User)(ois.readObject());
            boolean b = false;
            if ("娜娜".equals(user.getUsername()) && "123123".equals(user.getPwd())) {
                b = true;
            } else {
                b = false;
            }

            os = s.getOutputStream();
            oos = new ObjectOutputStream(os);
            oos.writeBoolean(b);
        } catch (Exception ex) {

        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
