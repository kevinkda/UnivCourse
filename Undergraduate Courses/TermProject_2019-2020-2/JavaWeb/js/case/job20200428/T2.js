// fadeIn的操作
$("#btn1").click(function () {
    if ($(this).val() === 'div1-fadeIn') {
        $("#div1").fadeIn(1000);
        $(this).val('div1-fadeOut');
    } else {
        $("#div1").fadeOut(1000);
        $(this).val('div1-fadeIn');
    }
});
//show的操作
$("#btn2").click(function () {
    if ($(this).val() === 'div2-hide') {
        $("#div2").hide(1000);
        $(this).val('div2-show');
    } else {
        $("#div2").show(1000);
        $(this).val('div2-hide');
    }
});
//toggle的操作
$("#btn3").click(function () {
    if ($(this).val() === 'div3-toggle') {
        $("#div3").toggle(1000);
        $(this).val('div3-toggle');
    } else {
        $("#div3").toggle(1000);
        $(this).val('div3-toggle');
    }
});
