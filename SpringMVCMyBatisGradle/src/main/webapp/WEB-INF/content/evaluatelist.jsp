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
  #div1{
    	width:28%;
    	height:600px;  
    }
    #div2{
    	width:72%;
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
		<div class="col-md-12">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					 
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						 <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
					</button> <a class="navbar-brand" href="#">Brand</a>
				</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active">
							<a href="#">Link</a>
						</li>
						<li>
							<a href="#">Link</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									<a href="#">Action</a>
								</li>
								<li>
									<a href="#">Another action</a>
								</li>
								<li>
									<a href="#">Something else here</a>
								</li>
								<li class="divider">
								</li>
								<li>
									<a href="#">Separated link</a>
								</li>
								<li class="divider">
								</li>
								<li>
									<a href="#">One more separated link</a>
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
							<a href="#">Link</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									<a href="#">Action</a>
								</li>
								<li>
									<a href="#">Another action</a>
								</li>
								<li>
									<a href="#">Something else here</a>
								</li>
								<li class="divider">
								</li>
								<li>
									<a href="#">Separated link</a>
								</li>
							</ul>
						</li>
					</ul>
				</div>
				
			</nav>
		</div>
	</div>
	<div class="row">
		<div class="col-md-6" id="div1">
		<div class="tree well">
        <ul>
            <li>
                <span><i class="icon-folder-open"></i> 商品</span> <a href="">Goes somewhere</a>
                <ul>
                    <li>
                        <span><i class="icon-minus-sign"></i> 一级节点1</span> <a href=""></a>
                        <ul>
                            <li>
                                <span><i class="icon-leaf"></i> 二级节点1_1</span> <a href=""></a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <span><i class="icon-minus-sign"></i> 一级节点2</span> <a href=""></a>
                        <ul>
                            <li>
                                <span><i class="icon-leaf"></i>二级节点2_1</span> <a href=""></a>
                            </li>
                            <li>
                                <span><i class="icon-minus-sign"></i> 二级节点2_2</span> <a href=""></a>
                                <ul>
                                    <li>
                                        <span><i class="icon-minus-sign"></i>三级节点2_1</span> <a href=""></a>
                                        <ul>
                                            <li>
                                                <span><i class="icon-leaf"></i>四级节点2_1</span> <a href=""></a>
                                            </li>
                                            <li>
                                                <span><i class="icon-leaf"></i> 四级节点2_2</span> <a href=""></a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li>
                                        <span><i class="icon-leaf"></i>三级节点2_2</span> <a href=""></a>
                                    </li>
                                    <li>
                                        <span><i class="icon-leaf"></i> 三级节点2_3</span> <a href=""></a>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <span><i class="icon-leaf"></i>二级节点2_3</span> <a href=""></a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </li>
            
			<li>
                <span><i class="icon-folder-open"></i> 库存</span> <a href=""></a>
                <ul>
                    <li>
                        <span><i class="icon-leaf"></i> 一级节点2_1</span> <a href=""></a>
                    </li>
                </ul>
            </li>
            <li>
                <span><i class="icon-folder-open"></i> 销售</span> <a href=""></a>
                <ul>
                    <li>
                        <span><i class="icon-leaf"></i> 一级节点2_1</span> <a href=""></a>
                    </li>
                </ul>
            </li>
            <li>
                <span><i class="icon-folder-open"></i> 订单</span> <a href="orderlist">查看订单</a>
                <ul>
                    <li>
                        <span><i class="icon-leaf"></i> 一级节点2_1</span> <a href=""></a>
                    </li>
                </ul>
            </li>
        </ul>
    </div>

		
		</div>
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
		
		</div>
	</div>
</div>

  
  <script src="js/jquery.min.js"></script>
   
 <script src="js/bootstrap.min.js"></script>
  <script src="js/jquery-1.10.2.js"></script>
  
  <script src="js/scripts.js"></script>
  <script type="text/javascript">
　　$(function(){
    　　$('.tree li:has(ul)').addClass('parent_li').find(' > span').attr('title', 'Collapse this branch');
    　　$('.tree li.parent_li > span').on('click', function (e) {
       　　 var children = $(this).parent('li.parent_li').find(' > ul > li');
        　　if (children.is(":visible")) {
            　　children.hide('fast');
            　　$(this).attr('title', 'Expand this branch').find(' > i').addClass('icon-plus-sign').removeClass('icon-minus-sign');
        　　} else {
            　　children.show('fast');
            　　$(this).attr('title', 'Collapse this branch').find(' > i').addClass('icon-minus-sign').removeClass('icon-plus-sign');
        　　}
        　　e.stopPropagation();
    　　});
　　});
    </script>
  </body>
</html>