$(function () {
    //编写jQuery代码
    let oldcolor = "";
    $("#table-photo tr td:not(:first)").mouseover(function () {
        let index = $(this).index();
        oldcolor = $(this).css("background-color");
        $(this).css("background-color", "pink");
        // console.log("../../img/job20200412/photo" + (index + 1) + ".jpg");
        $("#photo").attr("src", "../../img/job20200412/photo" + (index + 1) + ".jpg");
    }).mouseout(function () {
        $(this).css("background-color", oldcolor);
    })
})