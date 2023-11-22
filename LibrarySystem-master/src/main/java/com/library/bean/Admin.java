package com.library.bean;

public class Admin {

    //管理员id
    private long admin_id;

    //密码
    private String password;

    //管理员名字
    private String username;

    public long getAdminId() {
        return admin_id;
    }

    public void setAdminId(long admin_id) {
        this.admin_id = admin_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
