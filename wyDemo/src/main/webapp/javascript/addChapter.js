$(document).ready(function(){
	/*实例化编辑器 */
	var ue = UE.getEditor('container', {
		toolbars: [
	        []
	    ],
        autoHeight: true
    });
	$("#submit").click(function(){
		var text=ue.getPlainTxt();
		$.ajax({
			type:"POST",
			url:"/wyDemo/addChapter",
			data:{
				bookKey:$("#bookKey").val(),
				bookId:$("#bookId").val(),
				preChapterId:$("#preChapterId").val(),
				preChapterKey:$("#preChapterKey").val(),
				chapterKey:$("#chapterKey").val(),
				title:$("#title").val(),
				description:text
			},
			success:function(data){
				alert(data);
			},
			error:function(){
				alert("测试失败");
			}
		})
	})
	
});