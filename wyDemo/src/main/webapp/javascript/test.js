$(document).ready(function(){
	/*实例化编辑器 */
	var ue = UE.getEditor('container', {
        autoHeight: false
    });
	$("#submit").click(function(){
		var text=ue.getContent();
		$.ajax({
			
		})
	})
	
});