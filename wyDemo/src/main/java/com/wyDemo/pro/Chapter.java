package com.wyDemo.pro;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;

public class Chapter {
	private String title;    //卷名
	private StringBuilder description=new StringBuilder();   //卷描述
	private String bookId;
	private String bookKey;
	private String preChapterId;   //前一个卷的id，第一卷值为””。该参数用于设定卷的顺序，很重要。
	private String chapterKey; //书籍用户方对该卷的标识符,该参数旨在防止多次重复提交一卷,该值可以选择为己方卷的唯一标识符id
	Document doc;
	
	public Chapter() {
		setTitle("前言");
		setDescription(null);
		setBookId("ts_50d76ff6d8b54e6499e22359255159c7_4");
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

	public StringBuilder getDescription() {
		return description;
	}

	public void setDescription(StringBuilder description) {
		try {
			doc = Jsoup.connect("http://localhost:8080/wyDemo/chapterDescription.html").get();
			List<Node> list=doc.getElementById("content").childNodes();
			for(Iterator<Node> it=list.iterator();it.hasNext();){
				this.description.append(it.next().toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
