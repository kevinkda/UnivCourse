let timerA = null;
let playerA = new Array();
$(function () {
    $(".box").each(function () {
        playerA.push(1);
    })
    $(".btn").click(function () {
        let $index = $(".btn").index($(this)) + 1;
        if ($(".btn:eq(" + ($index - 1) + ")").val() === '播放') {
            $(".btn").each(function (i) {
                $(this).val('播放');
                clearInterval(timerA);
            });
            $(this).val('暂停');
            timerA = setInterval(function () {
                workA($index - 1);
            }, 50)
        } else {
            $(this).val('播放');
            clearInterval(timerA);
        }
    });
});

function workA(index) {
    let str;
    str = 'rotate(' + playerA[index] + 'deg)';
    $("#img-" + (index + 1))[0].style.webkitTransform = str;
    playerA[index]++;
}
