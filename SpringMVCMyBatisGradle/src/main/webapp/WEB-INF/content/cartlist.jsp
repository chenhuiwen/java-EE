<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

 
   <title>购物车</title>

   
 <meta name="description" content="Source code generated using layoutit.com">
  
  <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
  
  <link href="css/style.css" rel="stylesheet">
  <style type="text/css">
  #div1{
    	width:35%;
    	height:600px;  
    }
    #div2{
    	width:65%;
    	height:600px;   
    }
    
	table{border-collapse:collapse;border-spacing:0;border-left:1px solid #888;border-top:1px solid #888;background:#efefef;}
	th,td{border-right:1px solid #888;border-bottom:1px solid #888;padding:5px 15px;}
	th{font-weight:bold;background:#ccc;}

    
  </style>
 
</head>
<body>
<div class="container-fluid">
	<div class="row">
	<div style="width:100%;height:150px;"></div>
	
		<div class="col-md-6" id="div1">
		<img alt="购物车" src="image/cart.jpg">
		</div>
		<div class="col-md-6" id="div2">
			<h1>${sessionScope.user.username }的购物车
	<a class="btn btn-primary" href="main" role="button">继续购物</a>
	<a class="btn btn-danger" href="clearcart" role="button">清空购物车</a></h1>
		<table border="1">
	<tr>
		<th width="150px">图片</th><th>名称</th><th>价格</th><th>数量</th><th>操作</th>
	</tr>
	<c:forEach items="${requestScope.cart_list }" var="cart">
		
		<tr>
			<td><img src="image/${cart.image }" height="60"></td>
			<td>${cart.name }</td>
			<td>${cart.price }</td>
			<td>${cart.count }</td>
			<td>
			<form action="removecart" method="post" >
			<input type="submit" value="-">
			<input type="hidden" id="god_sn" name="good_sn" value="${cart.good_sn}">
			</form>
			<form action="removecart" method="post" >
			<input type="submit" value="删除">
			<input type="hidden" id="id" name="id" value="${cart.id}">
			</form>
			<form action="addorder" method="post" >
			<input type="submit" value="立即购买">
			<input type="hidden" id="good_sn" name="good_sn" value="${cart.good_sn}">
			<input type="hidden" id="user_sn" name="user_sn" value="${cart.user_sn}">
			</form>
			</td>
		</tr>
		
	</c:forEach>
</table>
<form action="clearcart" method="post">

</form>

		</div>
	</div>
</div>
 <script src="js/jquery.min.js"></script>
   
 <script src="js/bootstrap.min.js"></script>
  
  <script src="js/scripts.js"></script>
</body>
</html>