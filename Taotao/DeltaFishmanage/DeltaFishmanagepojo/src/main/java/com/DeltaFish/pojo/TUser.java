package com.DeltaFish.pojo;

public class TUser {
    private String userId;
    private String password;
    private String userName;
    private int credits;
    private String email;
    private String mobile;
    private String lastVisit;
    private String lastIp;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String note) {
        this.mobile = mobile;
    }

    public String getLastVisit() {
        return lastVisit;
    }

    public String getLastIp() {
        return lastIp;
    }
}
