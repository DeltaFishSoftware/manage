package com.DeltaFish.pojo;

public class Userinfo {
    private String lable;

    private String intorduction;

    private String mail;

    private String password;

    private String mobile;

    private Float buyerComment;

    private Float sellerComment;

    private byte[] image;

    public Userinfo(String lable, String intorduction, String mail, String password, String mobile, Float buyerComment, Float sellerComment, byte[] image) {
        this.lable = lable;
        this.intorduction = intorduction;
        this.mail = mail;
        this.password = password;
        this.mobile = mobile;
        this.buyerComment = buyerComment;
        this.sellerComment = sellerComment;
        this.image = image;
    }

    public Userinfo() {
        super();
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable == null ? null : lable.trim();
    }

    public String getIntorduction() {
        return intorduction;
    }

    public void setIntorduction(String intorduction) {
        this.intorduction = intorduction == null ? null : intorduction.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Float getBuyerComment() {
        return buyerComment;
    }

    public void setBuyerComment(Float buyerComment) {
        this.buyerComment = buyerComment;
    }

    public Float getSellerComment() {
        return sellerComment;
    }

    public void setSellerComment(Float sellerComment) {
        this.sellerComment = sellerComment;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}