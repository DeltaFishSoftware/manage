package com.DeltaFish.pojo;

public class Books {
    private String bookName;

    private String edition;

    private String author;

    private String press;

    private String intorduction;

    private String operation;

    private String link;

    private String comment;

    public Books(String bookName, String edition, String author, String press, String intorduction, String operation, String link, String comment) {
        this.bookName = bookName;
        this.edition = edition;
        this.author = author;
        this.press = press;
        this.intorduction = intorduction;
        this.operation = operation;
        this.link = link;
        this.comment = comment;
    }

    public Books() {
        super();
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition == null ? null : edition.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press == null ? null : press.trim();
    }

    public String getIntorduction() {
        return intorduction;
    }

    public void setIntorduction(String intorduction) {
        this.intorduction = intorduction == null ? null : intorduction.trim();
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}