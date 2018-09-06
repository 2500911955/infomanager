var prefix = "/talents";
$(function() {
	load();
});

function load() {
	$('#exampleTable').bootstrapTable({
		method : 'get', // 服务器数据的请求方式 get or post
		url : prefix + "/list", // 服务器数据的加载地址
		striped : true, // 设置为true会有隔行变色效果
		dataType : "json", // 服务器返回的数据类型
		pagination : true, // 设置为true会在底部显示分页条
		// queryParamsType : "limit",
		// //设置为limit则会发送符合RESTFull格式的参数
		singleSelect : false, // 设置为true将禁止多选
		iconSize : 'outline',
		toolbar : '#exampleToolbar',
		// contentType : "application/x-www-form-urlencoded",
		// //发送到服务器的数据编码类型
		pageSize : 10, // 如果设置了分页，每页数据条数
		pageNumber : 1, // 如果设置了分页，首页页码
		search : true, // 是否显示搜索框
		showColumns : true, // 是否显示内容下拉框（选择显示的列）
		sidePagination : "client", // 设置在哪里进行分页，可选值为"client" 或者
		// "server"
		// queryParams : queryParams,
		// //请求服务器数据时，你可以通过重写参数的方式添加一些额外的参数，例如 toolbar 中的参数 如果
		// queryParamsType = 'limit' ,返回参数必须包含
		// limit, offset, search, sort, order 否则, 需要包含:
		// pageSize, pageNumber, searchText, sortName,
		// sortOrder.
		// 返回false将会终止请求
		columns : [ { // 列配置项
			// 数据类型，详细参数配置参见文档http://bootstrap-table.wenzhixin.net.cn/zh-cn/documentation/
			checkbox : true
		// 列表中显示复选框
		}, {
			field : 'pid', // 列字段名
			title : '编号' // 列标题
		}, {
			field : 'pname',
			title : '姓名'
		}, {
			field : 'unit.uname',
			title : '单位'
		}, {
			field : 'pplace',
			title : '籍贯'
		}, {
			field : 'pqualification',
			title : '任职资格'
		}, {
			field : 'pidentity',
			title : '身份'
		}, {
			field : 'pset',
			title : '系列'
		}, {
			field : 'plevel',
			title : '级别'
		} ]
	});
}

function reLoad() {
	$('#exampleTable').bootstrapTable('refresh');
}