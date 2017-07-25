<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<meta name="description" content="Source code generated using layoutit.com">
  
  <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div>
<center>
<h2>订单详情</h2>
<h3>订单号：${sessionScope.order.id}</h3>
<h3>商品名称：${sessionScope.order.good}</h3>
<h3>商品id：${sessionScope.order.good_sn}</h3>
<h3>用户id：${sessionScope.order.user_sn}</h3>
<h3>订单状态：${sessionScope.order.state}</h3>
<a class="btn btn-primary" href="evaluateForm" role="button">立即评价</a>
<a class="btn btn-primary" href="main" role="button">继续购物</a>
</center>
</div>
</body>
</html>