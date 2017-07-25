<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<table border="1">
	<tr>
		<th width="150px">序号</th><th width="150px">订单号</th><th>订单状态</th><th>查看详情</th><th>删除</th><th>已收到货</th>
	</tr>
	<c:forEach items="${requestScope.order_list }" var="order">
		
		<tr>
			<td>${order.id }</td>
			<td>${order.id }${order.user_sn }${order.good_sn }</td>
			<td>${order.state }</td>
			<td>
			<form action="selectorder" method="post">
			<input type="submit" value="查看详情">
			<input type="hidden" id="id" name="id" value="${order.id}">
			</form>
			</td>
			<td>
			<form action="deleteorder" method="post" >
			<input type="submit" value="删除">
			<input type="hidden" id="id" name="id" value="${order.id}">
			</form>
			</td>
			<td>
			<form action="endorder" method="post" >
			<input type="submit" value="已收到货">
			<input type="hidden" id="good_id" name="good_id" value="${order.good_sn}">
			<input type="hidden" id="id" name="id" value="${order.id}">
			</form>
			</td>
		</tr>
		
	</c:forEach>
</table>
</div>
</body>
</html>