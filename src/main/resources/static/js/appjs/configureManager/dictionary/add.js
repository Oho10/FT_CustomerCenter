$().ready(function() {
	validateRule();
});

$.validator.setDefaults({
	submitHandler : function() {
		save();
	}
});
function save() {
	$.ajax({
		cache : true,
		type : "POST",
		url : "/configureManager/dictionary/save",
		data : $('#signupForm').serialize(),// 你的formid
		async : false,
		error : function(request) {
			parent.layer.alert("Connection error");
		},
		success : function(data) {
			if (data.code == 0) {
				parent.layer.msg("操作成功");
				parent.reLoad();
				var index = parent.layer.getFrameIndex(window.name); // 获取窗口索引
				parent.layer.close(index);

			} else {
				parent.layer.alert(data.msg)
			}

		}
	});

}
//文本框验证
function validateRule() {
	var icon = "<i class='fa fa-times-circle'></i> ";
	$("#signupForm").validate({
		rules : {
			dictNumber : {
				required : true
			},
			dictName : {
				required : true
			},
			dictSort : {
				required : true
			}
		},
		messages : {
			dictNumber : {
				required : icon + "请输入字典编码"
			},
	        dictName : {
				required : icon + "请输入字典名称"
	         },
			dictSort : {
				required : icon + "请输入字典排序号"
			}
		}
	})
}