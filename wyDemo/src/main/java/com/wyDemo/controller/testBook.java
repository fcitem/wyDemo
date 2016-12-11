package com.wyDemo.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wyDemo.pro.BookInfo;
import com.wyDemo.pro.Chapter;
import com.wyDemo.util.RequestParamter;

import wyDemo.httpconnect.Util.HttpConnect;

/**
 * @author fengchao
 * @data:2016年12月11日
 * @注释：测试书籍接口
 */
@Controller
public class testBook {

	BookInfo book=new BookInfo();
	Chapter chapter=new Chapter();
	HttpConnect connect;
	public testBook() {
		book.setCategoryId(1);
		book.setBookType(1);
		book.setStatus(2);
		book.setPrice(3);
		book.setBookKey("001");
		book.setAuthor("一束干花");
		book.setTitle("大院里的童年");
		chapter.setTitle("前言");
		chapter.setBookId("ts_7de88f299bac4217bc033d7162ee2149_4");
		chapter.setBookKey("001");
		chapter.setPreChapterId("");
		chapter.setChapterKey("001");
	}
	/**
	 * @author fengchao
	 * @data: 2016年12月11日
	 * @注释：更新一本书
	 */
	@RequestMapping("updateBook")
	public void updateBook(String description,HttpServletResponse response){
		String url="http://testapi.yuedu.163.com/book/update.json";
		connect=HttpConnect.getHttpConnect(url);
		book.setDescription(description);
		HashMap<String,Object> map=RequestParamter.getBookParamMap(book);
		RequestParamter.sendData(connect, "POST",map);
		connect.read();
		try {
			response.getWriter().write("sds");   //处理void返回值
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @author fengchao
	 * @data: 2016年12月11日
	 * @注释：增加卷
	 */
	@RequestMapping("addChapter")
	public void addChapter(String description,HttpServletResponse response){
		String url="http://testapi.yuedu.163.com/bookChapter/add.json";
		HttpConnect connect=HttpConnect.getHttpConnect(url);
		chapter.setDescription(description);
		HashMap<String,Object> map=RequestParamter.getChapterParamMap(chapter);
		RequestParamter.sendData(connect, "POST",map);
		try {
			response.getWriter().write("");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @author fengchao
	 * @data: 2016年12月11日
	 * @注释：更新卷
	 */
	@RequestMapping("updateChapter")
	public void updateChapter(){
		
	}
	/**
	 * @author fengchao
	 * @data: 2016年12月11日
	 * @注释：增加章节
	 */
	@RequestMapping("addSection")
	public void addSection(){
		
	}
	/**
	 * @author fengchao
	 * @data: 2016年12月11日
	 * @注释：更新章节
	 */
	@RequestMapping("updateSection")
	public void updateSection(){
		
	}
}
