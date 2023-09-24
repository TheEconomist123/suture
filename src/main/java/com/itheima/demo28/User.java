package com.itheima.demo28;

import java.util.Arrays;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/5/28
 * @time 17:08
 * @desc
 */
public class User implements Cloneable {
    private String username;
    private String role;
    private int[] arrInt;

    public User() {

    }

    public User(String username, String role, int[] arrInt) {
        this.username = username;
        this.role = role;
        this.arrInt = arrInt;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int[] getArrInt() {
        return arrInt;
    }

    public void setArrInt(int[] arrInt) {
        this.arrInt = arrInt;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", role='" + role + '\'' +
                ", arrInt=" + Arrays.toString(arrInt) +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        int[] data=this.arrInt;
        int[] newData = new int[data.length];

        System.arraycopy(data, 0, newData, 0, data.length);

        User u = (User) super.clone();
        u.arrInt = newData;
        return u;
    }
}
