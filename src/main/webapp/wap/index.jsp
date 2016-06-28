<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"/>
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/wap/css/amazeui.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/wap/css/wap.css?2">
    <title>首页</title>
</head>
<body>
<div data-am-widget="gotop" class="am-gotop am-gotop-fixed">
    <a href="#top" title="">
        <img class="am-gotop-icon-custom" src="../img/goTop.png" />
    </a>
</div>

<div class="pet_mian" id="top">
  <div data-am-widget="slider" class="am-slider am-slider-a1" data-am-slider='{"directionNav":false}' >
  <ul class="am-slides">
      <li>
            <img src="${pageContext.request.contextPath}/wap/img/zk_01.jpg">
            <div class="pet_slider_font">
                <span>以技术服务质量求生存，以技术服务信誉求发展</span>
            </div>
            <div class="pet_slider_shadow"></div>
      </li>
      <li>
            <img src="${pageContext.request.contextPath}/wap/img/zk_02.jpg">
            <div class="pet_slider_font">
                <span>获得国家食品药品监督管理局GLP资质认证</span>
            </div>
            <div class="pet_slider_shadow"></div>
      </li>
      <li>
            <img src="${pageContext.request.contextPath}/wap/img/zk_03.jpg">
            <div class="pet_slider_font">
                <span>通过国家药监局GLP实验室认证</span>
            </div>
            <div class="pet_slider_shadow"></div>
      </li>
  </ul>
</div>


<div class="pet_circle_nav">
    <ul class="pet_circle_nav_list">
        <li><a href="${pageContext.request.contextPath}/company/list.do" class="iconfont pet_nav_xinxianshi ">&#xe61e;</a><span>公司介绍</span></li>
        <li><a href="${pageContext.request.contextPath}/team/list.do" class="iconfont pet_nav_zhangzhishi ">&#xe607;</a><span>技术团队</span></li>
        <li><a href="${pageContext.request.contextPath}/honor/list.do" class="iconfont pet_nav_kantuya ">&#xe62c;</a><span>资质荣誉</span></li>
        <li><a href="${pageContext.request.contextPath}/serviceitem/list.do" class="iconfont pet_nav_mengzhuanti ">&#xe622;</a><span>服务项目</span></li>
        <li><a href="" class="iconfont pet_nav_meirong ">&#xe629;</a><span>功能实验室</span></li>
        <li><a href="" class="iconfont pet_nav_yiyuan ">&#xe602;</a><span>试验计划表</span></li>
        <li><a href="" class="iconfont pet_nav_dianpu ">&#xe604;</a><span>实验报告</span></li>
        <li><a href="javascript:;" class="iconfont pet_nav_gengduo ">&#xe600;</a><span>更多</span></li>
    </ul>
    <div class="pet_more_list"><div class="pet_more_list_block">
    <div class="iconfont pet_more_close">×</div>
    <div class="pet_more_list_block">
        <div class="pet_more_list_block_name">
            <div class="pet_more_list_block_name_title">阅读 Read</div>
            <a class="pet_more_list_block_line">
                <i class="iconfont pet_nav_xinxianshi pet_more_list_block_line_ico">&#xe61e;</i>
                <div class="pet_more_list_block_line_font">新鲜事</div>
            </a>
                        <a class="pet_more_list_block_line">
                <i class="iconfont pet_nav_zhangzhishi pet_more_list_block_line_ico">&#xe607;</i>
                <div class="pet_more_list_block_line_font">趣闻</div>
            </a>
                        <a class="pet_more_list_block_line">
                <i class="iconfont pet_nav_kantuya pet_more_list_block_line_ico">&#xe62c;</i>
                <div class="pet_more_list_block_line_font">阅读</div>
            </a>
                        <a class="pet_more_list_block_line">
                <i class="iconfont pet_nav_mengzhuanti pet_more_list_block_line_ico">&#xe622;</i>
                <div class="pet_more_list_block_line_font">专题</div>
            </a>
                                    <a class="pet_more_list_block_line">
                <i class="iconfont pet_nav_bk pet_more_list_block_line_ico">&#xe629;</i>
                <div class="pet_more_list_block_line_font">订阅</div>
            </a>
                                    <a class="pet_more_list_block_line">
                <i class="iconfont pet_nav_wd pet_more_list_block_line_ico">&#xe602;</i>
                <div class="pet_more_list_block_line_font">专栏</div>
            </a>
 <div class="pet_more_list_block_name_title pet_more_list_block_line_height">服务 Service</div>
              <a class="pet_more_list_block_line">
                <i class="iconfont pet_nav_xinxianshi pet_more_list_block_line_ico">&#xe61e;</i>
                <div class="pet_more_list_block_line_font">新鲜事</div>
            </a>
                        <a class="pet_more_list_block_line">
                <i class="iconfont pet_nav_zhangzhishi pet_more_list_block_line_ico">&#xe607;</i>
                <div class="pet_more_list_block_line_font">趣闻</div>
            </a>
                        <a class="pet_more_list_block_line">
                <i class="iconfont pet_nav_kantuya pet_more_list_block_line_ico">&#xe62c;</i>
                <div class="pet_more_list_block_line_font">阅读</div>
            </a>
                        <a class="pet_more_list_block_line">
                <i class="iconfont pet_nav_mengzhuanti pet_more_list_block_line_ico">&#xe622;</i>
                <div class="pet_more_list_block_line_font">专题</div>
            </a>
                                    <a class="pet_more_list_block_line">
                <i class="iconfont pet_nav_bk pet_more_list_block_line_ico">&#xe629;</i>
                <div class="pet_more_list_block_line_font">订阅</div>
            </a>
                                    <a class="pet_more_list_block_line">
                <i class="iconfont pet_nav_wd pet_more_list_block_line_ico">&#xe602;</i>
                <div class="pet_more_list_block_line_font">专栏</div>
            </a>
        </div>
    </div>

    </div></div>
