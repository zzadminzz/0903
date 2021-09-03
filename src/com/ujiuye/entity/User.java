package com.ujiuye.entity;

public class User {
    private int uid;
    private String username;
    private String pwd;

    public User() {
    }

    public User(int uid, String username, String pwd) {
        this.uid = uid;
        this.username = username;
        this.pwd = pwd;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

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
}
