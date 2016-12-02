package com.wyDemo.pro;

/**
 * @author fengchao
 * @date 2016年12月1日
 * @注释 返回json格式bean
 */
public class ReturnMsg {
	private String code;       //返回状态码
	private Object categorys;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Object getCategorys() {
		return categorys;
	}
	public void setCategorys(Object categorys) {
		this.categorys = categorys;
	}

}
