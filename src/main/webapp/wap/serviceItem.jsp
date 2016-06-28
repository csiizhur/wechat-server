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
  <link rel="stylesheet" href="${pageContext.request.contextPath}/wap/css/wap.css">
  <title>服务项目列表页</title>
</head>
<body style="background:#ececec">
  <div class="pet_mian" >
    <div class="pet_head">
      <header data-am-widget="header"
          class="am-header am-header-default pet_head_block">
        <div class="am-header-left am-header-nav ">
          <a href="${pageContext.request.contextPath}/index/list.do" class="iconfont pet_head_jt_ico">&#xe601;</a>
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
            <a class="pet_more_list_block_line"> <i class="iconfont pet_nav_xinxianshi pet_more_list_block_line_ico">&#xe61e;</i>
              <div class="pet_more_list_block_line_font">新鲜事</div>
            </a>
            <a class="pet_more_list_block_line"> <i class="iconfont pet_nav_zhangzhishi pet_more_list_block_line_ico">&#xe607;</i>
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

      </div>
    </div>

    <div class="pet_content pet_content_list">
      <div class="pet_article_like">
        <div class="pet_content_main pet_article_like_delete">
          <div data-am-widget="list_news" class="am-list-news am-list-news-default am-no-layout">
            <div class="am-list-news-bd">
              <ul class="am-list">
              	<c:forEach items="${item }" var="p">
                <!--缩略图在标题右边-->
                 <li class="am-g am-list-item-desced am-list-item-thumbed am-list-item-thumb-right pet_list_one_block">
        <div class="pet_list_one_info">
            <div class="pet_list_one_info_l">
                <div class="pet_list_one_info_ico"><img src="img/a1.png" alt=""></div>
                <div class="pet_list_one_info_name">${p.createUser} </div>
            </div>
            <div class="pet_list_one_info_r">
                <div class="pet_list_tag pet_list_tag_xxs">服务项目</div>
            </div>
        </div>
        <div class=" am-u-sm-8 am-list-main pet_list_one_nr">
            <h3 class="am-list-item-hd pet_list_one_bt"><a href="###" class="">${p.serviceName}</a></h3>
            <div class="am-list-item-text pet_list_one_text">${p.serviceContent}</div>

        </div>
          <div class="am-u-sm-4 am-list-thumb">
            <a href="###" class="">
              <img src="${pageContext.request.contextPath}/${p.servicePic} " class="pet_list_one_img" alt=""/>
            </a>
          </div>
      </li>
      </c:forEach>

                </ul>
              </div>

            </div>

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