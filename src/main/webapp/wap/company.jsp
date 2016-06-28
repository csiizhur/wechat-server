<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0" />
<meta name="keywords" content="" />
<meta name="description" content="" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/wap/css/amazeui.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/wap/css/wap.css">
<title>内容页列表页</title>
</head>
<body style="background: #ececec">
	<div class="pet_mian">
		<div class="pet_head">
			<header data-am-widget="header"
				class="am-header am-header-default pet_head_block">
				<div class="am-header-left am-header-nav ">
					<a href="${pageContext.request.contextPath}/index/list.do"
						class="iconfont pet_head_jt_ico">&#xe601;</a>
				</div>

				<div class="am-header-right am-header-nav">
					<a href="javascript:;" class="iconfont pet_head_gd_ico">&#xe600;</a>
				</div>
			</header>
		</div>

		<div class="pet_more_list">
			<div class="pet_more_list_block">
				<div class="iconfont pet_more_close">×</div>
				<div class="pet_more_list_block">
					<div class="pet_more_list_block_name">
						<div class="pet_more_list_block_name_title">阅读 Read</div>
						<a class="pet_more_list_block_line"> <i
							class="iconfont pet_nav_xinxianshi pet_more_list_block_line_ico">&#xe61e;</i>
							<div class="pet_more_list_block_line_font">新鲜事</div>
						</a> <a class="pet_more_list_block_line"> <i
							class="iconfont pet_nav_zhangzhishi pet_more_list_block_line_ico">&#xe607;</i>
							<div class="pet_more_list_block_line_font">趣闻</div>
						</a> <a class="pet_more_list_block_line"> <i
							class="iconfont pet_nav_kantuya pet_more_list_block_line_ico">&#xe62c;</i>
							<div class="pet_more_list_block_line_font">阅读</div>
						</a> <a class="pet_more_list_block_line"> <i
							class="iconfont pet_nav_mengzhuanti pet_more_list_block_line_ico">&#xe622;</i>
							<div class="pet_more_list_block_line_font">专题</div>
						</a> <a class="pet_more_list_block_line"> <i
							class="iconfont pet_nav_bk pet_more_list_block_line_ico">&#xe629;</i>
							<div class="pet_more_list_block_line_font">订阅</div>
						</a> <a class="pet_more_list_block_line"> <i
							class="iconfont pet_nav_wd pet_more_list_block_line_ico">&#xe602;</i>
							<div class="pet_more_list_block_line_font">专栏</div>
						</a>
						<div
							class="pet_more_list_block_name_title pet_more_list_block_line_height">服务
							Service</div>
						<a class="pet_more_list_block_line"> <i
							class="iconfont pet_nav_xinxianshi pet_more_list_block_line_ico">&#xe61e;</i>
							<div class="pet_more_list_block_line_font">新鲜事</div>
						</a> <a class="pet_more_list_block_line"> <i
							class="iconfont pet_nav_zhangzhishi pet_more_list_block_line_ico">&#xe607;</i>
							<div class="pet_more_list_block_line_font">趣闻</div>
						</a> <a class="pet_more_list_block_line"> <i
							class="iconfont pet_nav_kantuya pet_more_list_block_line_ico">&#xe62c;</i>
							<div class="pet_more_list_block_line_font">阅读</div>
						</a> <a class="pet_more_list_block_line"> <i
							class="iconfont pet_nav_mengzhuanti pet_more_list_block_line_ico">&#xe622;</i>
							<div class="pet_more_list_block_line_font">专题</div>
						</a> <a class="pet_more_list_block_line"> <i
							class="iconfont pet_nav_bk pet_more_list_block_line_ico">&#xe629;</i>
							<div class="pet_more_list_block_line_font">订阅</div>
						</a> <a class="pet_more_list_block_line"> <i
							class="iconfont pet_nav_wd pet_more_list_block_line_ico">&#xe602;</i>
							<div class="pet_more_list_block_line_font">专栏</div>
						</a>
					</div>
				</div>

			</div>
		</div>

		<div class="pet_content pet_content_list">
			<div class="pet_kjdt">

				<div class="pet_kjdt_nr">
					<div class="pet_kjdt_block">
						<div class="pet_kjdt_user">
							<div class="pet_kjdt_user_l">
								<img src="../img/logo.png" alt="">
							</div>
							<div class="pet_kjdt_user_r">
								<div class="pet_kjdt_user_time">
									<i class="iconfont">&#xe617; </i> 19:15
								</div>
								<div class="pet_kjdt_user_r_title">公司介绍</div>
								<div class="pet_kjdt_user_r_info">苏州</div>
							</div>

						</div>
						<div class="pet_kjdt_user_r_font">${company.companyInfo}</div>
						<div class="pet_kjdt_user_r_font_img">
							<figure data-am-widget="figure"
								class="am am-figure am-figure-default "
								data-am-figure="{  pureview: 'true' }">



								<img
									src="${pageContext.request.contextPath}/${company.companyPic}"
									data-rel="img/zk04.png" alt="春天的花开秋天的风以及冬天的落阳" />


							</figure>
							<div class="pet_kjdt_user_r_like">
								<i class="am-icon-heart"></i> Super invincible、V.NPCat 等93人喜欢
							</div>

						</div>
					</div>

				</div>
				<div class="pet_article_dowload">
					<div class="pet_article_dowload_title">关于苏州西山中科药物研究开发有限公司</div>
					<div class="pet_article_dowload_content">
						<div class="pet_article_dowload_triangle"></div>
						<div class="pet_article_dowload_ico">
							<img src="../img/logo.png" alt="">
						</div>
						<div class="pet_article_dowload_content_font">
							地址：苏州市吴中区吴中大道1336号 联系电话：0512-65982476（市场部）
							邮箱：marketing@szxszk.com 网址：www.suzhouresearch.com</div>
						<div class="pet_article_dowload_all">
							<a href="###" class="pet_article_dowload_Az am-icon-apple">
								App store</a> <a href="###"
								class="pet_article_dowload_Pg am-icon-android"> Android</a>
						</div>
					</div>
				</div>
			</div>

			<div class="pet_article_footer_info">Copyright(c)Suzhou Xishan
				Zhongke Drug R & D Co., Ltd.</div>
		</div>
	</div>
	<script src="${pageContext.request.contextPath}/wap/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/wap/js/amazeui.min.js"></script>
	<script>
$(function(){

    // 动态计算新闻列表文字样式
    auto_resize();
    $(window).resize(function() {
        auto_resize();
    });
    $('.am-list-thumb img').load(function(){
        auto_resize();
    });
    $('.pet_article_like li:last-child').css('border','none');
        function auto_resize(){
        $('.pet_list_one_nr').height($('.pet_list_one_img').height());
                // alert($('.pet_list_one_nr').height());
    }
        $('.pet_article_user').on('click',function(){
            if($('.pet_article_user_info_tab').hasClass('pet_article_user_info_tab_show')){
                $('.pet_article_user_info_tab').removeClass('pet_article_user_info_tab_show').addClass('pet_article_user_info_tab_cloes');
            }else{
                $('.pet_article_user_info_tab').removeClass('pet_article_user_info_tab_cloes').addClass('pet_article_user_info_tab_show');
            }
        });

        $('.pet_head_gd_ico').on('click',function(){
            $('.pet_more_list').addClass('pet_more_list_show');
       });
        $('.pet_more_close').on('click',function(){
            $('.pet_more_list').removeClass('pet_more_list_show');
        });
});

</script>
</body>
</html>