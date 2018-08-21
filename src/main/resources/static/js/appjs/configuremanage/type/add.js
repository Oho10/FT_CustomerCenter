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
		url : "/configuremanage/type/save",
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
function validateRule() {
	var icon = "<i class='fa fa-times-circle'></i> ";
	$("#signupForm").validate({
		rules : {
			typeNumber : {
				required : true
			},
			typeName : {
				required : true

		     },
			canEdit : {
				required : true
			}
		   },
		messages : {
			typeNumber : {
				required : icon + "请输入类型编码"
			},
			typeName: {
				required : icon + "请输入类型名称"
			},
			canEdit: {
				required : icon + "请输入是否可修改"
			}

		}
	})
}