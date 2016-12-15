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
				"categoryId":$("#categoryId").val(),
				"bookKey":$("#bookKey").val(),
				"author":$("#author").val(),
				"title":$("#title").val(),
				"payType":$("#payType").val(),
				"price":$("#price").val(),
				"publisher":$("#publisher").val(),
				"authorDesc":$("#authorDesc").val(),
				"status":$("#status").val(),
				"description":text
			};
		$.ajax({
			headers : {
				'Accept' : 'application/json',
				'Content-Type' : 'application/json'
			},
			type:"POST",
			url:"/wyDemo/updateBook",
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