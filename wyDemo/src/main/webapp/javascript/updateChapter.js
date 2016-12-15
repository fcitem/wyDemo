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
		var param={
				bookKey:$("#bookKey").val(),
				bookId:$("#bookId").val(),
				preChapterId:$("#preChapterId").val(),
				preChapterKey:$("#preChapterKey").val(),
				chapterKey:$("#chapterKey").val(),
				title:$("#title").val(),
				description:text
		};
		$.ajax({
			headers : {
				'Accept' : 'application/json',
				'Content-Type' : 'application/json'
			},
			type:"POST",
			url:"/wyDemo/updateChapter",
			data:JSON.stringify(param),
			success:function(data){
				alert(data);
			},
			error:function(){
				alert("测试失败");
			}
		})
	})
	
});