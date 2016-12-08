package wyDemo.httpconnect.Util;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author fengchao
 * @data:2016年11月29日
 * @注释：通过后台代码模拟请求httpUrl地址
 */
public class HttpConnect {
	public String urladdress="http://testapi.yuedu.163.com/book/add.json";     //请求的地址
	URL Url;
	HttpURLConnection connect=null;
	OutputStreamWriter out;
	private HttpConnect(String url) {
		this.urladdress=url;
		this.getconnect();
	}	
	/**
	 * @author fengchao
	 * @date 2016年12月8日
	 * 注释:新建一个HttpConnect返回
	 */
	public static HttpConnect getHttpConnect(String url){
		return new HttpConnect(url);
	}
	private void getconnect(){
		try {
			Url=new URL(urladdress);
			connect=(HttpURLConnection) Url.openConnection();
			connect.setDoOutput(true);      //鏍囧織璁剧疆涓� true锛屾寚绀� 搴旂敤绋嬪簭瑕佷粠 URL杩炴帴璇诲彇鏁版嵁
			connect.setDoInput(true);
			connect.setRequestMethod("POST");
			connect.setUseCaches(false);
			 //application/x-javascript text/xml->xml鏁版嵁 application/x-javascript->json瀵硅薄 application/x-www-form-urlencoded->琛ㄥ崟鏁版嵁
			connect.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
//			connect.setRequestProperty("Content-Type", "application/json");
			connect.connect();
			out=new OutputStreamWriter(connect.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String getUrladdress() {
		return urladdress;
	}
	public void send(Object obj){
		ObjectMapper mapper=new ObjectMapper();
		String msg;
		try {
			msg = mapper.writeValueAsString(obj);
			System.out.println(msg);
			sendtest(msg);
		} catch (JsonProcessingException e) {
		}
	}
	public void sendtest(String s){
		try {
			out.write(s);
			out.flush();
			out.close();
			connect.getInputStream();  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void sendStr(String msg)
	{
		try {
			out.write(msg);
			out.flush();
			out.close();
			connect.getInputStream();  //此处才是真正的发送数据
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void read(){
		try {
			BufferedReader reader=new BufferedReader(new InputStreamReader(connect.getInputStream()));
			System.out.println(reader.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
