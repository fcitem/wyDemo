<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 加载编辑器的容器 -->
    <!-- <script id="container" name="content" type="text/plain"></script> -->
    <div id="container" name="content"></div>
    <!-- 配置文件 -->
    <script type="text/javascript" src="excresource/ueditor-1.4.3.3-jsp/ueditor.config.js"></script>
    <!-- 编辑器源码文件 -->
    <script type="text/javascript" src="excresource/ueditor-1.4.3.3-jsp/ueditor.all.min.js"></script>
    <script type="text/javascript" src="excresource/jquery-2.2.3.min.js"></script>
    <script type="text/javascript" src="javascript/test.js"></script>
    <script type="text/javascript">
        /* var ue = UE.getEditor('container', {
            autoHeight: false
        }); */

      //对编辑器的操作最好在编辑器ready之后再做
    </script>
    <div>
    	<button id="submit">提交</button>
    </div>
</body>
</html>
