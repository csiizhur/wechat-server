<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="format-detection" content="telephone=no">
<title>会员资料</title>
<script type="text/javascript"
	src="http://tajs.qq.com/stats?sId=37342703" charset="UTF-8"></script>
<link rel="stylesheet"
	href="http://frozenui.github.io/frozenui/css/frozen.css">
<script src="${pageContext.request.contextPath}/wap/weui/zepto.min.js"></script>
<script src="${pageContext.request.contextPath}/wap/weui/frozen.js"></script>

</head>

<body ontouchstart>
	
	<div class="block">
		<div class="ui-form ui-border-t">
			<form action="#" >
				<input type="hidden" name="openId" value="${openId}" id="openId">
				<div class="ui-form-item ui-border-b">
					<label class="ui-border-r"> 真实姓名</label> <input type="text" placeholder="姓名" id="userName" name="userName" value="${memberInfo.userName}"/> <a
						href="#" class="ui-icon-close"> </a>
				</div>
				<div class="ui-form-item ui-border-b">
					<label class="ui-border-r"> 性别</label>
				</div>
				<div class="ui-form-item ui-form-item-radio ui-border-b">
					<label class="ui-radio" for="radio"> <input type="radio"
						<c:if test="${memberInfo.sex==0 }">checked="checked"</c:if> name="sex"  id="sex" value="1"/>
					</label>
					<p>男</p>
				</div>
				<div class="ui-form-item ui-form-item-radio ui-border-b">
					<label class="ui-radio" for="radio"> <input type="radio"
						 <c:if test="${memberInfo.sex==1 }">checked="checked"</c:if> name="sex" id="sex" value="0"/>
					</label>
					<p>女</p>
				</div>
				<div class="ui-form-item ui-border-b">
					<label class="ui-border-r"> 身份证号码</label> <input type="text" class="weui_input"
						type="number" pattern="[0-18]*" placeholder="请输入身份证号码" /> <a
						href="#" class="ui-icon-close" name=""> </a>
				</div>
				<div class="ui-form-item ui-border-b">
					<label class="ui-border-r">生日</label> <input class="weui_input" type="date" value="${memberInfo.birthday}" id="birthday" name="birthday"/>
				</div>
				<div class="ui-form-item ui-border-b">
					<label class="ui-border-r">详细地址</label>
					<input placeholder="街道等详细地址" name="address" id="address" value="${memberInfo.address }"></input>
				</div>
				<div class="ui-form-item ui-form-item-l ui-border-b">
					<label class="ui-border-r">中国 +86</label> <input type="text"
						placeholder="请输入手机号码" name="mobile" id="mobile" value="${memberInfo.mobile }"/> <a href="#" class="ui-icon-close"> </a>
				</div>
				<div class="ui-form-item ui-form-item-pure ui-border-b">
					<section class="ui-input-wrap ui-border-t">
						<div class="ui-input ui-border-radius">
							<input type="text" name="" value="" placeholder="我也说一句...">
						</div>
						<button class="ui-btn">签名</button>
					</section>
				</div>
				<div class="ui-form-item ui-form-item-pure ui-border-b">
					<p>
						<label class="ui-checkbox-s"> <input type="checkbox"
							name="checkbox" checked="" />
						</label> 我已阅读并同意
					</p>
				</div>
				<div class="ui-footer ui-footer-stable ui-btn-group ui-border-t">
						<button class="ui-btn ui-btn-danger" name="btn1" id="btn1">确定</button>
						<button class="ui-btn ui-btn-danger active" >取消</button>
				</div>
			</form>
		</div>
	</div>
	<script src="http://static.yuhuaws.com/resource/js/jquery.min.js"></script>
	<script>
	
	//ajax提交
	function update(){
		var userName=$("#userName").val();
		var openId=$("#openId").val();
		var sex=$("#sex").val();
		var address=$("#address").val();
		var mobile=$("#mobile").val();
		var birthday=$("#birthday").val();
		$.ajax({
			url : "http://127.0.0.1:8081/member/update.do",
			type : 'post',
			dataType : 'json',
			contentType : "application/x-www-form-urlencoded; charset=utf-8",
			data : {
				'userName' : userName,
				'openId':openId,
				'sex':sex,
				'address':address,
				'mobile':mobile,
				'birthday':birthday
				
			},
			success : function(data) {
				alert(JSON.stringify(data));
				
			},
			error:function(e) {
				alert(1);
			}
		});
	}
		$('.ui-list li,.ui-tiled li').click(function() {
			if ($(this).data('href')) {
				location.href = $(this).data('href');
			}
		});
		$('.ui-header .ui-btn').click(function() {
			location.href = 'index.html';
		});
	</script>
	<script type="text/javascript">
	var el;
	/* $("#btn1").tap(function(){
	    el=$.tips({
	        content:'温馨提示内容',
	        stayTime:2000,
	        type:"success"
	    })
	    el.on("tips:hide",function(){
	        console.log("tips hide");
	    })

	}); */
	
	$("#btn1").on("tap",function(){
		alert(11111111);
		console.log("1111");
		el=$.tips({
	        content:'温馨提示内容',
	        stayTime:2000,
	        type:"success"
	    })
	    el.on("tips:hide",function(){
	        console.log("tips hide");
	    })
	});
	</script>
</body>
</html>