<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/planeticket/jquery-easyui-1.5.2/themes/default/easyui.css">
<link  rel="stylesheet" href="/planeticket/jquery-easyui-1.5.2/themes/icon.css">
<script type="text/javascript" src="/planeticket/jquery-easyui-1.5.2/jquery.min.js"></script>
<script type="text/javascript" src="/planeticket/jquery-easyui-1.5.2/jquery.easyui.min.js"></script>
</head>
<body>
	<div>
		<table class="easyui-datagrid" url="/planeticket/admUser?method=loginadmUser"  method="post" id="table">
			<thead>
				<tr>
					<th field="ck" checkbox="true" ></th>
					<th field="admid" style="display: none" ></th>
					<th field="admname"  width="80">用户名</th>
					<th field="admpwd"  width="80">用户密码</th>
					<th field="admper"  width="80">权限</th>
				</tr>			
			</thead>
		</table>
	</div>
</body>
</html>