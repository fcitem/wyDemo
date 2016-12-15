<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- 配置文件 -->
<script type="text/javascript" src="excresource/ueditor-1.4.3.3-jsp/ueditor.config.js"></script>
<!-- 编辑器源码文件 -->
<script type="text/javascript" src="excresource/ueditor-1.4.3.3-jsp/ueditor.all.min.js"></script>
<script type="text/javascript" src="excresource/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="javascript/updateBook.js"></script>
<script type="text/javascript"></script>
<title>Description</title>
</head>
<body>
	<div>
    	<label>BookKey</label>
    	<input type="text" id="bookKey" name="bookKey"/>
    	<label>CategoryId</label>
    	<input type="text" name="categoryId" id="categoryId">
    	<label>标题</label>
    	<input type="text" id="title" name="title"/>
    	<label>付费方式</label>
    	<select name="payType" id="payType">
    		<option value="0">免费</option>
    		<option value="1">付费</option>
    	</select>
    </div>
    <div style="margin-top: 50px;margin-bottom: 50px">
    	<label>价格</label>
    	<input type="text" name="price" id="price">
    	<label>作者</label>
    	<input type="text" name="author" id="author">
    	<label>出版社</label>
    	<input type="text" name="publisher" id="publisher">
    	<label>作者简介</label>
    	<input type="text" name="authorDesc" id="authorDesc">
    	<label>书籍状态</label>
    	<select id="status" name="status">
    	    <option value="0">连载</option>
    	    <option value="1">完结</option>
    	    <option value="2">试读非完整</option>
    	</select>
    </div>
	<div id="container" name="content"></div>
    <div>
    	<button id="submit">提交</button>
    </div>
</body>
</html>