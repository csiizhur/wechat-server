<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width" />
<title>JSSDk配置</title>
<link rel="stylesheet" href=" http://res.wx.qq.com/open/libs/weui/0.4.2/weui.css">
<script src="http://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
<script src="http://static.yuhuaws.com/resource/js/jquery.min.js"></script>
<script type="text/javascript">
	function jssdk() {
		$.ajax({
			url : "http://20572ec.nat123.net/wechatconfig/jssdk.do",
			type : 'post',
			dataType : 'json',
			contentType : "application/x-www-form-urlencoded; charset=utf-8",
			data : {
				'url' : location.href.split('#')[0]
			},
			success : function(data) {
				alert(JSON.stringify(data));
				wx.config({
					debug : true,
					appId : data.data.appId,
					timestamp : data.data.timestamp,
					nonceStr : data.data.nonceStr,
					signature : data.data.signature,
					jsApiList : [ 'checkJsApi', 'onMenuShareTimeline',
							'onMenuShareAppMessage', 'onMenuShareQQ',
							'onMenuShareWeibo', 'hideMenuItems',
							'showMenuItems', 'hideAllNonBaseMenuItem',
							'showAllNonBaseMenuItem', 'translateVoice',
							'startRecord', 'stopRecord', 'onRecordEnd',
							'playVoice', 'pauseVoice', 'stopVoice',
							'uploadVoice', 'downloadVoice', 'chooseImage',
							'previewImage', 'uploadImage', 'downloadImage',
							'getNetworkType', 'openLocation', 'getLocation',
							'hideOptionMenu', 'showOptionMenu', 'closeWindow',
							'scanQRCode', 'chooseWXPay',
							'openProductSpecificView', 'addCard', 'chooseCard',
							'openCard' ]
				});
			},
			error:function(e) {
				alert(1);
			}
		});
	}

	function isWeiXin5() {
		var ua = window.navigator.userAgent.toLowerCase();
		var reg = /MicroMessenger\/[5-9]/i;
		return reg.test(ua);
	}

	window.onload = function() {
		// 	if (isWeiXin5() == false) {
		// 		  alert("您的微信版本低于5.0，无法使用微信支付功能，请先升级！");
		// 		}
		jssdk();
	};
	
	/*
	 * 注意：
	 *  所有的JS接口只能在公众号绑定的域名下调用，公众号开发者需要先登录微信公众平台进入“公众号设置”的“功能设置”里填写“JS接口安全域名”。
	 */
	wx.ready(function () {
	  //1. 判断当前版本是否支持指定 JS 接口，支持批量判断，只需要将需要判断的接口放入到jsApiList中即可
	    wx.checkJsApi({
	      jsApiList: [
	        'getNetworkType',
	        'previewImage'
	      ],
	      success: function (res) {
	        alert(JSON.stringify(res));
	      }
	    });
	  
	    wx.getLocation({
	        success: function (res) {
	          //alert(JSON.stringify(res));
	        },
	        cancel: function (res) {
	          alert('用户拒绝授权获取地理位置');
	        }
	      });
	})
	
	wx.error(function(res){

    // config信息验证失败会执行error函数，如签名过期导致验证失败，具体错误信息可以打开config的debug模式查看，也可以在返回的res参数中查看，对于SPA可以在这里更新签名。
	});
	
	function locationssss(){
		wx.getLocation({
			
			success:function(res){},
			cancel:function(res){}
		});
	}
	
	document.addEventListener('WeixinJSBridgeReady', function onBridgeReady() {

		WeixinJSBridge.call('closeWindow');

	});
</script>
</head>
<body>
<button onclick="javascript:locationssss();">测试</button>
<a href="javascript:locationssss();" class="weui_btn weui_btn_primary">获取地理位置</a>

<div class="weui_panel weui_panel_access">
        <!-- <div class="weui_panel_hd">图文组合列表</div>
        <div class="weui_panel_bd">
		</div> -->
        <a class="weui_panel_ft" href="javascript:void(0);">查看更多</a>
</div>

<div class="weui_tabbar">
        <a href="javascript:;" class="weui_tabbar_item weui_bar_item_on">
            <div class="weui_tabbar_icon">
                <img src="../wap/images/icon_nav_button.png" alt="">
            </div>
            <p class="weui_tabbar_label">微信</p>
        </a>
        <a href="javascript:;" class="weui_tabbar_item">
            <div class="weui_tabbar_icon">
                <img src="../wap/images/icon_nav_msg.png" alt="">
            </div>
            <p class="weui_tabbar_label">通讯录</p>
        </a>
        <a href="javascript:;" class="weui_tabbar_item">
            <div class="weui_tabbar_icon">
                <img src="../wap/images/icon_nav_article.png" alt="">
            </div>
            <p class="weui_tabbar_label">发现</p>
        </a>
        <a href="javascript:;" class="weui_tabbar_item">
            <div class="weui_tabbar_icon">
                <img src="../wap/images/icon_nav_cell.png" alt="">
            </div>
            <p class="weui_tabbar_label">我</p>
        </a>
</div>
</body>
</html>
