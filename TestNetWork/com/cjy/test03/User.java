package com.cjy.test03;

import java.io.Serializable;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/5 - 下午12:29
 * @Description: com.cjy.test03
 * @version: 1.0
 */
public class User implements Serializable {
    private static final long serialVersionUID = 2073563177518748528L;
    private String username;
    private String pwd;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public User(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }
}
