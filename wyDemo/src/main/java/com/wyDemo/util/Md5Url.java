package com.wyDemo.util;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author fengchao
 * @data:2016年12月1日
 * @注释：md5加密工具类
 */
public class Md5Url {
	private final static String  consumerKey="18462081";
	private final static String  secretKey="qfMX8XnovK9CFHbf";
	private static long timestamp;
	private static String md5Url=null;
	public static long getTimestamp() {
		return timestamp;
	}
	public static void setTimestamp(long timestamp) {
		Md5Url.timestamp = timestamp;
	}
	public static String encodeUrl(String url,String requestMethord,HashMap<String,Object> map){
		StringBuilder builder=new StringBuilder();
		builder.append(requestMethord);
		builder.append(url);
		timestamp=System.currentTimeMillis();
		builder.append("timestamp="+timestamp);
		builder.append(secretKey);
		builder.append("consumerKey="+consumerKey);
		Iterator<String> it=map.keySet().iterator();
		while(it.hasNext()){
			String key=it.next();
			builder.append(key).append("=").append(map.get(key));
		}
		try {
//			md5=MessageDigest.getInstance("MD5");
			String encodeUrl=(URLEncoder.encode(builder.toString(), "UTF-8"));
//			BASE64Encoder base64en = new BASE64Encoder();
			//加密后的字符串
			md5Url=MD5.getInstance().getMD5(encodeUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return md5Url;
	}

}
