<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

 
   <title>收藏</title>

   
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
	
	
		<div class="col-md-6" id="div1">
		<div style="width:100%;height:150px;"></div>
		<img alt="收藏" src="image/sc.png">
		</div>
		<div class="col-md-6" id="div2">
			<h1>${sessionScope.user.username }的收藏</h1><br>
	<a class="btn btn-primary" href="main" role="button">继续购物</a><br><br>
	
	<c:forEach items="${requestScope.collect_list }" var="collect">
		
		<div class="col-md-4" >
					<div class="thumbnail">
						<img alt="加载中" src="image/${collect.image }" height="200px" width="200px"/>
						<div class="caption">
							<h3>
								${collect.good_name }
							</h3>
					
							<p>
								<form action="select" method="post" >
								<input type="hidden" id="id" name="id" value="${collect.good_sn }">
								<input type="submit" value="查看详情">
								</form>
								 
							
						</div>
					</div>
				</div>
		
	</c:forEach>

		</div>
	</div>
</div>
 <script src="js/jquery.min.js"></script>
   
 <script src="js/bootstrap.min.js"></script>
  
  <script src="js/scripts.js"></script>
</body>
</html>