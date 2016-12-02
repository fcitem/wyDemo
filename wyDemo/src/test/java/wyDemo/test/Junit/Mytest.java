package wyDemo.test.Junit;

import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.wyDemo.pro.BookInfo;
import com.wyDemo.pro.ReturnMsg;
import com.wyDemo.util.Md5Url;

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
		String newstr=Md5Url.encodeUrl("http://testapi.yuedu.163.com/book/category.json", "Post",new HashMap<String,Object>());
		connect.sendStr("consumerKey=18462081&timestamp="+System.currentTimeMillis()+"&sign="+newstr);
		connect.read();
	}

}
