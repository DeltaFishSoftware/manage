package com.DeltaFish.pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.awt.*;


public class TUser {

    //@NotNull(message = "学号不能为空！")
    private String userId;

    //@Size(min = 6,max = 20,message = "请输入6-20位密码！")
    private String password;

    @NotNull
    @Size(min = 3,max = 50,message = "昵称必须为 3 - 50 字符！")
    private String userName;

    private int credits;

    //@Email(message = "请输入合法邮箱！")
    private String email;

    private String mobile;
    private String lastVisit;
    private String lastIp;
    private Image image;
    private String lable;
    private String introduction;
    private String buyerComment;
    private String sellerComment;

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

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getBuyerComment() {
        return buyerComment;
    }

    public void setBuyerComment(String buyerComment) {
        this.buyerComment = buyerComment;
    }

    public String getSellerComment() {
        return sellerComment;
    }

    public void setSellerComment(String sellerComment) {
        this.sellerComment = sellerComment;
    }
}
