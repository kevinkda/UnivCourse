<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>搜索页面</title>
    <link href="/css/style.reset.css" rel="stylesheet" type="text/css"/>
    <link href="/css/css3style.css" rel="stylesheet" type="text/css"/>
    <link href="/css/font-color-size.css" rel="stylesheet" type="text/css"/>
    <link href="/css/table.select.style.css" rel="stylesheet" type="text/css"/>
    <link href="/css/top-style.css" rel="stylesheet" type="text/css"/>
    <link href="/css/index-body-style.css" rel="stylesheet" type="text/css"/>
    <link href="/css/me_home.css" rel="stylesheet" type="text/css"/>
    <link href="/css/search.css" rel="stylesheet" type="text/css"/>

    <script src="oto./top-city-check."></script>
</head>

<body>
<!-- 顶部 -->
<div class="index-top-box">
    <div class="index-top center">
        <!--收藏夹-->
        <div class="checkCity favorit css3bg fr" onMouseover="overD();" onMouseout="outD();">&nbsp;&nbsp;<a
                    href="shoucang.ftl">收藏夹</a>
            <!--收藏夹/显示的内容-->
            <div class="Collection-of-goods none-r" id="d1" onMouseover="overD();" onMouseout="outD();">
                <p align="center" style="line-height:22px ; padding:10px 0">收藏夹是空的！</p>
            </div>
        </div>
        <!--客户服务-->
        <div class="fr noneAny"><a href="bangzhu.ftl">客户服务</a></div>
        <!--我的订单-->
        <div class="fr noneAny"><a href="user.ftl">我的订单</a></div>
        <!--我的商铺-->
        <div class="fr noneAny"><a>我的商铺</a></div>
        <!--免费注册-->
        <div class="fr noneAny"><a href="zhuce.ftl">[免费注册]</a></div>
        <!--登录-->
        <div class="fr noneAny"><a href="login.ftl">[登录]</a></div>
        <!--亲，欢迎来！-->
        <div class="fr noneAny">亲，欢迎来美博城！</div>

    </div>
</div>

<!-- 顶部结束-->
<div class="clear"></div>
<!-- logo开始-->
<div class="logoBox center">
    <!--左侧logo-->
    <div class="logo fl">
        <span class="fl"><img src="img/login/logo.jpg"/></span>
    </div>

    <!--右侧search-->
    <div class="searchBox fl">

        <!--搜索BOX-->
        <div class="searchinput fr">
            <!--搜索-->
            <div class="S-bg">
                <input type="text" class="S-text fl" value="请输入关键词搜索" style="color:#c4c4c4"/>
                <a href="allsearch.ftl"><input type="submit" class="S-submit size14 fl" value="搜索"></a>
            </div>
            <!--热词-->
            <div class="hot-words">
                <a href="allsearch.ftl">潮流男装</a> <a href="allsearch.ftl">2013连衣裙</a> <a href="allsearch.ftl">七夕礼物</a>
                <a href="allsearch.ftl">童装上新</a> <a href="allsearch.ftl">雪纺衫</a>
                <a href="allsearch.ftl">T恤</a><a href="allsearch.ftl">防晒衫</a> <a href="allsearch.ftl">休闲热裤</a>
            </div>
        </div>

    </div>
</div>
<!-- logo结束-->
<div class="clear"></div>
<!-- 导航开始-->
<div class="navBox">
    <div class="nav center">
        <!--商品分类-->
        <div class="classification fl">
            <div class="hd size14-b">商品分类</div>
        </div>
        <!--导航栏目-->
        <div class="bigNav fl">
            <ul>
                <li><a href="#">商城首页</a></li>
                <li><a href="#">品牌专区</a></li>
                <li><a href="#">特价专场</a></li>
                <li><a href="#">关于我们</a></li>
            </ul>
        </div>
        <!--购物车-->
        <div class="shopping-cart fr size14">购物车 ( <a href="user.ftl">0</a> ) 件</div>
    </div>
</div>
<!--导航结束-->
<div class="clear"></div>

<!--位置-->
<div class="user_here center">所在的位置：中国美博城 > 品牌搜索</div>

