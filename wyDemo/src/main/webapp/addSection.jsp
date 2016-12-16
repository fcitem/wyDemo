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
<script type="text/javascript" src="javascript/addSection.js"></script>
<script type="text/javascript"></script>
<title>sectionDescription</title>
</head>
<body>
	<div>
        <label>BookId</label>
    	<input type="text" name="bookId" id="bookId">
    	<label>BookKey</label>
    	<input type="text" id="bookKey" name="bookKey"/>
    	<label>chapterId</label>
    	<input type="text" name="chapterId" id="chapterId">
    	<label>chapterKey</label>
    	<input type="text" id="chapterKey" name="chapterKey"/>
    	<label>preSectionId</label>
    	<input type="text" id="preSectionId" name="preSectionId"/>
    	<label>preSectionKey</label>
    	<input type="text" id="preSectionKey" name="preSectionKey"/>
    	<label>sectionKey</label>
    	<input type="text" id="sectionKey" name="sectionKey"/>
    </div>
    <div>
    	<label>标题</label>
    	<input type="text" id="title" name="title"/>
    	<label>是否付费</label>
    	<select name="needPay" id="needPay">
    		<option value="0">免费</option>
    		<option value="1">付费</option>
    	</select>
    	<label>价格</label>
    	<input type="text" name="price" id="price">
    </div>
	<div id="container" name="content"></div>
    <div>
    	<button id="submit">提交</button>
    </div>
</body>
</html>