package com.wyDemo.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wyDemo.pro.BookInfo;
import com.wyDemo.pro.Chapter;
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
	HttpConnect connect;
	public testBook() {
		book.setCategoryId(1);
		book.setBookType(1);
		book.setStatus(2);
		book.setPrice(3);
		book.setPayType(1);
		book.setBookKey("1003");
		try {
			book.setAuthor("一束干花");
			book.setTitle("大院里的童年");
			chapter.setTitle("前言");
		} catch (Exception e) {
			e.printStackTrace();
		}
		chapter.setBookId("ts_7de88f299bac4217bc033d7162ee2149_4");
		chapter.setBookKey("1003");
		chapter.setPreChapterId("");
		chapter.setChapterKey("001");
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
		try {
			book.setDescription(new String("简介：本书以一个孩子的视角，描述了住扎在充满佛教遗迹部队大院里的故事。整部作品以时间为轴线，写了在六十年代初至七十年代初这个期间内，围绕在作者身边的人和事，真实还原了历史，还原了风俗、人情和社会。在文中，作者以饱满的笔触写了亲人的一次反革命事件开起了作者的学生期代，接下来的一次对特务的抓扑，又让她大来眼界，启蒙老师的污点又让她震惊于人性的残酷，山那边奇特的佛像引起她无限的联想•••••作者用一个个小故事将那个时代发生的事连缀成了一张大网，透过它，你可以看到整个曾经。".getBytes(),"utf-8"));
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
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