<!--搜索/单页-->
<div class="search_longly center">
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td width="100" valign="top">
                <div class="divright">品牌</div>
            </td>
            <td width="50" valign="top">
                <div class="divleft"><a href="#" class="checkOn">不限</a></div>
            </td>
            <td>
                <div class="the_goods_brand">
                    <a href="#">Metersbanwe/美特斯邦威</a>
                    <a href="#">Dickes/蒂克</a>
                    <a href="#">Nautica/诺帝卡</a>
                    <a href="#">AK series</a>
                    <a href="#">Sportica/斯波帝卡</a>
                    <a href="#">NQ/诺奇</a>
                    <a href="#">Kool/可乐</a>
                    <a href="#">Lihomme</a>
                </div>
                <div class="the_goods_brand">
                    <a href="#">Metersbanwe/美特斯邦威</a>
                    <a href="#">Dickes/蒂克</a>
                    <a href="#">Nautica/诺帝卡</a>
                    <a href="#">AK series</a>
                    <a href="#">Sportica/斯波帝卡</a>
                    <a href="#">NQ/诺奇</a>
                    <a href="#">Kool/可乐</a>
                    <a href="#">Lihomme</a>
                </div>

                <div class="chose"
                     style=" margin-top:10px; width:98.8%; height:auto; padding:5px 10px; border:1px solid #ffcc7f; background:#fffdee;">
                    <strong style="color:#999999;">大家都在说:</strong>&nbsp;
                    <a style="margin-right:8px;"><input type="checkbox" name="checkbox" value="checkbox"/>&nbsp;质量不错</a>


                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                            <td align="center" style="border-bottom:none;">
                                <button class="btn-jx2">确定</button>
                                <button class="btn-jx1">取消</button>
                            </td>
                        </tr>
                    </table>
                </div>


            </td>
            <td width="50" valign="top">
                <button class="oto_button oto_button_on">多选 +</button>
            </td>
        </tr>
        <tr>
            <td width="100" valign="top">
                <div class="divright">衣长</div>
            </td>
            <td width="50" valign="top">
                <div class="divleft"><a href="#" class="checkOn">不限</a></div>
            </td>
            <td>
                <div class="the_goods_brand">
                    <a href="#">短款</a>
                    <a href="#">中款</a>
                    <a href="#">长款</a>
                    <a href="#">常规</a>
                </div>


            </td>


            <td width="50" valign="top">
                <button class="oto_button">多选 +</button>
            </td>
        </tr>
        <tr>
            <td width="100" valign="top">
                <div class="divright">领型</div>
            </td>
            <td width="50" valign="top">
                <div class="divleft"><a href="#" class="checkOn">不限</a></div>
            </td>
            <td>
                <div class="the_goods_brand">
                    <a href="#">立领</a>
                    <a href="#">连帽/帽领</a>
                    <a href="#">可脱卸帽</a>
                    <a href="#">翻领</a>
                </div>
            </td>
            <td width="50" valign="top">
                <button class="oto_button">多选 +</button>
            </td>
        </tr>
        <tr>
            <td width="100" valign="top">
                <div class="divright">功能</div>
            </td>
            <td width="50" valign="top">
                <div class="divleft"><a href="#" class="checkOn">不限</a></div>
            </td>
            <td>
                <div class="the_goods_brand">
                    <a href="#">常规</a>
                    <a href="#">两面穿</a>
                    <a href="#">可脱卸领</a>
                    <a href="#">可脱卸袖</a>
                </div>
            </td>
            <td width="50" valign="top">
                <button class="oto_button">多选 +</button>
            </td>
        </tr>
        <tr>
            <td width="100" valign="top">
                <div class="divright">更多选项</div>
            </td>
            <td colspan="3">
                <select class="oto_select fl">
                    <option value="适合人群">适合人群</option>
                    <option value="少年/儿童">少年/儿童</option>
                    <option value="青年">青年</option>
                    <option value="中老年">中老年</option>
                    <option value="时尚E族">时尚E族</option>
                </select>

                <select class="oto_select oto_select_left_10 fl">
                    <option value="风格">风格</option>
                    <option value=""></option>
                    <option value=""></option>
                </select>

                <select class="oto_select oto_select_left_10 fl">
                    <option value="衣门襟">衣门襟</option>
                    <option value=""></option>
                    <option value=""></option>
                </select>

                <select class="oto_select oto_select_left_10 fl">
                    <option value="版型">版型</option>
                    <option value=""></option>
                    <option value=""></option>
                </select>

                <select class="oto_select oto_select_left_10 fl">
                    <option value="袖型">袖型</option>
                    <option value=""></option>
                    <option value=""></option>
                </select>

                <select class="oto_select oto_select_left_10 fl">
                    <option value="填充料">填充料</option>
                    <option value=""></option>
                    <option value=""></option>
                </select>
            </td>
        </tr>
        <tr>
            <td width="100" valign="top">
                <div class="divright">获取你还想找</div>
            </td>
            <td colspan="3">
                <div class="more_search">
                    <a href="#">男式羽绒服</a>
                    <a href="#">男式羽绒服</a>
                    <a href="#">男式羽绒服</a>
                    <a href="#">男式羽绒服</a>
                    <a href="#">男式羽绒服</a>
                </div>
            </td>
        </tr>
    </table>

