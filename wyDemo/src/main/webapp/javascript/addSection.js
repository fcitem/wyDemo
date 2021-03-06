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
				preSectionId:$("#preSectionId").val(),
				preSectionKey:$("#preSectionKey").val(),
				chapterId:$("#chapterId").val(),
				chapterKey:$("#chapterKey").val(),
				sectionKey:$("#sectionKey").val(),
				needPay:$("#needPay").val(),
				price:$("#price").val(),
				title:$("#title").val(),
				content:text
		};
		$.ajax({
			headers : {
				'Accept' : 'application/json',
				'Content-Type' : 'application/json'
			},
			type:"POST",
			url:"/wyDemo/addSection",
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