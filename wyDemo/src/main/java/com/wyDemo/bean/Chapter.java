package com.wyDemo.bean;

public class Chapter {
    private String bookId;

    private String bookKey;

    private String prechapterId;

    private String prechapterKey;

    private String chapterKey;

    private String title;

    private String pics;

    private Integer chapterId;

    private String description;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId == null ? null : bookId.trim();
    }

    public String getBookKey() {
        return bookKey;
    }

    public void setBookKey(String bookKey) {
        this.bookKey = bookKey == null ? null : bookKey.trim();
    }

    public String getPrechapterId() {
        return prechapterId;
    }

    public void setPrechapterId(String prechapterId) {
        this.prechapterId = prechapterId == null ? null : prechapterId.trim();
    }

    public String getPrechapterKey() {
        return prechapterKey;
    }

    public void setPrechapterKey(String prechapterKey) {
        this.prechapterKey = prechapterKey == null ? null : prechapterKey.trim();
    }

    public String getChapterKey() {
        return chapterKey;
    }

    public void setChapterKey(String chapterKey) {
        this.chapterKey = chapterKey == null ? null : chapterKey.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics == null ? null : pics.trim();
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}