// JavaScript Document

function ToggleMenu(obj, content) {
    obj.hover(function () {
        content.show()
        obj.addClass("showmenu")
    }, function () {
        content.hide()
        obj.removeClass("showmenu")
    })
}

/* ��ҳ��ർ�� */
function SNmenuNav() {
    $$$("#SNmenuNav dl").hover(function () {
        $$$(this).find("dt a").addClass("on");
        //alert("leepg");
        $$$(this).find("dd").show();
        $$$(this).find("dt b").hide();
    }, function () {
        $$$(this).find("dt a").removeClass("on");
        $$$(this).find("dd").hide();
        $$$(this).find("dt b").show();
    })
}

$$$(function () {
    ToggleMenu($$$("#menuTree"), $$$("#SNmenuNav"));
    //alert($$$("#SNmenuNav"));
    SNmenuNav();
    /*
        SNTabFlash();
        SNpromArea();
        SNTabchange("SNpromAnnMain","SNpromAnn");
        SNexpress();
        SNgroupScroll();
        SearchFocus()
        onlineserver($$$("#onlinefloat"));
        SNrankingTop("SNrankTop01","SNTop01");
        SNrankingTop("SNrankTop02","SNTop02");
        SNrankingTop("SNrankTop03","SNTop03");
        SNrankingTop("SNrankTop04","SNTop04");
        // function lazyload(option){var settings={defObj:null,defHeight:0};settings=$$$.extend(settings,option||{});var defHeight=settings.defHeight,defObj=(typeof settings.defObj=="object")?settings.defObj.find("img"):$$$(settings.defObj).find("img");var pageTop=function(){var d=document,y=(navigator.userAgent.toLowerCase().match(/iPad/i)=="ipad")?window.pageYOffset:Math.max(d.documentElement.scrollTop,d.body.scrollTop);return d.documentElement.clientHeight+y-settings.defHeight};var imgLoad=function(){defObj.each(function(){if($$$(this).offset().top<=pageTop()){var src2=$$$(this).attr("src2");if(src2){$$$(this).attr("src",src2).removeAttr("src2")}}})};$$$(window).bind("scroll",function(){imgLoad()})};
        lazyload({defObj:"#snfoor01"});
        lazyload({defObj:"#snfoor02"});
        lazyload({defObj:"#snfoor03"});
        lazyload({defObj:"#snfoor04"});
        lazyload({defObj:"#snfoor05"});
        lazyload({defObj:"#snfoor06"});
        lazyload({defObj:"#snfoor07"});
        lazyload({defObj:".ad80"});
    */
})