package com.wyDemo.util;

import java.util.HashMap;
import java.util.Map;

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
}
