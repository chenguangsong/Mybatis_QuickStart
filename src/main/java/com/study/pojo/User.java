package com.study.pojo;

/**
 * @ClassName User
 * @Description 用户实体类
 * @Author chenguang
 * @Date 2020-04-25 21:02
 * @Version 1.0
 **/
public class User {
    private int userId;
    private String userName;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
