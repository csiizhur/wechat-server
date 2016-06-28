<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0" />
<link rel="stylesheet"
	href="http://res.wx.qq.com/open/libs/weui/0.4.2/weui.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/wap/css/frozen.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/wap/iconfonts/iconfont.css">
<title>会员中心</title>
</head>
<body style="background: #ececec">


	<div class="weui_panel weui_panel_access">

		<div class="weui_panel_bd">
			<a href="javascript:void(0);"
				class="weui_media_box weui_media_appmsg">
				<div class="weui_media_hd">
					<img class="weui_media_appmsg_thumb" src="${headimgurl}">
				</div>
				<div class="weui_media_bd">
					<h4 class="weui_media_title">${nickname}</h4>
					<p class="weui_media_desc">${country}--${province}--${city}</p>
				</div>
			</a>
		</div>
	</div>
	<div class="weui_cells weui_cells_access">
		<a class="weui_cell" href="javascript:;">
			<div class="weui_cell_hd">
				<i class="iconfont-alibaba">&#xe60a;</i>
			</div>
			<div class="weui_cell_bd weui_cell_primary">
				<p>积分${amountPoint}</p>
			</div>
			<div class="weui_cell_ft">积分明细</div>
		</a>
	</div>
	<div class="weui_panel weui_panel_access">
		<table class="ui-table ui-border">
			<tr>
				<td align="center"><span class="iconfont-alibaba">&#xe60b;
						<div align="center">当前等级</div>
				</span></td>
				<td align="center"><span class="iconfont-alibaba">&#xe608;
						<div align="center">实验计划</div>
				</span></td>
				<td align="center"><span class="iconfont-alibaba">&#xe609;
						<div align="center">实验报告</div>
				</span></td>
			</tr>
			<tr>
				<td align="center"><span class="iconfont-alibaba">&#xe601;
						<div align="center">活动</div>
				</span></td>
				<td align="center"><span class="iconfont-alibaba">&#xe602;
						<div align="center">关注的</div>
				</span></td>
				<td align="center"><span class="iconfont-alibaba">&#xe600;
						<div align="center">优惠券</div>
				</span></td>
			</tr>
		</table>

	</div>

	<div class="weui_cells weui_cells_access">
		<a class="weui_cell"
			href="${pageContext.request.contextPath}/wap/honor.html#/cell">
			<div class="weui_cell_hd">
				<i class="iconfont-alibaba">&#xe604;</i>
			</div>
			<div class="weui_cell_bd weui_cell_primary">
				<p>会员资料</p>
			</div>
			<div class="weui_cell_ft">说明文字</div>
		</a> <a class="weui_cell" href="${pageContext.request.contextPath}/oauth/user/info.do?openId=${openid}">
			<div class="weui_cell_hd">
				<i class="iconfont-alibaba">&#xe605;</i>
			</div>
			<div class="weui_cell_bd weui_cell_primary">
				<p>重置密码</p>
			</div>
			<div class="weui_cell_ft">说明文字</div>
		</a> <a class="weui_cell" href="javascript:;">
			<div class="weui_cell_hd">
				<i class="iconfont-alibaba">&#xe603;</i>
			</div>
			<div class="weui_cell_bd weui_cell_primary">
				<p>客服热线</p>
			</div>
		</a>

	</div>

	<div class="weui_cells weui_cells_access">
		<a class="weui_cell" href="javascript:;">
			<div class="weui_cell_hd">
				<i class="iconfont-alibaba">&#xe603;</i>
			</div>
			<div class="weui_cell_bd weui_cell_primary">
				<p>我的会员特权</p>
			</div>
			<div class="weui_cell_ft">说明文字</div>
		</a>
	</div>
	<div class="weui_panel weui_panel_access"></div>

	<div class="weui_tabbar">
		<a href="javascript:;" class="weui_tabbar_item weui_bar_item_on">
			<div class="weui_tabbar_icon">
				<img src="../wap/images/icon_nav_button.png" alt="">
			</div>
			<p class="weui_tabbar_label">微信</p>
		</a> <a href="javascript:;" class="weui_tabbar_item">
			<div class="weui_tabbar_icon">
				<img src="../wap/images/icon_nav_msg.png" alt="">
			</div>
			<p class="weui_tabbar_label">通讯录</p>
		</a> <a href="javascript:;" class="weui_tabbar_item">
			<div class="weui_tabbar_icon">
				<img src="../wap/images/icon_nav_article.png" alt="">
			</div>
			<p class="weui_tabbar_label">发现</p>
		</a> <a href="javascript:;" class="weui_tabbar_item">
			<div class="weui_tabbar_icon">
				<img src="../wap/images/icon_nav_cell.png" alt="">
			</div>
			<p class="weui_tabbar_label">我</p>
		</a>
	</div>
	<script>
		
	</script>
</body>
</html>