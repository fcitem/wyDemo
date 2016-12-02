package com.wyDemo.util;

import java.util.HashMap;
import java.util.Map;

public class RequestParamter {

	private final static String  consumerKey="18462081";
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
}
