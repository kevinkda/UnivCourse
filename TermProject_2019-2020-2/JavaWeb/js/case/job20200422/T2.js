$(function () {
    $("p").css("font-size", "16px");
    $("span").css("color", "#ff0000");
    $("p:first").css("color", "#ffff00");
    $("a:nth-child(1)").css("text-decoration", "none");
    $("a:nth-child(2)").css("text-decoration", "none");
    let $a = $("a:last");
    $a.css("text-decoration", "underline");
    $a.click(function () {
        if ($("p:nth-child(6)").css("overflow") === 'hidden') {
            $("p:nth-child(6)").css("overflow", "visible");
            $("p:nth-child(6)").css("-webkit-box-orient", "unset");
            $a.html("less...");
        } else {
            $("p:nth-child(6)").css("overflow", "hidden");
            $("p:nth-child(6)").css("-webkit-box-orient", "vertical");
            $a.html("more...");
        }
    })
});
