package wyDemo.test.Junit;

import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.wyDemo.pro.BookInfo;
import com.wyDemo.pro.Chapter;
import com.wyDemo.pro.Section;
import com.wyDemo.util.HttpConnect;
import com.wyDemo.util.Md5Url;
import com.wyDemo.util.RequestParamter;

public class Mytest {
 
	BookInfo book=new BookInfo();
	Chapter chapter=new Chapter();
	Section section=new Section();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	  chapter.setBookKey(book.getBookKey());
	  section.setBookKey(book.getBookKey());
	  section.setSectionKey(chapter.getChapterKey());
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * @author fengchao
	 * @date 2016年12月7日
	 * 注释 ：测试添加一本书
	 */
	@Test
	public void testAddBook() {
		String url="http://testapi.yuedu.163.com/book/add.json";
		HttpConnect connect=HttpConnect.getHttpConnect(url);
		HashMap<String,Object> map=getBookParamMap();
		sendData(connect, "POST",map);
	}
	/**
	 * @author fengchao
	 * @date 2016年12月7日
	 * 注释：测试更新一本书
	 */
	@Test
	public void testUpdateBook(){
		String url="http://testapi.yuedu.163.com/book/update.json";
		HttpConnect connect=HttpConnect.getHttpConnect(url);
		HashMap<String,Object> map=getBookParamMap();
		sendData(connect, "POST",map);
	}
	/**
	 * @author fengchao
	 * @date 2016年12月7日
	 * 注释:添加卷
	 */
	@Test
	public void addChapter(){
		String url="http://testapi.yuedu.163.com/bookChapter/add.json";
		HttpConnect connect=HttpConnect.getHttpConnect(url);
		HashMap<String,Object> map=getChapterParamMap();
		sendData(connect, "POST",map);
	}
	/**
	 * @author fengchao
	 * @date 2016年12月7日
	 * 注释：修改卷
	 */
	@Test
	public void updateChapter(){
		String url="http://testapi.yuedu.163.com/bookChapter/update.json";
		HttpConnect connect=HttpConnect.getHttpConnect(url);
		HashMap<String,Object> map=new HashMap<String,Object>();
		sendData(connect, "POST",map);
	}
	/**
	 * @author fengchao
	 * @date 2016年12月7日
	 * 注释：删除卷
	 */
	@Test
	public void deleteChapter(){
		String url="http://testapi.yuedu.163.com/bookChapter/delete.json";
		HttpConnect connect=HttpConnect.getHttpConnect(url);
		HashMap<String,Object> map=new HashMap<String,Object>();
		sendData(connect, "POST",map);
	}
	/**
	 * @author fengchao
	 * @date 2016年12月7日
	 * 注释：添加章节
	 */
	@Test
	public void addSection(){
		String url="http://testapi.yuedu.163.com/bookSection/add.json";
		HttpConnect connect=HttpConnect.getHttpConnect(url);
		HashMap<String,Object> map=new HashMap<String,Object>();
		sendData(connect, "POST",map);
	}
	/**
	 * @author fengchao
	 * @date 2016年12月7日
	 * 注释：修改章节
	 */
	@Test
	public void updateSection(){
		String url="http://testapi.yuedu.163.com/bookSection/update.json";
		HttpConnect connect=HttpConnect.getHttpConnect(url);
		HashMap<String,Object> map=new HashMap<String,Object>();
		sendData(connect, "POST",map);
	}
	/**
	 * @author fengchao
	 * @date 2016年12月7日
	 * 注释：删除章节
	 */
	@Test
	public void deleteSection(){
		String url="http://testapi.yuedu.163.com/bookSection/delete.json";
		HttpConnect connect=HttpConnect.getHttpConnect(url);
		HashMap<String,Object> map=new HashMap<String,Object>();
		sendData(connect, "POST", map);
	}
	/**
	 * @author fengchao
	 * @date 2016年12月7日
	 * @param connect(httpConnect连接)，requestMethord(请求类型，post或者get),map(封装的请求数据，不用封装consumerKey和secretKey)
	 * 注释:MD5编码encode url后发送数据到相应的请求地址
	 */
	public void sendData(HttpConnect connect,String requestMethord,HashMap<String, Object> map){
		String newstr=Md5Url.encodeUrl(connect.getUrladdress(), requestMethord,map);
		System.out.println(RequestParamter.getParamter(map, newstr));
		connect.sendStr(RequestParamter.getParamter(map, newstr));
		connect.read();
	}
	/**
	 * @author fengchao
	 * @date 2016年12月8日
	 * 注释:将书的参数及值封装进map
	 */
	public HashMap<String,Object> getBookParamMap(){
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("categoryId",book.getCategoryId());
		map.put("categoryId",book.getCategoryId());
		map.put("bookKey",book.getBookKey());
		map.put("title",book.getTitle());
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
	public HashMap<String,Object> getChapterParamMap(){
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("title", chapter.getTitle());
		map.put("description", chapter.getDescription());
		/*map.put("bookId", chapter.getBookId());*/
		map.put("bookKey",chapter.getBookKey());
//		map.put("preChapterId",chapter.getPreChapterId());
		map.put("chapterKey", chapter.getChapterKey());
		return map;
	}
	/**
	 * @author fengchao
	 * @date 2016年12月8日
	 * 注释:将章节的参数及值封装进map
	 */
	public HashMap<String,Object> getSectionParamMap(){
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
}
