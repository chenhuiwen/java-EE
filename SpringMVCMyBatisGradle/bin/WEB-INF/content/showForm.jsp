<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品</title>
<link href="css/css.css" type="text/css" rel="stylesheet">	
<SCRIPT src="js/jquery-1.2.6.pack.js" type=text/javascript></SCRIPT>
<SCRIPT src="js/base.js" type=text/javascript></SCRIPT>
</head>
<body>
<h2><font color="#333399">${sessionScope.good.name }</font></h2>
<div id=preview>
	<div class=jqzoom id=spec-n1 onClick="window.open('#')"><IMG height=350
	src="image/${sessionScope.good.image}"  width=350>
	</div>
	<div id=spec-n5>
		
		<div id=spec-list>
			<ul class=list-h>
				<li><img src="image/${sessionScope.good.image }"> </li>
				<li><img src="image/${sessionScope.good.image2 }"> </li>
				<li><img src="image/${sessionScope.good.image3 }"> </li>
				
			</ul>
		</div>
		
    </div>
</div>
<SCRIPT type=text/javascript>
	$(function(){			
	   $(".jqzoom").jqueryzoom({
			xzoom:400,
			yzoom:400,
			offset:10,
			position:"right",
			preload:1,
			lens:1
		});
		$("#spec-list").jdMarquee({
			deriction:"left",
			width:350,
			height:56,
			step:2,
			speed:4,
			delay:10,
			control:true,
			_front:"#spec-right",
			_back:"#spec-left"
		});
		$("#spec-list img").bind("mouseover",function(){
			var src=$(this).attr("src");
			$("#spec-n1 img").eq(0).attr({
				src:src.replace("\/n5\/","\/n1\/"),
				jqimg:src.replace("\/n5\/","\/n0\/")
			});
			$(this).css({
				"border":"2px solid #ff6600",
				"padding":"1px"
			});
		}).bind("mouseout",function(){
			$(this).css({
				"border":"1px solid #ccc",
				"padding":"2px"
			});
		});				
	})
	</SCRIPT>


<SCRIPT src="js/lib.js" type=text/javascript></SCRIPT>
<SCRIPT src="js/163css.js" type=text/javascript></SCRIPT>
	<center>
	<h2><font color="#333399">${sessionScope.good.price }￥</font></h2>
	${sessionScope.user.id }
	<form action="addCart" method="post">
	<input type="hidden" id="id" name="id" value="${sessionScope.good.id }">
	<input type="hidden" id="name" name="name" value="${sessionScope.good.name }">
	<input type="hidden" id="price" name="price" value="${sessionScope.good.price }">
	<input type="hidden" id="image" name="image" value="${sessionScope.good.image }">
	<input type="submit" value="加入购物车">
	</form>
	<form action="savecollect" method="post">
	<input type="hidden" id="good_sn" name="good_sn" value="${sessionScope.good.id }">
	<input type="hidden" id="image" name="image" value="${sessionScope.good.image }">
	<input type="hidden" id="good_name" name="good_name" value="${sessionScope.good.name }">
	<input type="hidden" id="user_sn" name="user_sn" value="${sessionScope.user.id }">
	<input type="submit" value="收藏">
	</form>
	</center>
</body>
</html>