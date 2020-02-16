/*
 * Copyright (c) Kevin KDA 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

$(function () {
    $("input[value='-']").click(function () {
        var $value = $(this).next().val();
        $value = ($value - 1 < 1) ? 1 : $value - 1;
        $(this).next().val($value);
        calc($value, $(this));
    });
    $("input[value='+']").click(function () {
        var $value = $(this).prev().val();
        $value = parseInt($value) + 1;
        $(this).prev().val($value);
        calc($value, $(this));
    });
    $(":text").blur(function () {
        var $value = parseInt($(this).val());
        calc($value, $(this));
    });
});

//计算当前商品小计价格
function calc(val, obj) {
    var $p = obj.parent().find("span").eq(0).text();
    $p = $p.substr(1);
    var $allP = val * $p;
    obj.parent().find("span").eq(1).text("￥" + $allP.toFixed(2));
}