package com.wyDemo.bean;

public class BookInfo {
    private String bookId;

    private String bookName;

    private byte[] bookDesc;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId == null ? null : bookId.trim();
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public byte[] getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(byte[] bookDesc) {
        this.bookDesc = bookDesc;
    }
}