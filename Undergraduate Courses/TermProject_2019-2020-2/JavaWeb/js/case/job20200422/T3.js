$(function () {
    $("#show-hidden").click(function () {
        // console.log($("#container").hide());
        if ($("#word-body-wrapper").is(":hidden")) {
            $("#word-body-wrapper").show();
            $("#container").css("height", "160");
        } else {
            $("#word-body-wrapper").hide();
            $("#container").css("height", "50");
        }
    });
});
