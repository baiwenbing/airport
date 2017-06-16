<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/user/insertUser.do">
		名字：<input name="uname">
		密码：<input name="upwd">
		真实姓名：<input name="urealname">
		性别：<input name="usex">
		年龄：<input name="uage">
		生日：<input name="ubirthday">
		省份证号：<input name="uidnum">
		邮箱：<input name="uemail">
		电话：<input name="uphone">
		钱包：<input name="money_mid">
		<button>提交</button>
</body>
</html>