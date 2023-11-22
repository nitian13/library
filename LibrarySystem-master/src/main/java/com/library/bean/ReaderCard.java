package com.library.bean;

import java.io.Serializable;

public class ReaderCard implements Serializable {

    //读者id
    private long reader_id;

    //读者名字
    private String username;

    //读者密码
    private String password;

    public long getReaderId() {
        return reader_id;
    }

    public void setReaderId(long reader_id) {
        this.reader_id = reader_id;
    }

    public String getName() {
        return username;
    }

    public void setName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
