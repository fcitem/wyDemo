package com.wyDemo.pro;

import org.jsoup.nodes.Document;

/**
 * @author fengchao
 * @date 2016年12月1日
 * @注释 书籍bean
 */
public class BookInfo {

	private long categoryId;   //类别id
	private String name;	//类别名称
	private int type;       //类别类型，其中0是出版书籍分类类别，1是原创分类类别
	private String description;
	private BookInfo parent;   //父类别，在选择书籍分类时选择父类别id是无效的,目前云阅读只有两级分类
	private String title;     //书名
	private int payType;
	private int price;
	private String author;
	private int status;
	private int bookType;
	private String bookKey;  //书籍用户方对该书的标识符，建议选择;该值可以选择为己方书籍的唯一标识符id等
	Document doc;
	public BookInfo() {
	}
	public int getPrice() {
		return price;
	}
	public String getBookKey() {
		return bookKey;
	}
	public void setBookKey(String bookKey) {
		this.bookKey = bookKey;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPayType() {
		return payType;
	}
	public void setPayType(int payType) {
		this.payType = payType;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getBookType() {
		return bookType;
	}
	public void setBookType(int bookType) {
		this.bookType = bookType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Document getDoc() {
		return doc;
	}
	public void setDoc(Document doc) {
		this.doc = doc;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public BookInfo getParent() {
		return parent;
	}
	public void setParent(BookInfo parent) {
		this.parent = parent;
	}
	public static void main(String[] args) {
		new BookInfo();
	}
}
