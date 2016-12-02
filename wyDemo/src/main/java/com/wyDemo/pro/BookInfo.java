package com.wyDemo.pro;
/**
 * @author fengchao
 * @date 2016年12月1日
 * @注释 书籍bean
 */
public class BookInfo {

	private long categoryId;   //类别id
	private String name;	//类别名称
	private int type;       //类别类型，其中0是出版书籍分类类别，1是原创分类类别
	private BookInfo parent;   //父类别，在选择书籍分类时选择父类别id是无效的,目前云阅读只有两级分类
	
	
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
	
}
