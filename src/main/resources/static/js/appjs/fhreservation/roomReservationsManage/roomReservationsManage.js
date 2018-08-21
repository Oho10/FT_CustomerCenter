
var prefix = "/fhreservation/roomReservationsManage"
$(function() {
	load();
});

function load() {
	$('#exampleTable')
			.bootstrapTable(
					{
						method : 'get', // 服务器数据的请求方式 get or post
						url : prefix + "/list", // 服务器数据的加载地址
					//	showRefresh : true,
					//	showToggle : true,
					//	showColumns : true,
						iconSize : 'outline',
						toolbar : '#exampleToolbar',
						striped : true, // 设置为true会有隔行变色效果
						dataType : "json", // 服务器返回的数据类型
						pagination : true, // 设置为true会在底部显示分页条
						// queryParamsType : "limit",
						// //设置为limit则会发送符合RESTFull格式的参数
						singleSelect : false, // 设置为true将禁止多选
						// contentType : "application/x-www-form-urlencoded",
						// //发送到服务器的数据编码类型
						pageSize : 10, // 如果设置了分页，每页数据条数
						pageNumber : 1, // 如果设置了分布，首页页码
						//search : true, // 是否显示搜索框
						showColumns : false, // 是否显示内容下拉框（选择显示的列）
						sidePagination : "server", // 设置在哪里进行分页，可选值为"client" 或者 "server"
						queryParams : function(params) {
							return {
								//说明：传入后台的参数包括offset开始索引，limit步长，sort排序列，order：desc或者,以及所有列的键值对
								limit: params.limit,
								offset:params.offset
					           // name:$('#searchName').val(),
					           // username:$('#searchName').val()
							};
						},
						// //请求服务器数据时，你可以通过重写参数的方式添加一些额外的参数，例如 toolbar 中的参数 如果
						// queryParamsType = 'limit' ,返回参数必须包含
						// limit, offset, search, sort, order 否则, 需要包含:
						// pageSize, pageNumber, searchText, sortName,
						// sortOrder.
						// 返回false将会终止请求
						columns : [
								{
									checkbox : true
								},
																{
									field : 'reservationId', 
									title : '预约编号' 
								},
									/*						{
									field : 'reservationPlaceId', 
									title : '预约地点' 
								},
																{
									field : 'reservationFloorId', 
									title : '预约楼层' 
								},
																{
									field : 'reservationRoomId', 
									title : '预约房间ID' 
								},*/
																{
									field : 'reservationDate', 
									title : '预约日期' 
								},
																{
									field : 'reservationDateStart', 
									title : '预约时段起' 
								},
																{
									field : 'reservationDateStop', 
									title : '预约时段止' 
								},
									/*							{
									field : 'reservationHour',
									title : '预约时长'
								},*/
																{
									field : 'reservationType', 
									title : '预约人类型'
								},
																{
									field : 'reservationPeopleId', 
									title : '预约人代码' 
								},
								/*								{
									field : 'reservationEmail', 
									title : '预约人邮箱' 
								},*/
																{
									field : 'reservationName', 
									title : '预约人姓名' 
								},
									/*							{
									field : 'phone', 
									title : '联系电话' 
								},
																{
									field : 'reservationCorporateName', 
									title : '预约人公司名称' 
								},
																{
									field : 'companyCode', 
									title : '公司区号' 
								},
																{
									field : 'customerName', 
									title : '客户名称' 
								},
																{
									field : 'colicyNumber', 
									title : '保单数量' 
								},
																{
									field : 'payMoney', 
									title : '付款金额' 
								},
																{
									field : 'visitorNumber', 
									title : '访客人数' 
								},
																{
									field : 'serviceRequireId', 
									title : '服务id' 
								},*/
																{
									field : 'reservationState', 
									title : '预约状态'
								},
									/*							{
									field : 'isTeam', 
									title : '是否团签 （01-否，02-是）默认为否01' 
								},
																{
									field : 'cancelReason', 
									title : '取消原因' 
								},
																{
									field : 'changeReason', 
									title : '变更原因' 
								},*/
								/*								{
									field : 'createTime', 
									title : '创建时间' 
								},
																{
									field : 'createById', 
									title : '创建人' 
								},
																{
									field : 'createByName', 
									title : '创建人姓名' 
								},
																{
									field : 'updateTime', 
									title : '修改时间' 
								},
																{
									field : 'updateById', 
									title : '修改人' 
								},
																{
									field : 'updateByName', 
									title : '修改人姓名' 
								},
											*/					{
									title : '操作',
									field : 'id',
									align : 'center',
									formatter : function(value, row, index) {
										var e = '<a class="btn btn-primary btn-sm '+s_edit_h+'" href="#" mce_href="#" title="编辑" onclick="edit(\''
												+ row.reservationId
												+ '\')"><i class="fa fa-edit"></i></a> ';
										var d = '<a class="btn btn-warning btn-sm '+s_remove_h+'" href="#" title="删除"  mce_href="#" onclick="remove(\''
												+ row.reservationId
												+ '\')"><i class="fa fa-remove"></i></a> ';
										var f = '<a class="btn btn-success btn-sm'+s_resetPwd_h+'" href="#" title="查看详情"  mce_href="#" onclick="resetPwd(\''
												+ row.reservationId
												+ '\')"><i class="fa fa-key"></i></a> ';
										return e + d + f;
									}
								} ]
					});
}
function reLoad() {
	$('#exampleTable').bootstrapTable('refresh');
}
function add() {
	layer.open({
		type : 2,
		title : '增加',
		maxmin : true,
		shadeClose : false, // 点击遮罩关闭层
		area : [ '800px', '520px' ],
		content : prefix + '/add' // iframe的url
	});
}
function edit(id) {
	layer.open({
		type : 2,
		title : '编辑',
		maxmin : true,
		shadeClose : false, // 点击遮罩关闭层
		area : [ '800px', '520px' ],
		content : prefix + '/edit/' + id // iframe的url
	});
}
function remove(id) {
	layer.confirm('确定要删除选中的记录？', {
		btn : [ '确定', '取消' ]
	}, function() {
		$.ajax({
			url : prefix+"/remove",
			type : "post",
			data : {
				'reservationId' : id
			},
			success : function(r) {
				if (r.code==0) {
					layer.msg(r.msg);
					reLoad();
				}else{
					layer.msg(r.msg);
				}
			}
		});
	})
}

function resetPwd(id) {
	layer.open({
		type : 2,
		title : '编辑',
		maxmin : true,
		shadeClose : false, // 点击遮罩关闭层
		area : [ '800px', '520px' ],
		content : prefix + '/details/' + id // iframe的url
	});
}
function batchRemove() {
	var rows = $('#exampleTable').bootstrapTable('getSelections'); // 返回所有选择的行，当没有选择的记录时，返回一个空数组
	if (rows.length == 0) {
		layer.msg("请选择要删除的数据");
		return;
	}
	layer.confirm("确认要删除选中的'" + rows.length + "'条数据吗?", {
		btn : [ '确定', '取消' ]
	// 按钮
	}, function() {
		var ids = new Array();
		// 遍历所有选择的行数据，取每条数据对应的ID
		$.each(rows, function(i, row) {
			ids[i] = row['reservationId'];
		});
		$.ajax({
			type : 'POST',
			data : {
				"ids" : ids
			},
			url : prefix + '/batchRemove',
			success : function(r) {
				if (r.code == 0) {
					layer.msg(r.msg);
					reLoad();
				} else {
					layer.msg(r.msg);
				}
			}
		});
	}, function() {

	});
}