<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
 
 <head>
 
   <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

 
   <title>首页</title>

   
 <meta name="description" content="Source code generated using layoutit.com">
  
  <meta name="author" content="LayoutIt!">

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
									<a href="order">订单</a>
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
		欢迎[${sessionScope.user.username }]访问 ${applicationScope.count}人
	</div>
	<div class="row">
		<div class="tree well">
        <ul>
            <li>
                <span><i class="icon-folder-open"></i> 商品分类</span>
                <ul>
                    <li>
                        <span><i class="icon-minus-sign"></i> 个性礼品</span> 
                        <form action="gift" method="post">
							<input type="hidden" id="parent_category_sn" name="parent_category_sn" value="2">
							<input type="submit" value="去看看">
							</form>
                    </li>
                    <li>
                        <span><i class="icon-minus-sign"></i> 可爱玩偶</span> <a href=""></a>
                        <form action="gift" method="post">
							<input type="hidden" id="parent_category_sn" name="parent_category_sn" value="3">
							<input type="submit" value="去看看">
							</form>
                    </li>
                    <li>
                        <span><i class="icon-minus-sign"></i>精美饰品</span> <a href=""></a>
                        <form action="gift" method="post">
							<input type="hidden" id="parent_category_sn" name="parent_category_sn" value="4">
							<input type="submit" value="去看看">
							</form>
                    </li>
                </ul>
            </li>
           
        </ul>
    </div>
		
		<div class="col-md-6">
			<div class="carousel slide" id="carousel-265233">
				<ol class="carousel-indicators">
					<li class="active" data-slide-to="0" data-target="#carousel-265233">
					</li>
					<li data-slide-to="1" data-target="#carousel-265233">
					</li>
					<li data-slide-to="2" data-target="#carousel-265233">
					</li>
				</ol>
				<div class="carousel-inner" style="height:200px;">
					<div class="item active">
						<img alt="Carousel Bootstrap First" src="image/main1.jpg" />
						<div class="carousel-caption">
							<h4>
								礼品定制
							</h4>
							<p>
								选择最符合您心意的礼品！
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="Carousel Bootstrap Second" src="image/main2.jpg" />
						<div class="carousel-caption">
							<h4>
								
							</h4>
							<p>
								
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="Carousel Bootstrap Third" src="image/main3.jpg" />
						<div class="carousel-caption">
							<h4>
								礼品盒免费送！
							</h4>
							<p>
								送！送！送！
							</p>
						</div>
					</div>
				</div> <a class="left carousel-control" href="#carousel-265233" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-265233" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12">
			<div class="row">
				<div class="col-md-4">
					<div class="thumbnail">
						<img alt="Bootstrap Thumbnail First" src="image/sl.jpg" />
						<div class="caption">
							<h3>
								个性礼物专场
							</h3>
							<p>
								这里又各种实惠精致的礼品！
							</p>
							<p>
							<form action="gift" method="post">
							<input type="hidden" id="parent_category_sn" name="parent_category_sn" value="2">
							<input type="submit" value="去看看">
							</form>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img alt="Bootstrap Thumbnail Second" src="image/tb2.jpg" />
						<div class="caption">
							<h3>
								可爱玩偶专场
							</h3>
							<p>
								这里有可爱的玩偶！
							</p>
							<p>
							<form action="gift" method="post">
							<input type="hidden" id="parent_category_sn" name="parent_category_sn" value="3">
							<input type="submit" value="去看看">
							</form>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img alt="Bootstrap Thumbnail Third" src="image/bracelet.jpg" />
						<div class="caption">
							<h3>
								精美饰品专场
							</h3>
							<p>
								这里有精美的饰品！
							</p>
							<p>
							<form action="gift" method="post">
							<input type="hidden" id="parent_category_sn" name="parent_category_sn" value="4">
							<input type="submit" value="去看看">
							</form>
						</div>
					</div>
				</div>
			</div>
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