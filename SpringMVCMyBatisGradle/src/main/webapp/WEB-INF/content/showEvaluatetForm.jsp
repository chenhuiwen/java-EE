<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
 
 <head>
 
   <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

 
   <title>Bootstrap 3, from LayoutIt!</title>

   
 <meta name="description" content="Source code generated using layoutit.com">
  
  <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
  
  <link href="css/style.css" rel="stylesheet">
  <style type="text/css">
	table{border-collapse:collapse;border-spacing:0;border-left:1px solid #888;border-top:1px solid #888;background:#efefef;}
	th,td{border-right:1px solid #888;border-bottom:1px solid #888;padding:5px 15px;}
	th{font-weight:bold;background:#ccc;}   
  </style>
 
</head>
 <body>    
	<div class="container-fluid">
	
		<div class="col-md-6" id="div2">
		<table border="1">
	<tr>
		<th>订单号</th><th>物流评分</th><th>质量评分</th><th>服务评分</th><th width="150px">图片</th><th>货号</th><th>评价人</th><th>内容</th><th>操作</th>
	</tr>
	<c:forEach items="${requestScope.evaluate_list }" var="evaluate">
		<form action="deleteevaluate" method="post" >
		<tr>
			<td>${evaluate.order_sn }</td>
			<td>${evaluate.point }</td>
			<td>${evaluate.point2 }</td>
			<td>${evaluate.point3 }</td>
			<td><img src="image/${evaluate.image }"></td>
			
			<td>${evaluate.good_sn }</td>
			<td>${evaluate.user_sn }</td>
			<td>${evaluate.text }</td>
			<td><input type="submit" value="删除"></td>
		</tr>
		<input type="hidden" id="id" name="id" value="${evaluate.id }">
		</form>
	</c:forEach>
	
</table>
<br>
<a class="btn btn-primary" href="main" role="button">继续购物</a>
		
		</div>
	</div>
</div>

  
  <script src="js/jquery.min.js"></script>
   
 <script src="js/bootstrap.min.js"></script>
  <script src="js/jquery-1.10.2.js"></script>
  
  <script src="js/scripts.js"></script>
  </body>
</html>