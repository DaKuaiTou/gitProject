package com.dkt.pojo;

/**
 * @Author: dkt
 * @Date: 2021/12/29 17:57
 */
public class User {
    private String username;
    private String password;
    private String age;

    public User () {
    }

    public User (String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername () {
        return username;
    }

    public void setUsername (String username) {
        this.username = username;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    @Override
    public String toString () {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
