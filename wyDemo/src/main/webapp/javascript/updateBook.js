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
			url:"/wyDemo/updateBook",
			data:{
				categoryId:$("#categoryId").val(),
				bookKey:$("#bookKey").val(),
				author:$("#author").val(),
				title:$("#title").val(),
				payType:$("#payType").val(),
				price:$("#price").val(),
				publisher:$("#publisher").val(),
				authorDesc:$("#authorDesc").val(),
				status:$("#status").val(),
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