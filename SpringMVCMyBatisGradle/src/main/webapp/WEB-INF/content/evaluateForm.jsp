<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/star-rating.min.css" media="all" rel="stylesheet" type="text/css" />
<script src="js/jquery.min.js"></script>
<script src="js/star-rating.min.js" type="text/javascript"></script>
</head>
<body>
<center>
<h1>订单号：${sessionScope.order.id}</h1>
<form action="saveEvaluate" method="post">
<h2>您对这次的物流评分是：</h2>
<br>
 <input id="point" name="point" value="4" type="number" class="rating" min=0 max=5 step=0.2 data-size="lg">
<br>
<h2>您对这次的物品质量评分是：</h2>
<br>
 <input id="point2" name="point2" value="4" type="number" class="rating" min=0 max=5 step=0.2 data-size="lg">
<br>
<h2>您对这次的服务评分是：</h2>
<br>
 <input id="point3" name="point3" value="4" type="number" class="rating" min=0 max=5 step=0.2 data-size="lg">
<br>

   <br>
<h2>您可以配上文字和图片</h2>
文字：<input type="text" id="text" name="text"><br>
图片：<input id="fileImage" name="image" type="file" size="30" multiple /><br>
<input type="hidden" id="order_sn" name="order_sn" value="${sessionScope.order.id}">
<input type="hidden" id="good_sn"  name="good_sn" value="${sessionScope.order.good_sn}">
<input type="hidden" id="user_sn"  name="user_sn"  value="${sessionScope.order.user_sn}">
<button type="submit" class="btn btn-primary">Submit</button>

 <button type="reset" class="btn btn-default">Reset</button>

</form>
<script>

    jQuery(document).ready(function () {

        $(".rating-kv").rating();

    });

</script>
</center>
</body>
</html>