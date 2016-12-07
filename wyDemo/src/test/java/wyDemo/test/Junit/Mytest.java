package wyDemo.test.Junit;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.wyDemo.pro.BookInfo;
import com.wyDemo.util.Md5Url;
import com.wyDemo.util.RequestParamter;

import wyDemo.httpconnect.Util.HttpConnect;

public class Mytest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
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
		BookInfo book=new BookInfo();
		String url="http://testapi.yuedu.163.com/book/add.json";
		HttpConnect connect=HttpConnect.getHttpConnect(url);
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("categoryId",1);
		map.put("title",book.getTitle());
		map.put("price",3);
		map.put("author","wy");
		map.put("status", 2);
		map.put("bookType", 1);
		map.put("description", book.getDescription());
		/*try {
			map.put("url",URLEncoder.encode("http://www.koalacan.com/app/publishList.html","UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}*/
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
		HashMap<String,Object> map=new HashMap<String,Object>();
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
		HashMap<String,Object> map=new HashMap<String,Object>();
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
}
