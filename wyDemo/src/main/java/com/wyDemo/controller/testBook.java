package com.wyDemo.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wyDemo.bean.Book;
import com.wyDemo.bean.BookExample;
import com.wyDemo.bean.Chapter;
import com.wyDemo.bean.ChapterExample;
import com.wyDemo.bean.Section;
import com.wyDemo.bean.SectionExample;
import com.wyDemo.service.BookService;
import com.wyDemo.service.ChapterService;
import com.wyDemo.service.SectionService;
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
	@Autowired
	BookService bookService;
	@Autowired
	ChapterService chapterService;
	@Autowired
	SectionService sectionService;
	HttpConnect connect;
	/**
	 * @author fengchao
	 * @data: 2016年12月11日
	 * @注释：更新一本书
	 */
	@RequestMapping("addBook")
	public void addBook(@RequestBody Book book,HttpServletResponse response,HttpServletRequest request){
		String url="http://testapi.yuedu.163.com/book/add.json";
		connect=HttpConnect.getHttpConnect(url);
		HashMap<String,Object> map=RequestParamter.getBookParamMap(book);
		String msg=RequestParamter.sendData(connect, "POST",map);  //发送数据
		log.debug(msg);
		ObjectMapper obj=new ObjectMapper();
		try {
			JsonNode node=obj.readTree(msg);
			if(msg!=null&&node.get("code").toString().equals("200")){
				Book successBook=obj.readValue(node.get("book").toString(), Book.class);
				successBook.setDescription("");
				bookService.insertSelective(successBook);
			}
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(msg);   //处理void返回值
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@RequestMapping("updateBook")
	public void updateBook(@RequestBody Book book,HttpServletResponse response,HttpServletRequest request){
		String url="http://testapi.yuedu.163.com/book/update.json";
		connect=HttpConnect.getHttpConnect(url);
		HashMap<String,Object> map=RequestParamter.getBookParamMap(book);
		String msg=RequestParamter.sendData(connect, "POST",map);  //发送数据
		log.debug(msg);
		ObjectMapper obj=new ObjectMapper();
		try {
			JsonNode node=obj.readTree(msg);
			if(msg!=null&&node.get("code").toString().equals("200")){
				Book successBook=obj.readValue(node.get("book").toString(), Book.class);
				BookExample example=new BookExample();
				example.createCriteria().andBookIdEqualTo(successBook.getBookId());
				if(bookService.countByExample(example)==0){
					bookService.insertSelective(successBook);
				}
				else{
					bookService.updateByExampleSelective(successBook, example);
				}
			}
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(msg);   //处理void返回值
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * @author fengchao
	 * @data: 2016年12月11日
	 * @注释：增加卷
	 */
	@RequestMapping("addChapter")
	public void addChapter(@RequestBody Chapter chapter,HttpServletResponse response,HttpServletRequest request){
		String url="http://testapi.yuedu.163.com/bookChapter/add.json";
		HttpConnect connect=HttpConnect.getHttpConnect(url);
		HashMap<String,Object> map=RequestParamter.getChapterParamMap(chapter);
		String msg=RequestParamter.sendData(connect, "POST",map);
		log.debug(msg);
		ObjectMapper obj=new ObjectMapper();
		try {
			JsonNode node=obj.readTree(msg);
			if(msg!=null&&node.get("code").toString().equals("200")){
				Chapter successChapter=obj.readValue(node.get("chapter").toString(), Chapter.class);
				successChapter.setDescription("");
				chapterService.insertSelective(successChapter);
			}
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(msg);   //处理void返回值
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * @author fengchao
	 * @data: 2016年12月11日
	 * @注释：更新卷
	 */
	@RequestMapping("updateChapter")
	public void updateChapter(@RequestBody Chapter chapter,HttpServletResponse response,HttpServletRequest request){
		String url="http://testapi.yuedu.163.com/bookChapter/update.json";
		HttpConnect connect=HttpConnect.getHttpConnect(url);
		HashMap<String,Object> map=RequestParamter.getChapterParamMap(chapter);
		String msg=RequestParamter.sendData(connect, "POST",map);
		log.debug(msg);
		ObjectMapper obj=new ObjectMapper();
		try {
			JsonNode node=obj.readTree(msg);
			if(msg!=null&&node.get("code").toString().equals("200")){
				Chapter successChapter=obj.readValue(node.get("chapter").toString(), Chapter.class);
				successChapter.setDescription("");
				ChapterExample example=new ChapterExample();
				example.createCriteria().andBookIdEqualTo(successChapter.getBookId()).andChapterIdEqualTo(successChapter.getChapterId());
				if(chapterService.countByExample(example)==0){
					chapterService.insertSelective(successChapter);
				}
				else{
					chapterService.updateByExampleSelective(successChapter, example);
				}
			}
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(msg);   //处理void返回值
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * @author fengchao
	 * @data: 2016年12月11日
	 * @注释：增加章节
	 */
	@RequestMapping("addSection")
	public void addSection(@RequestBody Section section,HttpServletResponse response,HttpServletRequest request){
		String url="http://testapi.yuedu.163.com/bookSection/add.json";
		HttpConnect connect=HttpConnect.getHttpConnect(url);
		HashMap<String,Object> map=RequestParamter.getSectionParamMap(section);
		String msg=RequestParamter.sendData(connect, "POST",map);
		log.debug(msg);
		ObjectMapper obj=new ObjectMapper();
		try {
			JsonNode node=obj.readTree(msg);
			if(msg!=null&&node.get("code").toString().equals("200")){
				Section successSection=obj.readValue(node.get("section").toString(), Section.class);
				successSection.setContent("");
				sectionService.insertSelective(successSection);
			}
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(msg);   //处理void返回值
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * @author fengchao
	 * @data: 2016年12月11日
	 * @注释：更新章节
	 */
	@RequestMapping("updateSection")
	public void updateSection(@RequestBody Section section,HttpServletResponse response,HttpServletRequest request){
		String url="http://testapi.yuedu.163.com/bookSection/update.json";
		HttpConnect connect=HttpConnect.getHttpConnect(url);
		HashMap<String,Object> map=RequestParamter.getSectionParamMap(section);
		String msg=RequestParamter.sendData(connect, "POST",map);
		log.debug(msg);
		ObjectMapper obj=new ObjectMapper();
		try {
			JsonNode node=obj.readTree(msg);
			if(msg!=null&&node.get("code").toString().equals("200")){
				Section successSection=obj.readValue(node.get("section").toString(), Section.class);
				successSection.setContent("");
				SectionExample example=new SectionExample();
				example.createCriteria().andBookIdEqualTo(successSection.getBookId()).andChapterIdEqualTo(successSection.getChapterId()).andSectionIdEqualTo(successSection.getSectionId());
				if(sectionService.countByExample(example)==0){
					sectionService.insertSelective(successSection);
				}
				else{
					sectionService.updateByExampleSelective(successSection, example);
				}
			}
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(msg);   //处理void返回值
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
