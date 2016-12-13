package com.wyDemo.util;

import java.util.HashMap;
import java.util.Map;

import com.wyDemo.pro.BookInfo;
import com.wyDemo.pro.Chapter;
import com.wyDemo.pro.Section;

/**
 * @author fengchao
 * @data:2016年12月8日
 * @注释：封装请求参数工具类
 */
public class RequestParamter {

	private final static String  consumerKey="18462081";
	/**
	 * @author fengchao
	 * @data: 2016年12月8日
	 * @注释：从map中提取封装请求参数格式
	 */
	public static String getParamter(HashMap<String, Object> map,String sign){
		StringBuilder builder=new StringBuilder();
		builder.append("consumerKey=").append(consumerKey);
		map.put("timestamp", Md5Url.getTimestamp());
		for (Map.Entry<String,Object> entry : map.entrySet()) {
			builder.append("&").append(entry.getKey()).append("=").append(entry.getValue());
		}
		builder.append("&sign=").append(sign);
		return builder.toString();
	}
	/**
	 * @author fengchao
	 * @date 2016年12月8日
	 * 注释:将书的参数及值封装进map
	 */
	public static HashMap<String,Object> getBookParamMap(BookInfo book){
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("categoryId",book.getCategoryId());
		map.put("categoryId",book.getCategoryId());
		map.put("bookKey",book.getBookKey());
		map.put("title",book.getTitle());
		map.put("payType",book.getPayType());
		map.put("price",book.getPrice());
		map.put("author",book.getAuthor());
		map.put("status", book.getStatus());
		map.put("bookType", book.getBookType());
		map.put("description", book.getDescription());
		return map;
	}
	/**
	 * @author fengchao
	 * @date 2016年12月8日
	 * 注释：将卷的参数及值封装进map
	 */
	public static HashMap<String,Object> getChapterParamMap(Chapter chapter){
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("title", chapter.getTitle());
//		map.put("description", chapter.getDescription());
		/*map.put("bookId", chapter.getBookId());*/
		map.put("bookKey",chapter.getBookKey());
		map.put("preChapterId",chapter.getPreChapterId());
		map.put("chapterKey", chapter.getChapterKey());
		return map;
	}
	/**
	 * @author fengchao
	 * @date 2016年12月8日
	 * 注释:将章节的参数及值封装进map
	 */
	public static HashMap<String,Object> getSectionParamMap(Section section){
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("title", section.getTitle());
		map.put("content", section.getContent());
		map.put("bookId", section.getBookId());
		map.put("bookKey",section.getBookKey());
		map.put("sectionKey",section.getSectionKey());
		map.put("chapterKey", section.getChapterKey());
		map.put("preSectionId", section.getPreSectionId());
		return map;
	}
	/**
	 * @author fengchao
	 * @date 2016年12月7日
	 * @param connect(httpConnect连接)，requestMethord(请求类型，post或者get),map(封装的请求数据，不用封装consumerKey和secretKey)
	 * 注释:MD5编码encode url后发送数据到相应的请求地址,并获取响应结果
	 */
	 public static String sendData(HttpConnect connect,String requestMethord,HashMap<String, Object> map){
		String newstr=Md5Url.encodeUrl(connect.getUrladdress(), requestMethord,map);
		System.out.println(RequestParamter.getParamter(map, newstr));
		String msg=connect.sendStr(RequestParamter.getParamter(map, newstr));  //发送请求,获取响应
		return msg;
//		return connect.read();
	}
}