</div>
<div class="pet_content_main">
  <div data-am-widget="list_news" class="am-list-news am-list-news-default" >
  <div class="am-list-news-bd">
  <ul class="am-list">
     <!--缩略图在标题右边-->
     <c:forEach items="${list}" var="article">
      <li class="am-g am-list-item-desced am-list-item-thumbed am-list-item-thumb-right pet_list_one_block">
        <div class="pet_list_one_info">
            <div class="pet_list_one_info_l">
                <div class="pet_list_one_info_ico"><img src="img/a1.png" alt=""></div>
                <div class="pet_list_one_info_name">${article.author} </div>
            </div>
            <div class="pet_list_one_info_r">
                <div class="pet_list_tag pet_list_tag_xxs">${article.tag}</div>
            </div>
        </div>
        <div class=" am-u-sm-8 am-list-main pet_list_one_nr">
            <h3 class="am-list-item-hd pet_list_one_bt"><a href="###" class="">${article.title}</a></h3>
            <div class="am-list-item-text pet_list_one_text">${article.content}</div>

        </div>
          <div class="am-u-sm-4 am-list-thumb">
            <a href="###" class="">
              <img src="../../img/${article.pic}" class="pet_list_one_img" alt="我很囧，你保重....晒晒旅行中的那些囧！"/>
            </a>
          </div>
      </li>
      </c:forEach>
      
    </ul>
  </div>

    </div>

</div>
<div class="pet_article_dowload pet_dowload_more_top_off">
      <div class="pet_article_dowload_title">关于苏州西山中科药物研究开发有限公司</div>
      <div class="pet_article_dowload_content pet_dowload_more_top_bg"><div class="pet_article_dowload_triangle pet_dowload_more_top_san"></div>
      <div class="pet_article_dowload_ico"><img src="../img/logo.png" alt=""></div>
      <div class="pet_article_dowload_content_font">
地址：苏州市吴中区吴中大道1336号 联系电话：0512-65982476（市场部） 邮箱：marketing@szxszk.com 网址：www.suzhouresearch.com </div>
      <div class="pet_article_dowload_all">
        <a href="###" class="pet_article_dowload_Az am-icon-apple"> App store</a>
        <a href="###" class="pet_article_dowload_Pg am-icon-android"> Android</a>
      </div>
      </div>
      <div class="pet_article_footer_info">Copyright(c)Suzhou Xishan Zhongke Drug R & D Co., Ltd.</div>
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

    $('.am-list > li:last-child').css('border','none');
    function auto_resize(){
        $('.pet_list_one_nr').height($('.pet_list_one_img').height());

    }
        $('.pet_nav_gengduo').on('click',function(){
            $('.pet_more_list').addClass('pet_more_list_show');
       });
        $('.pet_more_close').on('click',function(){
            $('.pet_more_list').removeClass('pet_more_list_show');
        });
});

</script>
</body>
</html>