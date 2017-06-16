<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- <link rel="stylesheet" href="/planeticket/jquery-easyui-1.5.2/themes/default/easyui.css">
<link  rel="stylesheet" href="/planeticket/jquery-easyui-1.5.2/themes/icon.css">
<script type="text/javascript" src="/planeticket/jquery-easyui-1.5.2/jquery.min.js"></script>
<script type="text/javascript" src="/planeticket/jquery-easyui-1.5.2/jquery.easyui.min.js"></script>
 --></head>
<body>
	<form action="${pageContext.request.contextPath}/ficket/insertFicket.do">
		出发地：<input name="tstartplace">
		目的地：<input name="tendplace">
		舱位：<input name="tcabin">
		日期：<input name="tdate">
		座位：<input name="tsit">
		儿童：<input name="tchidren">
		幼儿：<input name="baby">
		价钱：<input name="tprice">
		姓名：<input name="tname">
		<button>提交</button>
</body>
</html>