<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
 
</head>
 <body>    
<div class="container-fluid" id="container2">
	
<div class="row">
		
<div class="col-md-12">
		<div style="width:100%; height:100px"></div>
	<h3>
				管理员登录
			</h3>
	
		<div class="row">
				<div class="col-md-4" style="width:30%;">
				
</div>
				
<div class="col-md-4">
				
	<form class="form-horizontal" role="form" action="alogin" method="post">
						<div class="form-group">
							 <img src="image/头像2.jpg" style="width:100px; height:100px;margin-left:180px;">
						</div>
						<div class="form-group">
							 
							<label  for="inputEmail3" class="col-sm-2 control-label">
								登录名
							</label>
							<div class="col-sm-10">
								<input type="text" id="loginname" name="loginname" class="form-control">
							</div>
						</div>
						<div class="form-group">
							 
							<label for="inputPassword3" class="col-sm-2 control-label">
								密 码
							</label>
							<div class="col-sm-10">
								<input type="password" id="password" name="password"  class="form-control" >
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<div class="checkbox">
									 
									<label>
										<input name="aaaa" type="checkbox" onclick="remember();"> 记住密码
									</label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								 
								<button type="submit" class="btn btn-default">
									登录
								</button>
							</div>
						</div>
					</form>
				</div>
				<div class="col-md-4">
				</div>
			</div>
		</div>
	</div>
</div>

  
  <script src="js/jquery.min.js"></script>
   
 <script src="js/bootstrap.min.js"></script>
  
  <script src="js/scripts.js"></script>
  </body>
</html>