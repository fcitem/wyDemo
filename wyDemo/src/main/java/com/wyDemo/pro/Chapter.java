package com.wyDemo.pro;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Chapter {
	private String title;    //卷名
	private String description;   //卷描述
	private String bookId;
	private String bookKey;
	private String preChapterId;   //前一个卷的id，第一卷值为””。该参数用于设定卷的顺序，很重要。
	private String chapterKey; //书籍用户方对该卷的标识符,该参数旨在防止多次重复提交一卷,该值可以选择为己方卷的唯一标识符id
	Document doc;
	
	public Chapter() {
		setTitle("前言");
		setDescription(null);
		setBookId("");
		setBookKey("001");
		setPreChapterId("");
		setChapterKey("001");
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookKey() {
		return bookKey;
	}

	public void setBookKey(String bookKey) {
		this.bookKey = bookKey;
	}

	public String getPreChapterId() {
		return preChapterId;
	}

	public void setPreChapterId(String preChapterId) {
		this.preChapterId = preChapterId;
	}

	public String getChapterKey() {
		return chapterKey;
	}

	public void setChapterKey(String chapterKey) {
		this.chapterKey = chapterKey;
	}

	public Document getDoc() {
		return doc;
	}

	public void setDoc(Document doc) {
		this.doc = doc;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		try {
			doc = Jsoup.connect("http://localhost:8080/wyDemo/chapterDescription.html").get();
			this.description=doc.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