</div>
<div class="center results_of_search">
    <div class="fr page_results">
        <strong class="color4">1</strong>/20
        <a href="#" class="btn-lt">&lt;</a>
        <a href="#" class="btn-lt">&gt;</a>

        <a href="#" class="btn-lt">产品</a>
        <a href="#" class="btn-lt">店铺</a>
    </div>

    <div class="results_list fl s_one">
        <ul>
            <li><a href="#" class="checkOn">默认</a></li>
            <li>最新</li>
        </ul>
    </div>
    <div class="results_list fl s_two">
        <ul>
            <li>价格</li>
            <li><input name="" type="text" value="￥" class="oto_text"/></li>
            <li style="width:18px"> -</li>
            <li><input name="" type="text" value="￥" class="oto_text"/></li>
            <li>确定</li>
            <li>清空</li>
        </ul>
    </div>
    <div class="results_list fl s_three">
        <ul>
            <li><a href="#" class="checkOn">全部</a></li>
            <li>易货</li>
            <li>店铺</li>
            <li>
                <label><span class="fl"><input name="" type="radio" value=""/></span>特价</label>
            </li>
            <li>
                <label><span class="fl"><input name="" type="radio" value=""/></span>抢购</label>
            </li>
            <li>
                <label><span class="fl"><input name="" type="radio" value=""/></span>新品</label>
            </li>
            <li>
                <label><span class="fl"><input name="" type="radio" value=""/></span>清仓</label>
            </li>

        </ul>
    </div>
</div>

<div class="ibody">
    <!--产品普通排列图-->
    <div class="shangpin_Box center">
        <ul>

            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110.jpg" width="200" height="200"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>

            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110_02.jpg" width="90" height="110"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>
            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110_03.jpg" width="90" height="110"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>
            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110_04.jpg" width="90" height="110"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>
            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110_05.jpg" width="90" height="110"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>
            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110_06.jpg" width="90" height="110"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>

            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110.jpg" width="200" height="200"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>

            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110_02.jpg" width="90" height="110"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>
            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110_03.jpg" width="90" height="110"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>
            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110_04.jpg" width="90" height="110"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>
            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110_05.jpg" width="90" height="110"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>
            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110_06.jpg" width="90" height="110"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>

            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110.jpg" width="200" height="200"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>

            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110_02.jpg" width="90" height="110"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>
            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110_03.jpg" width="90" height="110"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>
            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110_04.jpg" width="90" height="110"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>
            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110_05.jpg" width="90" height="110"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>
            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110_06.jpg" width="90" height="110"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>

            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110.jpg" width="200" height="200"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>

            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110_02.jpg" width="90" height="110"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>
            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110_03.jpg" width="90" height="110"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>
            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110_04.jpg" width="90" height="110"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>
            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110_05.jpg" width="90" height="110"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>
            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110_06.jpg" width="90" height="110"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>

            <li>
                <div class="padding10">
                    <p><img src="img/other/90X110.jpg" width="200" height="200"/></p>
                    <p class="color4 size20">￥399.00</p>
                    <p class="shangpin_Box_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
                    <p>店铺产品</p>
                    <p class="btn_buy">
                        <button class="shangpin_Box_button1">加入购物车</button>
                        <button class="shangpin_Box_button2">立即购买</button>
                    </p>
                </div>
            </li>
        </ul>
    </div>

    <div class="all_page center">
        <a href="#">上一页</a>
        <a href="#"> 1 </a>
        <a href="#"> 2 </a>
        <a href="#"> 3 </a>
        <a href="#"> ... </a>
        <a href="#"> 10 </a>
        <a href="#">下一页</a>
    </div>

    <!--热卖商品-->
    <div class="remai_goods center">
        <div class="remai_goods_title">热卖商品</div>
        <ul>
            <li>
                <p><img src="img/other/90X110.jpg" width="160" height="160"/></p>
                <p><span class="color4 size14-b">￥399.00</span>&nbsp;&nbsp;<del>￥258.00</del>
                </p>
                <p class="remai_goods_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
            </li>
            <li>
                <p><img src="img/other/90X110.jpg" width="160" height="160"/></p>
                <p><span class="color4 size14-b">￥399.00</span>&nbsp;&nbsp;<del>￥258.00</del>
                </p>
                <p class="remai_goods_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
            </li>
            <li>
                <p><img src="img/other/90X110.jpg" width="160" height="160"/></p>
                <p><span class="color4 size14-b">￥399.00</span>&nbsp;&nbsp;<del>￥258.00</del>
                </p>
                <p class="remai_goods_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
            </li>
            <li>
                <p><img src="img/other/90X110.jpg" width="160" height="160"/></p>
                <p><span class="color4 size14-b">￥399.00</span>&nbsp;&nbsp;<del>￥258.00</del>
                </p>
                <p class="remai_goods_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
            </li>
            <li>
                <p><img src="img/other/90X110.jpg" width="160" height="160"/></p>
                <p><span class="color4 size14-b">￥399.00</span>&nbsp;&nbsp;<del>￥258.00</del>
                </p>
                <p class="remai_goods_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
            </li>
            <li>
                <p><img src="img/other/90X110.jpg" width="160" height="160"/></p>
                <p><span class="color4 size14-b">￥399.00</span>&nbsp;&nbsp;<del>￥258.00</del>
                </p>
                <p class="remai_goods_text"><a href="payfor.ftl">本产品标题，请自行设置并发布请自行设置并发布...</a></p>
            </li>
        </ul>
    </div>

    <div class="clear" style="height:30px"></div>

