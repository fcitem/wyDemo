package com.wyDemo.pro;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Section {

	Document doc;
	private String bookId;
	private String bookKey;
	private String chapterId;  //章节所在卷的id,如果只有一级目录的书籍，则卷id为空。对于二级目录chapterId和chapterKey必选其一
	private String chapterKey;  //用户方提供的章节所在卷的id，如果只有一级目录的书籍，则卷id为空。对于二级目录chapterId和chapterKey必选其一
	private String preSectionId; //前一个章节的id,如果本章节为该书的第一个章节，则为””。 preSectionId和preSectionKey选其一使用
	private String preSectionKey; //用户方提供的前一章节的标识符，建议选择。用于分配顺序。preSectionId和preSectionKey选其一使用
	private String sectionKey;   //用户方提供的更新章节的id
	private String title;    //章节标题
	private String content;   //章节内容
	
	public Section() {
        setBookId("");
        setBookKey("001");
		setTitle("丑小鸭");
		setContent(null);
		setChapterId("");
		setSectionKey("001");
		setChapterKey("001");
		setPreSectionId("");
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		try {
			doc = Jsoup.connect("http://localhost:8080/wyDemo/sectionDescription.html").get();
			this.content=doc.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
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
	public String getChapterId() {
		return chapterId;
	}
	public void setChapterId(String chapterId) {
		this.chapterId = chapterId;
	}
	public String getChapterKey() {
		return chapterKey;
	}
	public void setChapterKey(String chapterKey) {
		this.chapterKey = chapterKey;
	}
	public String getPreSectionId() {
		return preSectionId;
	}
	public void setPreSectionId(String preSectionId) {
		this.preSectionId = preSectionId;
	}
	public String getPreSectionKey() {
		return preSectionKey;
	}
	public void setPreSectionKey(String preSectionKey) {
		this.preSectionKey = preSectionKey;
	}
	public String getSectionKey() {
		return sectionKey;
	}
	public void setSectionKey(String sectionKey) {
		this.sectionKey = sectionKey;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
