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
<script type="text/javascript" src="javascript/updateChapter.js"></script>
<script type="text/javascript"></script>
<title>chapterDescription</title>
</head>
<body>
   <div>
        <label>BookId</label>
    	<input type="text" name="bookId" id="bookId">
    	<label>BookKey</label>
    	<input type="text" id="bookKey" name="bookKey"/>
    	<label>preChapterId</label>
    	<input type="text" id="preChapterId" name="preChapterId"/>
    	<label>preChapterKey</label>
    	<input type="text" id="preChapterKey" name="preChapterKey"/>
    	<label>chapterKey</label>
    	<input type="text" id="chapterKey" name="chapterKey"/>
    	<label>标题</label>
    	<input type="text" id="title" name="title"/>
    </div>
	<div id="container" name="content"></div>
    <div>
    	<button id="submit">提交</button>
    </div>
</body>
</html>