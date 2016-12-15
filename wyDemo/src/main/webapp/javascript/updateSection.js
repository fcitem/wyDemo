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
		alert(text);
		$.ajax({
			type:"POST",
			url:"/wyDemo/updateSection",
			data:{
				bookKey:$("#bookKey").val(),
				bookId:$("#bookId").val(),
				preSectionId:$("#preSectionId").val(),
				preSectionKey:$("#preSectionKey").val(),
				chapterId:$("#chapterId").val(),
				chapterKey:$("#chapterKey").val(),
				sectionKey:$("#sectionKey").val(),
				needPay:$("#needPay").val(),
				price:$("#price").val(),
				title:$("#title").val(),
				content:text
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