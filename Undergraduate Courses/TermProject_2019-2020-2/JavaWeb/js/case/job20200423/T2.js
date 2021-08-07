let imgIndex = 2;
$(function () {
    $("#table-photo").attr("src", "../../img/job20200412/photo1.jpg");
    //编写jQuery代码
    let oldcolor = "";
    $("#table-photo tr td:not(:first)").mouseover(function () {
        let index = $(this).index();
        oldcolor = $(this).css("background-color");
        $(this).css("background-color", "pink");
        $("#photo").prop("src", "../../img/job20200412/photo" + (index + 1) + ".jpg");
        imgIndex = (index + 1);
    }).mouseout(function () {
        $(this).css("background-color", oldcolor);
    })
});

window.onload = setInterval(function () {
    $("#photo").prop("src", "../../img/job20200412/photo" + imgIndex + ".jpg");
    if (imgIndex >= 1 && imgIndex < 4) {
        imgIndex++;
    } else {
        imgIndex = 1;
    }
}, 3000);
