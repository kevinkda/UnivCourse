$("li:eq(0)").hover(function () {
    $("#ul-li").slideDown('fast');
}).mouseleave(function () {
    $("#ul-li").slideUp('fast');
});
