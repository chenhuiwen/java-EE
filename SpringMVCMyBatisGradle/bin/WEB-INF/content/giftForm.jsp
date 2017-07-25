<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link href="css/bootstrap.min.css" rel="stylesheet">
  
  <link href="css/style.css" rel="stylesheet">
  <style type="text/css">
  #container{
    	width:100%;
    	height:150px;
    	background-image:url(image/背景2.jpg);   
    }
   
  </style>
</head>
<body>
<div class="container-fluid">
<div class="row" id="container">
		<div style="width:100%;height:50px;">
		</div>
		<div class="col-md-12">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					 
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						 <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
					</button> <a class="navbar-brand" href="">首页</a>
				</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active">
							<a href="loginForm">欢迎登录</a>
						</li>
						<li>
							<a href="saveForm">免费注册</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">我的小屋<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									<a href="cartlist" >购物车</a>
									
								</li>
								<li>
									<a href="orderlist">订单</a>
								</li>
								<li>
									<a href="#">评价</a>
								</li>
								<li>
									<form action="collectlist" method="post">
									<input type="hidden" id="user_sn" name="user_sn" value=${sessionScope.user.id }>
									<input type="submit" value="收藏">
									</form>
								</li>
				
							</ul>
						</li>
					</ul>
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control" />
						</div> 
						<button type="submit" class="btn btn-default">
							Submit
						</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						<li>
							<a href="main">返回首页</a>
						</li>
		
					</ul>
				</div>
				
			</nav>
		</div>
		欢迎[${sessionScope.user.username }]访问
	<div class="row">
		<div class="col-md-12">
			<div class="row">
				<c:forEach items="${requestScope.good_list }" var="good">
				<div class="col-md-4" >
					<div class="thumbnail">
						<img alt="加载中" src="image/${good.image }" height="200px" width="200px"/>
						<div class="caption">
							<h3>
								${good.name }
							</h3>
							<h4>￥${good.price }</h4>
							<p>
								<form action="select" method="post" >
								<input type="hidden" id="id" name="id" value="${good.id }">
								<input type="submit" value="查看详情">
								</form>
								 <form action="addCart" method="post">
								 <input type="hidden" id="id" name="id" value="${good.id }">
								 <input type="hidden" id="name" name="name" value="${good.name }">
								 <input type="hidden" id="price" name="price" value="${good.price }">
								 <input type="hidden" id="image" name="image" value="${good.image }">
								 <input type="hidden" id="user_sn" name="user_sn" value="${sessionScope.user.id }">
								 <input type="submit" value="加入购物车">
								 </form>
							
						</div>
					</div>
				</div>
				</c:forEach>
				
			</div>
		</div>

	</div>
</div>
</div>
<script src="js/jquery.min.js"></script>
   
 <script src="js/bootstrap.min.js"></script>
  <script src="js/jquery-1.10.2.js"></script>
  
  <script src="js/scripts.js"></script>
</body>
</html>