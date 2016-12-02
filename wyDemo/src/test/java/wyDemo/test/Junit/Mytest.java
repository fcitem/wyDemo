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
import com.wyDemo.pro.ReturnMsg;
import com.wyDemo.util.Md5Url;
import com.wyDemo.util.RequestParamter;

import wyDemo.httpconnect.Util.jsonConnect;

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

	@Test
	public void test() {
		BookInfo book=new BookInfo();
		book.setCategoryId(123456789);
		book.setName("测试数据");
		book.setType(0);
		BookInfo parent=new BookInfo();
		parent.setCategoryId(23456);
		parent.setName("测试");
		parent.setType(0);
		book.setParent(parent);
		ReturnMsg msg=new ReturnMsg();
		msg.setCode("200");
		msg.setCategorys(book);
		jsonConnect connect=new jsonConnect();
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("categoryId",1);
		map.put("title","fc的书");
		map.put("price",3);
		map.put("author","wy");
		map.put("status", 2);
		map.put("bookType", 1);
		map.put("description", "这是一本书");
		try {
			map.put("url",URLEncoder.encode("http://www.koalacan.com/app/publishList.html","UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String newstr=Md5Url.encodeUrl("http://testapi.yuedu.163.com/book/add.json", "Post",new HashMap<String,Object>());
		System.out.println(RequestParamter.getParamter(map, newstr));
		connect.sendStr(RequestParamter.getParamter(map, newstr));
		connect.read();
	}

}
