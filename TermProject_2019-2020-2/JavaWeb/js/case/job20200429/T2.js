$(function () {
    $(".caseName").hover(function () {
        let caseName = $(".caseName").index($(this));
        $(".info:eq(" + caseName + ")").prop("style", "display:block");
    }, function () {
        $(".info").prop("style", "display:none");
    });
})
