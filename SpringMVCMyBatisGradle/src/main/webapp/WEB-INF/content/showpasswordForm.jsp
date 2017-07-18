<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
 
 <head>
 
   <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

 
   <title>找回密码</title>

   
 <meta name="description" content="Source code generated using layoutit.com">
  
  <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
  
  <link href="css/style.css" rel="stylesheet">

 
 </head>
 
 <body>

 <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<h3>
				成功找回密码！
			</h3> 
			<h4>亲爱的${sessionScope.user.username }，您的密码是：${sessionScope.user.password }</h4>
			<a href="loginForm">返回登录</a><br>
			<a href="updateForm">修改密码</a>
		</div>
	</div>
</div>
  
  <script src="js/jquery.min.js"></script>
   
 <script src="js/bootstrap.min.js"></script>
  
  <script src="js/scripts.js"></script>
  </body>
</html>