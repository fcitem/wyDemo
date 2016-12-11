$(document).ready(function(){
	/*实例化编辑器 */
	var ue = UE.getEditor('container', {
        autoHeight: false
    });
	$("#submit").click(function(){
		var text=ue.getContent();
		$.ajax({
			type:"POST",
			url:"/wyDemo/updateBook",
			data:{
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