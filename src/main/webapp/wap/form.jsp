<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/wap/weui/frozen.css">
<script src="${pageContext.request.contextPath}/wap/weui/zepto.min.js"></script>
<script src="${pageContext.request.contextPath}/wap/weui/frozen.js"></script>

</head>

<body ontouchstart>
	<%-- <header class="ui-header ui-header-positive ui-border-b">
		<i class="ui-icon-return" onclick="history.back()"
			href="${pageContext.request.contextPath}/oauth/list.do"></i>
	</header> --%>
	<div class="block">
		<div class="ui-form ui-border-t">
			<form action="#" >
				<input type="hidden" name="openId" value="${openId}" id="openId">
				<div class="ui-form-item ui-border-b">
					<label> 真实姓名</label> <input type="text" placeholder="姓名" id="userName" name="userName"/> <a
						href="#" class="ui-icon-close"> </a>
				</div>
				<div class="ui-form-item ui-border-b">
					<label> 性别</label>
				</div>
				<div class="ui-form-item ui-form-item-radio ui-border-b">
					<label class="ui-radio" for="radio"> <input type="radio"
						name="sex"  id="sex" value="1"/>
					</label>
					<p>男</p>
				</div>
				<div class="ui-form-item ui-form-item-radio ui-border-b">
					<label class="ui-radio" for="radio"> <input type="radio"
						checked="" name="sex" id="sex" value="0"/>
					</label>
					<p>女</p>
				</div>
				<div class="ui-form-item ui-border-b">
					<label> 身份证号码</label> <input type="text" class="weui_input"
						type="number" pattern="[0-18]*" placeholder="请输入身份证号码" /> <a
						href="#" class="ui-icon-close" name=""> </a>
				</div>
				<div class="ui-form-item ui-form-item-textarea ui-border-b">
					<label>生日</label> <input class="weui_input" type="date" value="" id="birthday" name="birthday"/>
				</div>
				<div class="ui-form-item ui-form-item-textarea ui-border-b">
					<label>详细地址</label>
					<textarea placeholder="街道等详细地址" name="address" id="address"></textarea>
				</div>
				<div class="ui-form-item ui-form-item-l ui-border-b">
					<label class="ui-border-r">中国 +86</label> <input type="text"
						placeholder="请输入手机号码" name="mobile" id="mobile"/> <a href="#" class="ui-icon-close"> </a>
				</div>
				<div class="ui-form-item ui-form-item-pure ui-border-b">
					<input type="text" placeholder="QQ号/手机号/邮箱"> <a href="#"
						class="ui-icon-close"></a>
				</div>

				<div class="ui-form-item ui-form-item-pure ui-border-b">
					<section class="ui-input-wrap ui-border-t">
						<div class="ui-input ui-border-radius">
							<input type="text" name="" value="" placeholder="我也说一句...">
						</div>
						<button class="ui-btn">评论</button>
					</section>
				</div>
				<div class="ui-form-item ui-form-item-pure ui-border-b">
					<p>
						<label class="ui-checkbox-s"> <input type="checkbox"
							name="checkbox" checked="" />
						</label> 我已阅读并同意
					</p>
				</div>
				<div class="ui-form-item ui-form-item-pure ui-border-b">
					<div class="ui-btn-wrap">
						<button class="ui-btn-lg ui-btn-danger" onclick="update();">确定</button>
						<button class="ui-btn-lg ui-btn-danger" disabled>取消</button>
					</div>
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
</body>
</html>