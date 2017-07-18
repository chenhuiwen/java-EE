<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h3>注册界面</h3>
<form action="update" method="post">
<table>
<tr><td>登陆名:${sessionScope.user.loginname }</td></tr>
<tr><td>旧密码：${sessionScope.user.password }</td></tr>
<tr><td>用户名：${sessionScope.user.username }</td></tr>
<tr><td>电话：${sessionScope.user.phone }</td></tr>
<tr><td>新密码：<input type="text" id="new1" name="new1"> </td></tr>
<tr><td>确认密码：<input type="text" id="new2" name="new2"> </td></tr>
<tr><td><input type="submit" value="修改"> </td></tr>
</table>
<input type="hidden" id="loginname" name="loginname" value="${sessionScope.user.loginname }">
</form>
</center>
</body>
</html>