</div>

<!--底部导航-->

<div class="footerLink">
    <div class="footerLink_ul center">
        <ul>
            <h2>关于美博</h2>
            <li><a href="oto-about.ftl">关于我们</a></li>
            <li><a href="oto-zxns.ftl">招贤纳士</a></li>
        </ul>
        <ul>
            <h2>购物指南</h2>
            <li><a href="oto-help.ftl#gwlc">购物流程</a></li>
            <li><a href="oto-help.ftl#hyjs">会员介绍</a></li>
            <li><a href="oto-help.ftl#cjwt">常见问题</a></li>
            <li><a href="oto-help.ftl#lxkf">联系客服</a></li>
        </ul>
        <ul>
            <h2>配送方式</h2>
            <li><a href="oto-help.ftl#smzt">上门自提</a></li>
            <li><a href="oto-help.ftl#xssd">限时送达</a></li>
            <li><a href="oto-help.ftl#psfwcx">配送服务查询</a></li>
        </ul>
        <ul>
            <h2>支付方式</h2>
            <li><a href="oto-help.ftl#hdfk">货到付款</a></li>
            <li><a href="oto-help.ftl#zxzf">在线支付</a></li>
            <li><a href="oto-help.ftl#xrfk">新人付款</a></li>
        </ul>
        <ul>
            <h2>新手上路</h2>
            <li><a href="oto-help.ftl#xszq">新手专区</a></li>
            <li><a href="oto-help.ftl#jyaq">交易安全</a></li>
            <li><a href="oto-help.ftl#xfjs">消费警示 </a></li>
            <li><a href="oto-help.ftl#xszc">新手注册</a></li>
            <li><a href="oto-help.ftl#xsxt">新手学堂</a></li>
            <li><a href="oto-help.ftl#ywbd">24小时有问必答</a></li>
        </ul>
        <ul>
            <h2>消费者保障</h2>
            <li><a href="oto-help.ftl#bzfw">保障范围</a></li>
            <li><a href="oto-help.ftl#thtklc">退货退款流程</a></li>
            <li><a href="oto-help.ftl#wyfqwq">我要发起维权</a></li>
            <li><a href="oto-help.ftl#gdtsfw">更多特色服务</a></li>
            <li><a href="oto-help.ftl#fwzx">服务中心</a></li>
        </ul>
    </div>
</div>

<div class="footer center">
    <p class="footer-nav">
        <a href="oto-about.ftl">关于我们</a> | <a href="oto-mztk.ftl">免责条款</a> |
        <a href="oto-yqlj.ftl">友情链接</a> | <a href="oto-lxwm.ftl">联系我们</a>
    </p>
    <p>
        Copyright©2009-2014 中国美博城 All Rights Reserved<br/>
        中国美博城 安徽省合肥市居巢区 联系电话：（86）0551-123456789<br/>
        皖ICP备012344578号
    </p>
</div>
</body>
</html>