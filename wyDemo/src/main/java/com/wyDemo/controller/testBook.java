package com.wyDemo.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wyDemo.pro.BookInfo;
import com.wyDemo.pro.Chapter;
import com.wyDemo.pro.Section;
import com.wyDemo.util.HttpConnect;
import com.wyDemo.util.RequestParamter;

/**
 * @author fengchao
 * @data:2016年12月11日
 * @注释：测试书籍接口
 */
@Controller
public class testBook {

	Logger log=Logger.getLogger(getClass());
	BookInfo book=new BookInfo();
	Chapter chapter=new Chapter();
	Section section=new Section();
	HttpConnect connect;
	public testBook() {
		book.setCategoryId(1);
		book.setBookType(1);
		book.setStatus(2);
		book.setPrice(3);
		book.setPayType(1);
		book.setBookKey("book_1001");
		book.setAuthor("一束干花");
		book.setTitle("测试的书");
		chapter.setTitle("前言");
//		chapter.setBookId("ts_cafea46f60cb4b2f85ce8bcc4566708d_4");
		chapter.setBookKey("book_1001");
		chapter.setPreChapterId("");
		chapter.setChapterKey("001");
//		section.setBookId("ts_cafea46f60cb4b2f85ce8bcc4566708d_4");
		section.setBookKey("book_1001");
		section.setChapterKey("001");
		section.setSectionKey("0011");
		section.setPreSectionId("");
		section.setTitle("父亲的希望");
		section.setNeedPay(0);   //1付费
		section.setPrice(3);
	}
	/**
	 * @author fengchao
	 * @data: 2016年12月11日
	 * @注释：更新一本书
	 */
	@RequestMapping("addBook")
	public void addBook(String description,HttpServletResponse response){
		String url="http://testapi.yuedu.163.com/book/add.json";
		connect=HttpConnect.getHttpConnect(url);
		book.setDescription(description);
		HashMap<String,Object> map=RequestParamter.getBookParamMap(book);
		String msg=RequestParamter.sendData(connect, "POST",map);  //发送数据
		log.debug(msg);
		try {
			response.getWriter().write(msg);   //处理void返回值
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@RequestMapping("updateBook")
	public void updateBook(String description,HttpServletResponse response,HttpServletRequest request){
		String url="http://testapi.yuedu.163.com/book/update.json";
		connect=HttpConnect.getHttpConnect(url);
		book.setDescription(description);
		HashMap<String,Object> map=RequestParamter.getBookParamMap(book);
		String msg=RequestParamter.sendData(connect, "POST",map);  //发送数据
		log.debug(msg);
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(msg);   //处理void返回值
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
	public void addChapter(String description,HttpServletResponse response,HttpServletRequest request){
		String url="http://testapi.yuedu.163.com/bookChapter/add.json";
		HttpConnect connect=HttpConnect.getHttpConnect(url);
		chapter.setDescription(description);
		HashMap<String,Object> map=RequestParamter.getChapterParamMap(chapter);
		String msg=RequestParamter.sendData(connect, "POST",map);
		log.debug(msg);
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(msg);
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
	public void updateChapter(String description,HttpServletResponse response,HttpServletRequest request){
		String url="http://testapi.yuedu.163.com/bookChapter/update.json";
		HttpConnect connect=HttpConnect.getHttpConnect(url);
		chapter.setDescription(description);
		HashMap<String,Object> map=RequestParamter.getChapterParamMap(chapter);
		String msg=RequestParamter.sendData(connect, "POST",map);
		log.debug(msg);
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @author fengchao
	 * @data: 2016年12月11日
	 * @注释：增加章节
	 */
	@RequestMapping("addSection")
	public void addSection(String content,HttpServletResponse response,HttpServletRequest request){
		String url="http://testapi.yuedu.163.com/bookSection/add.json";
		HttpConnect connect=HttpConnect.getHttpConnect(url);
		section.setTitle("第八章 继续手写");
		section.setSectionKey("0018");
		section.setPreSectionKey("0017");
//		section.setNeedPay(1);  //收费
		section.setContent(RequestParamter.ChangeContent(content));
		HashMap<String,Object> map=RequestParamter.getSectionParamMap(section);
		String msg=RequestParamter.sendData(connect, "POST",map);
		log.debug(msg);
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @author fengchao
	 * @data: 2016年12月11日
	 * @注释：更新章节
	 */
	@RequestMapping("updateSection")
	public void updateSection(String content,HttpServletResponse response,HttpServletRequest request){
		String url="http://testapi.yuedu.163.com/bookSection/update.json";
		HttpConnect connect=HttpConnect.getHttpConnect(url);
		section.setTitle("第一章 初到人间");
		section.setSectionKey("0011");
//		section.setPreSectionKey("0011");
		section.setContent(RequestParamter.ChangeContent(content));
		HashMap<String,Object> map=RequestParamter.getSectionParamMap(section);
		String msg=RequestParamter.sendData(connect, "POST",map);
		log.debug(msg);
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
