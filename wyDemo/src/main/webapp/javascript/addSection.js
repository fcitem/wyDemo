$(document).ready(function(){
	/*实例化编辑器 */
	var ue = UE.getEditor('container', {
        autoHeight: false
    });
	$("#submit").click(function(){
		var text=ue.getPlainText();
		$.ajax({
			type:"POST",
			url:"/wyDemo/addSection",
			data:{
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